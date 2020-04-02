package com.cyberinsane.movietime.api

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var req = chain.request()
        val url =
            req.url().newBuilder().addQueryParameter("api_key", "3298880137172cea814f46805f3df4fe")
                .build()
        req = req.newBuilder().url(url).build()
        return chain.proceed(req)
    }
}