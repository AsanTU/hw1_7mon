package com.example.hw1_7mon.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw1_7mon.databinding.FragmentDoorsBinding

class DoorsFragment : Fragment() {

    private var _binding: FragmentDoorsBinding? = null
    private val binding get() = _binding!!

    private var isLastCardVisible = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDoorsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.entranceOneCv.setOnClickListener {
            toggleVisibility()
        }
        binding.entranceTwoCv.setOnClickListener {
            toggleVisibility()
        }
        binding.entranceThreeCv.setOnClickListener {
            toggleVisibility()
        }
    }

    private fun toggleVisibility() {
        isLastCardVisible = !isLastCardVisible
        binding.cardView.visibility = if (isLastCardVisible) View.VISIBLE else View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}