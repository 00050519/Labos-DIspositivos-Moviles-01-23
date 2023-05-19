package com.example.laboratorio09

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.corutinesdemo.R
import com.example.corutinesdemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var mainThreadButton: Button
    private lateinit var coroutinesButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainThreadButton = binding.mainThreadButton
        mainThreadButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_mainThreadFragment)
        }

        coroutinesButton = binding.coroutinesButton
        coroutinesButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_coroutinesFragment)
        }
    }
}