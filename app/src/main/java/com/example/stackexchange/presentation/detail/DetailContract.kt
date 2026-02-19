package com.example.stackexchange.presentation.detail

import com.example.stackexchange.data.model.User
import com.example.stackexchange.presentation.base.UiEffect
import com.example.stackexchange.presentation.base.UiIntent
import com.example.stackexchange.presentation.base.UiState

sealed class DetailIntent : UiIntent

data class DetailState(
    val user: User? = null,
    val isLoading: Boolean = true,
    val error: String? = null
) : UiState

sealed class DetailEffect : UiEffect
