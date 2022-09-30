package com.example.mytest.fragments

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mytest.R

class splashfragment : Fragment() {


   private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        navController = NavHostFragment.findNavController(this)

        Handler().postDelayed({
            navController.navigate(R.id.action_splashfragment_to_firstFragment)
        }, 3000)
        return inflater.inflate(R.layout.fragment_splashfragment, container, false)
    }



}