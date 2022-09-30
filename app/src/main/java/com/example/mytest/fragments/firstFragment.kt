package com.example.mytest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mytest.R
import com.example.mytest.databinding.FragmentFirstBinding

class firstFragment : Fragment() {


    private lateinit var bindng: FragmentFirstBinding
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       bindng = FragmentFirstBinding.inflate(inflater, container, false)
        navController = NavHostFragment.findNavController(this)

        bindng.firstNext.setOnClickListener {

            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return bindng.root
    }


}