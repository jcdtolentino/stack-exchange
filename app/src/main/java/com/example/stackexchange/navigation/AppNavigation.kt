package com.example.stackexchange.navigation

import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.stackexchange.data.model.User
import com.example.stackexchange.presentation.detail.UserDetailScreen
import com.example.stackexchange.presentation.search.SearchScreen
import com.squareup.moshi.Moshi

@Composable
fun AppNavigation(moshi: Moshi) {
    val navController = rememberNavController()
    val userAdapter = moshi.adapter(User::class.java)

    NavHost(
        navController = navController,
        startDestination = Screen.Search.route
    ) {
        composable(Screen.Search.route) {
            SearchScreen(
                onUserClick = { user ->
                    val userJson = userAdapter.toJson(user)
                    val encoded = Uri.encode(userJson)
                    navController.navigate(Screen.Detail.createRoute(encoded))
                }
            )
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument("userJson") { type = NavType.StringType }
            )
        ) {
            UserDetailScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
