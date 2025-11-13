package br.com.moviecmp.presentation.navigation

import kotlinx.serialization.Serializable

sealed interface MoviesRoutes {
    @Serializable
    data object List : MoviesRoutes
    @Serializable
    data class Detail(val id: Int) : MoviesRoutes
}