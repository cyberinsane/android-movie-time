package com.cyberinsane.movietime.di

import com.cyberinsane.movietime.repository.MovieRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { MovieRepository(get()) }
}