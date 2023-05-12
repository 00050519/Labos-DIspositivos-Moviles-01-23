package com.example.laboratorio6_00050519.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio6_00050519.data.model.MovieModel
import com.example.laboratorio6_00050519.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind (movie: MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.movieTitleTextview.text = movie.name
        binding.movieScoreTextview.text = movie.qualification

        binding.movieItemCardView.setOnClickListener{
            clickListener(movie)
        }
    }
}