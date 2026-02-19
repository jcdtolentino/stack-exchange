package com.example.stackexchange.data.repository

import com.example.stackexchange.data.api.StackExchangeApiService
import com.example.stackexchange.data.model.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val apiService: StackExchangeApiService
) {

    suspend fun getUsers(name: String? = null): Result<List<User>> {
        return try {
            val response = apiService.searchUsers(name = name)
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    Result.success(body.items)
                } else {
                    Result.failure(Exception("Empty response body"))
                }
            } else {
                Result.failure(Exception("API error: ${response.code()} ${response.message()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
