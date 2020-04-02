package com.cyberinsane.movietime.api

import com.cyberinsane.movietime.model.TrendingResult
import retrofit2.http.GET

interface MovieService {

    @GET("/3/trending/all/day")
    suspend fun getTrending() : TrendingResult

}