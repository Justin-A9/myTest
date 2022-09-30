package com.example.mytest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mytest.DataClass
import com.example.mytest.NotificationAdapter
import com.example.mytest.R
import com.example.mytest.databinding.FragmentLoginBinding
import com.example.mytest.databinding.FragmentMainBinding


class Main : Fragment() {


    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.recycler.layoutManager = GridLayoutManager(requireContext(), 2)

        val people = ArrayList<DataClass>()


        people.add(DataClass(R.drawable.avatar_one, "David"))
        people.add(DataClass(R.drawable.avatar_two, "David"))
        people.add(DataClass(R.drawable.avatar_one, "David"))
        people.add(DataClass(R.drawable.avatar_two, "David"))
        people.add(DataClass(R.drawable.avatar_one, "David"))
        people.add(DataClass(R.drawable.avatar_two, "David"))
        people.add(DataClass(R.drawable.avatar_one, "David"))

        val adapter = NotificationAdapter(people)
        binding.recycler.adapter = adapter
        return binding.root
    }


}