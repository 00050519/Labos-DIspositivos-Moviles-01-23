package com.example.laboratorio6_00050519.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.laboratorio6_00050519.R
import com.example.laboratorio6_00050519.data.model.MovieModel
import com.example.laboratorio6_00050519.ui.movie.viewmodel.MovieViewModel
import com.example.laboratorio6_00050519.data.movies
import com.example.laboratorio6_00050519.databinding.FragmentNewMoviBinding


class newMoviFragment : Fragment() {


    private lateinit var binding : FragmentNewMoviBinding
    private val viewModel : MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        observeStatus()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewMoviBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun setViewModel() {
        binding.viewmodel = viewModel
    }

    private fun observeStatus() {
        viewModel.status.observe(viewLifecycleOwner) {
                status -> when {
            status.equals(MovieViewModel.WRONG_INFORMATION) -> {
                Log.d(APP_TAG, status)
                viewModel.clearStatus()
            }
            status.equals(MovieViewModel.MOVIE_CREATED) -> {
                Log.d("APP_TAG", status)
                Log.d("APP_TAG", viewModel.getMovies().toString())

                viewModel.clearStatus()
                findNavController().popBackStack()
            }
        }
        }
    }
    companion object {

        const val APP_TAG = "APP_TAG"
    }
}