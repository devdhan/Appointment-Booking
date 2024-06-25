package com.example.play.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.play.R
import com.example.play.databinding.FragmentHomeDashboardBinding
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class HomeDashboard : Fragment() {
    private lateinit var binding: FragmentHomeDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }
}
