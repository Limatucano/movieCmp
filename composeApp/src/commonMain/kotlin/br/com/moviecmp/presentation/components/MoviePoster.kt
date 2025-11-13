package br.com.moviecmp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.moviecmp.domain.entity.Movie
import moviecmp.composeapp.generated.resources.Res
import moviecmp.composeapp.generated.resources.minecraft_movie
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun MoviePoster(
    modifier: Modifier = Modifier,
    movie: Movie,
) {
    Column(
        modifier = modifier
            .wrapContentSize()
    ) {
        Card(
            modifier = Modifier
                .size(
                    height = 178.dp,
                    width = 120.dp
                ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop,
                painter =  painterResource(Res.drawable.minecraft_movie),
                contentDescription = movie.title
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            modifier = Modifier,
            text = movie.title,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
private fun MoviePosterPreview() {
    MoviePoster(
        movie = Movie(
            id = 1000,
            title = "Minecraft Movie",
            overview = "10",
            posterUrl = ""
        ),
    )
}