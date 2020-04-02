package com.cyberinsane.movietime.model

import com.google.gson.annotations.SerializedName

data class TrendingResult(
    @SerializedName("results")
    val results: List<Movie>? = null
)