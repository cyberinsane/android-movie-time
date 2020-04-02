package com.cyberinsane.movietime

import android.app.Application
import com.cyberinsane.movietime.di.networkModule
import com.cyberinsane.movietime.di.repositoryModule
import com.cyberinsane.movietime.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MovieTimeApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize Koin
        startKoin {
            androidLogger()
            androidContext(this@MovieTimeApplication)
            modules(listOf(repositoryModule, viewModelModule, networkModule))
        }
    }
}