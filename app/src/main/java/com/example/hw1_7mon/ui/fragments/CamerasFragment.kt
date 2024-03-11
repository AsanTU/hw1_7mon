package com.example.hw1_7mon.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw1_7mon.ui.adapter.ApartmentAdapter
import com.example.hw1_7mon.ui.model.ApartmentModel
import com.example.hw1_7mon.R
import com.example.hw1_7mon.databinding.FragmentCamerasBinding

class CamerasFragment : Fragment() {

    private var _binding: FragmentCamerasBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: ApartmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCamerasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemList = listOf(
            ApartmentModel(R.color.black, "Text 1"),
            ApartmentModel(R.color.black, "Text 2"),
            ApartmentModel(R.color.black, "Text 3"),
        )

        adapter = ApartmentAdapter(itemList)
        binding.apply {
            apartmentRv.adapter = adapter
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}