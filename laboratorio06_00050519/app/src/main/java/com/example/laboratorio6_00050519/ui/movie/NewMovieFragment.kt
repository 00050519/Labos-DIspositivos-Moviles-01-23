package com.example.laboratorio6_00050519.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.laboratorio6_00050519.R
import com.example.laboratorio6_00050519.data.model.MovieModel
import com.example.laboratorio6_00050519.data.movies
import com.google.android.material.textfield.TextInputEditText

class newMovieFragment : Fragment() {

    private lateinit var nameEditText: EditText
    private lateinit var categoryEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var scoreEditText: EditText
    private lateinit var submitButton: Button

    private val viewModel : MovieViewModel by viewModels() {
        MovieViewModel.Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind(view)
        addListeners()
    }

    private fun addListeners() {
        submitButton.setOnClickListener{
            var movie = MovieModel(nameEditText.text.toString(), categoryEditText.text.toString(), descriptionEditText.text.toString(), scoreEditText.text.toString())
            viewModel.addMovies(movie)
            var showMovies = viewModel.getMovies()
            var showNumberOfMovies = movies.size
            Log.d("movies", showMovies.toString())
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }
    private fun bind(view: View) {
        nameEditText = view?.findViewById(R.id.textField) as EditText
        categoryEditText = view?.findViewById(R.id.textField2) as EditText
        descriptionEditText = view?.findViewById(R.id.textField3) as EditText
        scoreEditText = view?.findViewById(R.id.textField4) as EditText
        submitButton = view?.findViewById(R.id.submit_button) as Button
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            newMovieFragment().apply {

            }
    }
}