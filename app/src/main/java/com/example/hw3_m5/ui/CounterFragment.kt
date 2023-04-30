package com.example.hw3_m5.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.hw3_m5.CounterViewModel

import com.example.hw3_m5.MainActivity
import com.example.hw3_m5.R
import com.example.hw3_m5.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {
    private lateinit var  viewModel:CounterViewModel
private  lateinit var  binding: FragmentCounterBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding = FragmentCounterBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()



      viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]

    }

    private fun initClickers() {
      with(binding){
          btnDecrement.setOnClickListener {
              viewModel.decrement()
          }
          btnIncrement.setOnClickListener {
              viewModel.increment()
          }
      }
    }
}
