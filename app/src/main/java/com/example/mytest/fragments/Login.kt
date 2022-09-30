package com.example.mytest.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytest.LaningPage
import com.example.mytest.R
import com.example.mytest.databinding.FragmentLoginBinding


class Login : Base() {

    private lateinit var binding:FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.loginBtn.setOnClickListener {

            if (binding.email.text.toString() != "Aghedo@gmail.com"  || binding.password.text.toString().toInt() != 123456){
                showErrorSnackBar("Invalid Login Credentials", true)
            }else{

                val intent = Intent(requireContext(), LaningPage::class.java)
                activity?.startActivity(intent)
            }
        }

        return binding.root
    }

}