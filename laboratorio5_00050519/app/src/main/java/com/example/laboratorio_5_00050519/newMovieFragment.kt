package com.example.laboratorio_5_00050519

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class newMovieFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            newMovieFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}