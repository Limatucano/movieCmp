package br.com.moviecmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import br.com.moviecmp.presentation.navigation.MoviesNavGraph

@Composable
fun App() {
    MaterialTheme {
        MoviesNavGraph(
            navController = rememberNavController()
        )
    }
}