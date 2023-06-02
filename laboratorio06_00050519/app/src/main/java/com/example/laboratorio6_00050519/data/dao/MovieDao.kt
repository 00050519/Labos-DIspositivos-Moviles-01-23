package com.example.laboratorio6_00050519.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.laboratorio6_00050519.data.model.MovieModel
import com.example.laboratorio6_00050519.data.model.MovieWithActor

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie_table")
    suspend fun  getAllMovies(): List<MovieModel>

    @Transaction
    @Insert
    suspend fun insertMovie(movie: MovieModel)

    @Query("SELECT * FROM movie_table WHERE movieId = movieId")
    suspend fun getMovieWithActorsId(movieId: Int): MovieWithActor?
}