package com.cyberinsane.movietime.ui.home.state

import com.cyberinsane.movietime.model.Movie

data class HomeViewState(
    var trendingMovies: List<Movie>? = null
)