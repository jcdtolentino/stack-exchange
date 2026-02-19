package com.example.stackexchange.presentation.search

import androidx.lifecycle.viewModelScope
import com.example.stackexchange.data.repository.UserRepository
import com.example.stackexchange.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val userRepository: UserRepository
) : BaseViewModel<SearchIntent, SearchState, SearchEffect>() {

    override fun createInitialState(): SearchState = SearchState()

    init {
        loadUsers()
    }

    override fun handleIntent(intent: SearchIntent) {
        when (intent) {
            is SearchIntent.UpdateQuery -> {
                setState { copy(query = intent.query, error = null) }
            }
            is SearchIntent.Search -> {
                val query = state.value.query.trim()
                loadUsers(query.ifBlank { null })
            }
        }
    }

    private fun loadUsers(name: String? = null) {
        viewModelScope.launch {
            setState { copy(isLoading = true, error = null) }
            userRepository.getUsers(name)
                .onSuccess { users ->
                    setState {
                        copy(
                            users = users,
                            isLoading = false,
                            error = if (users.isEmpty()) "No users found" else null
                        )
                    }
                }
                .onFailure { exception ->
                    setState {
                        copy(
                            isLoading = false,
                            error = exception.message ?: "An error occurred"
                        )
                    }
                    sendEffect(SearchEffect.ShowError(exception.message ?: "An error occurred"))
                }
        }
    }
}
