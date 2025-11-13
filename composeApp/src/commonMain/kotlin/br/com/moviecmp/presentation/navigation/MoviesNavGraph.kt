package br.com.moviecmp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.moviecmp.presentation.features.list.ListScreen

@Composable
fun MoviesNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = MoviesRoutes.List
    ) {
        composable<MoviesRoutes.List> {
            ListScreen()
        }
        composable<MoviesRoutes.Detail> {

        }
    }
}