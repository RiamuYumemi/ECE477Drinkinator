package com.example.bletutorial.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(
    onBluetoothStateChanged:()->Unit
) {

    val NavController = rememberNavController()

    NavHost(navController = NavController, startDestination = Screen.StartScreen.route) {
        composable(Screen.StartScreen.route) {
            StartScreen(navController = NavController)
        }

        composable(Screen.ParameterScreen.route) {
            ParameterScreen(
                onBluetoothStateChanged
            )
        }
    }
}

sealed class Screen(val route:String) {
    object StartScreen:Screen("start_screen")
    object ParameterScreen:Screen("parameter_screen")
}