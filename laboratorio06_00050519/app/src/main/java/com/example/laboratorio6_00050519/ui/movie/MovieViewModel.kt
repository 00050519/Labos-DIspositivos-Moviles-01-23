package com.example.laboratorio6_00050519.ui.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio6_00050519.MovieReviewerApplication
import com.example.laboratorio6_00050519.data.model.MovieModel
import com.example.laboratorio6_00050519.data.repositories.MovieRepository

class MovieViewModel(private val repository: MovieRepository) : ViewModel(){

    fun getMovies() = repository.getMovies()
    fun addMovies(movie: MovieModel) = repository.addMovies(movie)

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerApplication
                MovieViewModel(app.movieRepository)
            }
        }
    }

}