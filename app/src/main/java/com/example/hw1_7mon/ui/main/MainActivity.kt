package com.example.hw1_7mon.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw1_7mon.ui.fragments.CamerasFragment
import com.example.hw1_7mon.ui.fragments.DoorsFragment
import com.example.hw1_7mon.ui.adapter.ViewPagerAdapter
import com.example.hw1_7mon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(CamerasFragment(), "Камеры")
        adapter.addFragment(DoorsFragment(), "Двери")
        binding.apply {
            viewPager.adapter = adapter
            tabLayout.setupWithViewPager(viewPager)
        }
    }
}