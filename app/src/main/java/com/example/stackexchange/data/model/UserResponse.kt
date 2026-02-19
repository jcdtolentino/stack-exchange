package com.example.stackexchange.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserResponse(
    @Json(name = "items") val items: List<User>,
    @Json(name = "has_more") val hasMore: Boolean,
    @Json(name = "quota_max") val quotaMax: Int,
    @Json(name = "quota_remaining") val quotaRemaining: Int
)

@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "user_id") val userId: Long,
    @Json(name = "display_name") val displayName: String,
    @Json(name = "reputation") val reputation: Int,
    @Json(name = "profile_image") val profileImage: String? = null,
    @Json(name = "location") val location: String? = null,
    @Json(name = "creation_date") val creationDate: Long,
    @Json(name = "link") val link: String? = null
)
