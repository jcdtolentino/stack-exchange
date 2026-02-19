package com.example.stackexchange.navigation

sealed class Screen(val route: String) {
    data object Search : Screen("search")
    data object Detail : Screen("detail/{userJson}") {
        fun createRoute(userJson: String): String = "detail/$userJson"
    }
}
