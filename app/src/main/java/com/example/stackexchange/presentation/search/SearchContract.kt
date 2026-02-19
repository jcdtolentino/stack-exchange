package com.example.stackexchange.presentation.search

import com.example.stackexchange.data.model.User
import com.example.stackexchange.presentation.base.UiEffect
import com.example.stackexchange.presentation.base.UiIntent
import com.example.stackexchange.presentation.base.UiState

sealed class SearchIntent : UiIntent {
    data class UpdateQuery(val query: String) : SearchIntent()
    data object Search : SearchIntent()
}

data class SearchState(
    val query: String = "",
    val users: List<User> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
) : UiState

sealed class SearchEffect : UiEffect {
    data class ShowError(val message: String) : SearchEffect()
}
