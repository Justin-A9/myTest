package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.mytest.databinding.ActivityLaningPageBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class LaningPage : AppCompatActivity() {

    private lateinit var binding: ActivityLaningPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_laning_page)

        val navController: NavController = Navigation.findNavController(this, R.id.navHost)
        val bottomNavigationView = binding.bottomNavigation
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        supportActionBar?.hide()


    }
}