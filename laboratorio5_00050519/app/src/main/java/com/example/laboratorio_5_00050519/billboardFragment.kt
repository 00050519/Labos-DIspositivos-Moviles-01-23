package com.example.laboratorio_5_00050519

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class billboardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var addMovieButton: FloatingActionButton
    private lateinit var card1: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_billboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        addMovieButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_newMovieFragment)
        }
        card1.setOnClickListener{
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment)
        }
    }

    private fun bind() {
        addMovieButton = view?.findViewById(R.id.add_movie_button) as FloatingActionButton
        card1 = view?.findViewById(R.id.card1) as CardView
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            billboardFragment().apply {

            }
    }
}