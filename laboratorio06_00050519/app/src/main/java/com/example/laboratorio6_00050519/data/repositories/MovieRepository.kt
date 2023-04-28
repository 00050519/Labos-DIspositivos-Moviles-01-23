package com.example.laboratorio6_00050519.data.repositories

import com.example.laboratorio6_00050519.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>){

    fun getMovies() = movies

    fun addMovies(movie: MovieModel) = movies.add(movie)
}