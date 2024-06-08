package com.smartherd.navigationbasicpractice.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.smartherd.navigationbasicpractice.DETAIL_ARGUMENT_KEY
import com.smartherd.navigationbasicpractice.DETAIL_ARGUMENT_KEY2
import com.smartherd.navigationbasicpractice.DetailScreen
import com.smartherd.navigationbasicpractice.HomeScreen
import com.smartherd.navigationbasicpractice.Screens

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.HomeScreen.route) {

        composable(Screens.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(
            Screens.DetailScreen.route,
            arguments = listOf(navArgument(DETAIL_ARGUMENT_KEY) {
                type = NavType.IntType
            }, navArgument(DETAIL_ARGUMENT_KEY2) {
                type = NavType.StringType
            }),
        ) {
            Log.d("Harsh", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Harsh", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController)
        }

    }


}