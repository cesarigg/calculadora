package com.okana.calculadora.Onboarding

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.okana.calculadora.Greeting

    @Composable
    fun OnboardingNavGraph(navController: NavHostController) {
        NavHost(navController, startDestination = "screen_one") {
            composable("screen_one") {
                OnboardingFirstScreen (onContinueClicked = {navController.navigate("screen_two")})
            }
            composable("screen_two") {
                OnboardingSecondScreen(onContinueClicked = {navController.navigate("greeting")})
            }
            composable("greeting") {
                Greeting(
                    name = "Android",
                    //modifier = Modifier.padding(innerPadding)
                )
            }

        }
    }