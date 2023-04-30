package com.example.hw3_m5.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.hw3_m5.CounterViewModel
import com.example.hw3_m5.R
import com.example.hw3_m5.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
private  lateinit var  binding: FragmentResultBinding
private  lateinit var  viewModel:CounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]
        initlisteners()
    }

    private fun initlisteners() {
        viewModel.count.observe(viewLifecycleOwner){
            binding.tvResult.text = it.toString()
        }
    }

}