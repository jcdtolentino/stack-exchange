package com.example.stackexchange.presentation.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.stackexchange.data.model.User
import com.example.stackexchange.presentation.components.atoms.AppButton
import com.example.stackexchange.presentation.components.atoms.AppTextField
import com.example.stackexchange.presentation.components.atoms.AppTopBar
import com.example.stackexchange.presentation.components.molecules.ErrorState
import com.example.stackexchange.presentation.components.molecules.LoadingState
import com.example.stackexchange.presentation.components.molecules.UserListItem
import com.example.stackexchange.ui.theme.Padding
import com.example.stackexchange.ui.theme.Spacing

@Composable
fun SearchScreen(
    onUserClick: (User) -> Unit,
    viewModel: SearchViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    Scaffold(
        topBar = {
            AppTopBar(title = "StackExchange Users")
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = Padding.screen)
        ) {
            Spacer(modifier = Modifier.height(Spacing.md))
            AppTextField(
                value = state.query,
                onValueChange = { viewModel.handleIntent(SearchIntent.UpdateQuery(it)) },
                label = "Search users",
                leadingIcon = Icons.Filled.Search
            )
            Spacer(modifier = Modifier.height(Spacing.sm))
            AppButton(
                text = "Search",
                onClick = { viewModel.handleIntent(SearchIntent.Search) },
                isLoading = state.isLoading,
                icon = Icons.Filled.Search,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(Spacing.md))

            val currentState = state
            when {
                currentState.isLoading -> {
                    LoadingState()
                }
                currentState.error != null -> {
                    ErrorState(message = currentState.error)
                }
                else -> {
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(Spacing.sm)
                    ) {
                        items(state.users, key = { it.userId }) { user ->
                            UserListItem(
                                user = user,
                                onClick = { onUserClick(user) }
                            )
                        }
                    }
                }
            }
        }
    }
}
