package com.example.stackexchange.presentation.search

import com.example.stackexchange.data.api.StackExchangeApiService
import com.example.stackexchange.data.model.User
import com.example.stackexchange.data.model.UserResponse
import com.example.stackexchange.data.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import retrofit2.Response

@OptIn(ExperimentalCoroutinesApi::class)
class SearchViewModelTest {

    private val testDispatcher = UnconfinedTestDispatcher()

    private val fakeUsers = listOf(
        User(
            userId = 1,
            displayName = "John Doe",
            reputation = 1000,
            profileImage = null,
            location = "New York",
            creationDate = 1_000_000L,
            link = null
        ),
        User(
            userId = 2,
            displayName = "Jane Smith",
            reputation = 2500,
            profileImage = null,
            location = "London",
            creationDate = 2_000_000L,
            link = null
        )
    )

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    private fun createFakeApi(
        result: Response<UserResponse> = Response.success(
            UserResponse(items = fakeUsers, hasMore = false, quotaMax = 300, quotaRemaining = 299)
        )
    ): StackExchangeApiService {
        return object : StackExchangeApiService {
            override suspend fun searchUsers(
                name: String?,
                site: String,
                sort: String,
                order: String,
                pageSize: Int
            ): Response<UserResponse> = result
        }
    }

    @Test
    fun `initial load populates users`() = runTest {
        val viewModel = SearchViewModel(UserRepository(createFakeApi()))

        val state = viewModel.state.value
        assertEquals(fakeUsers, state.users)
        assertFalse(state.isLoading)
        assertNull(state.error)
    }

    @Test
    fun `UpdateQuery intent updates query in state`() = runTest {
        val viewModel = SearchViewModel(UserRepository(createFakeApi()))

        viewModel.handleIntent(SearchIntent.UpdateQuery("kotlin"))

        assertEquals("kotlin", viewModel.state.value.query)
    }

    @Test
    fun `search with empty result shows error message`() = runTest {
        val emptyApi = createFakeApi(
            Response.success(
                UserResponse(items = emptyList(), hasMore = false, quotaMax = 300, quotaRemaining = 299)
            )
        )
        val viewModel = SearchViewModel(UserRepository(emptyApi))

        assertEquals("No users found", viewModel.state.value.error)
        assertTrue(viewModel.state.value.users.isEmpty())
    }

    @Test
    fun `api failure sets error state`() = runTest {
        val failingApi = object : StackExchangeApiService {
            override suspend fun searchUsers(
                name: String?,
                site: String,
                sort: String,
                order: String,
                pageSize: Int
            ): Response<UserResponse> {
                throw RuntimeException("Network error")
            }
        }
        val viewModel = SearchViewModel(UserRepository(failingApi))

        val state = viewModel.state.value
        assertFalse(state.isLoading)
        assertEquals("Network error", state.error)
    }
}
