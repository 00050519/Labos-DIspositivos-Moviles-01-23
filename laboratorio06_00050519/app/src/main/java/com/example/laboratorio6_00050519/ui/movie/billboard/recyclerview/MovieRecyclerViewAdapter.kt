package com.example.laboratorio6_00050519.ui.movie.billboard.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio6_00050519.data.model.MovieModel
import com.example.laboratorio6_00050519.databinding.MovieItemBinding

class MovieRecyclerViewAdapter (
    private val clickListener: (MovieModel) -> Unit
        ) : RecyclerView.Adapter<MovieRecyclerViewHolder>() {
            private val movies = arrayListOf<MovieModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieRecyclerViewHolder {
        val binding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieRecyclerViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie, clickListener)
    }

    fun setData(moviesList: List<MovieModel>){
        movies.clear()
        movies.addAll(moviesList)
    }
}