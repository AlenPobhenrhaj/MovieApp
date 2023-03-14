package com.example.movieapp.screens.details

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.movieapp.MovieRow
import com.example.movieapp.model.Movie
import com.example.movieapp.model.getMovies


@ExperimentalAnimationApi
@Composable
fun DetailsScreen(
    navController: NavController,
    movieId: String?
) {

    val newMovieList = getMovies().filter { movie ->
        movie.id == movieId
    }

    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color.Transparent,
            elevation = 0.dp
        ) {
            Row(horizontalArrangement = Arrangement.Start) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })

                Spacer(modifier = Modifier.width(100.dp))

                Text(text = "Detail")
            }
        }
    }) {
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxHeight()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                MovieRow(movie = newMovieList.first())
                Spacer(modifier = Modifier.height(8.dp))
                Divider()
                Text(text = "Movie Images")
                HorizontalGridImageView(newMovieList)
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun HorizontalGridImageView(newMovieList: List<Movie>) {
    val images = newMovieList.first().images
    if (images.isEmpty()) {
        Text(text = "No images available")
    } else {
        LazyVerticalGrid(
            cells = GridCells.Adaptive(minSize = 120.dp),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(images) { image ->
                Card(
                    modifier = Modifier.size(120.dp),
                    elevation = 5.dp
                ) {
                    Image(
                        painter = rememberImagePainter(data = image),
                        contentDescription = "Movie Poster",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

