package dev.lchang.appue.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.lchang.appue.presentation.auth.LoginScreen
import dev.lchang.appue.presentation.auth.RegisterScreen
import dev.lchang.appue.presentation.home.HomeScreen
import dev.lchang.appue.presentation.permissions.GalleryPermissionsScreen


@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "home"){

        composable("register") { RegisterScreen(navController) }
        composable ("login") { LoginScreen(navController) }

        composable ("home") {
            DrawerScaffold(navController) {
                HomeScreen()
            }
        }

        composable ("permissions") {
            DrawerScaffold(navController) {
                GalleryPermissionsScreen()
            }
        }

        composable ("favoritos") {
            DrawerScaffold(navController) {
                Text("Pantalla de favoritos proximamente")
            }
        }


    }
}