package com.example.stackexchange.data.api

import com.example.stackexchange.data.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface StackExchangeApiService {

    @GET("2.3/users")
    suspend fun searchUsers(
        @Query("inname") name: String? = null,
        @Query("site") site: String = "stackoverflow",
        @Query("sort") sort: String = "name",
        @Query("order") order: String = "asc",
        @Query("pagesize") pageSize: Int = 20
    ): Response<UserResponse>
}

object StackExchangeApiConstants {
    const val BASE_URL = "https://api.stackexchange.com/"
}
