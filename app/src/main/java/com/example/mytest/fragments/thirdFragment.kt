package com.example.mytest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mytest.R
import com.example.mytest.databinding.FragmentThirdBinding


class thirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        navController = NavHostFragment.findNavController(this)
        binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.getStarted.setOnClickListener {

            navController.navigate(R.id.action_thirdFragment_to_login)
        }

        return binding.root
    }


}