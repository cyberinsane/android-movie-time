package com.cyberinsane.movietime.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("video")
    val video: Boolean? = null,
    @SerializedName("vote_count")
    val voteCount: Int? = null,
    @SerializedName("vote_average")
    val voteAverage: Float? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("release_date")
    val releaseDate: String? = null,
    @SerializedName("original_language")
    val originalLanguage: String? = null,
    @SerializedName("original_title")
    val originalTitle: String? = null,
    @SerializedName("genre_ids")
    val genreIds: List<Int?>? = null,
    @SerializedName("backdrop_path")
    val backdropPath: String? = null,
    @SerializedName("adult")
    val adult: Boolean? = null,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("popularity")
    val popularity: Double? = null,
    @SerializedName("media_type")
    val mediaType: String? = null,
    @SerializedName("original_name")
    val originalName: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("first_air_date")
    val firstAirDate: String? = null,
    @SerializedName("origin_country")
    val originCountry: List<String?>? = null
)