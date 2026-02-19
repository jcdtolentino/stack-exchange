package com.example.stackexchange.presentation.detail

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.stackexchange.presentation.components.atoms.AppTopBar
import com.example.stackexchange.presentation.components.molecules.ErrorState
import com.example.stackexchange.presentation.components.molecules.LoadingState
import com.example.stackexchange.presentation.components.molecules.UserDetailHeader
import com.example.stackexchange.ui.theme.Padding

@Composable
fun UserDetailScreen(
    onBackClick: () -> Unit,
    viewModel: DetailViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    Scaffold(
        topBar = {
            AppTopBar(
                title = "User Details",
                onBackClick = onBackClick
            )
        }
    ) { paddingValues ->
        val currentState = state
        when {
            currentState.isLoading -> {
                LoadingState()
            }
            currentState.error != null -> {
                ErrorState(message = currentState.error)
            }
            currentState.user != null -> {
                UserDetailHeader(
                    user = currentState.user,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .padding(Padding.screen)
                )
            }
        }
    }
}
