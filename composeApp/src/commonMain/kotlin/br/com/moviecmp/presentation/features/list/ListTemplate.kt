package br.com.moviecmp.presentation.features.list

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.moviecmp.domain.entity.Movie
import br.com.moviecmp.presentation.components.MovieSection
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun ListTemplate() {
    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues = paddingValues),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            item {
                MovieSection(
                    title = "Popular Movies",
                    movies = List(10) {
                        Movie(
                            id = 1000,
                            title = "Minecraft Movie $it",
                            overview = "10",
                            posterUrl = ""
                        )
                    }
                )
            }

            item {
                MovieSection(
                    title = "Top rated",
                    movies = List(10) {
                        Movie(
                            id = 1000,
                            title = "Minecraft Movie $it",
                            overview = "10",
                            posterUrl = ""
                        )
                    }
                )
            }

            item {
                MovieSection(
                    title = "Upcoming movies",
                    movies = List(10) {
                        Movie(
                            id = 1000,
                            title = "Minecraft Movie $it",
                            overview = "10",
                            posterUrl = ""
                        )
                    }
                )
            }
        }
    }
}

@Preview
@Composable
private fun ListTemplatePreview() {
    ListTemplate()
}