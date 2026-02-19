package com.example.stackexchange.presentation.detail

import androidx.lifecycle.SavedStateHandle
import com.example.stackexchange.data.model.User
import com.example.stackexchange.presentation.base.BaseViewModel
import com.squareup.moshi.Moshi
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    moshi: Moshi
) : BaseViewModel<DetailIntent, DetailState, DetailEffect>() {

    override fun createInitialState(): DetailState = DetailState()

    init {
        val userJson = savedStateHandle.get<String>("userJson")
        if (userJson != null) {
            try {
                val adapter = moshi.adapter(User::class.java)
                val user = adapter.fromJson(userJson)
                setState { copy(user = user, isLoading = false) }
            } catch (e: Exception) {
                setState { copy(error = "Failed to load user details", isLoading = false) }
            }
        } else {
            setState { copy(error = "No user data provided", isLoading = false) }
        }
    }

    override fun handleIntent(intent: DetailIntent) {
        // Read-only screen, no intents to handle
    }
}
