package com.cyberinsane.movietime.repository

import com.cyberinsane.movietime.api.MovieService

class MovieRepository(private val movieService: MovieService) {
    suspend fun getTrendingMovies() = movieService.getTrending()
}