package com.example.mytest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.mytest.R
import com.google.android.material.snackbar.Snackbar


open class Base : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base, container, false)
    }

    fun showErrorSnackBar(message: String, errorMessage: Boolean){
        val snackBar = Snackbar.make(requireActivity().findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
        val snackbarView = snackBar.view

        if (errorMessage){
            snackbarView.setBackgroundColor(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.snackBarFailure
                )
            )
        }else{
            snackbarView.setBackgroundColor(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.snackBarSuccess
                )
            )
        }
        snackBar.show()
    }

}