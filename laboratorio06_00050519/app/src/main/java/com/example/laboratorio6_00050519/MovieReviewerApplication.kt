package com.example.laboratorio6_00050519

import android.app.Application
import com.example.laboratorio6_00050519.data.movies
import com.example.laboratorio6_00050519.data.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}