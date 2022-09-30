package com.example.mytest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mytest.R
import com.example.mytest.databinding.FragmentSecondBinding

class secondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentSecondBinding.inflate(inflater, container, false)
        navController = NavHostFragment.findNavController(this)

        binding.secondNext.setOnClickListener {

            navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return binding.root
    }


}