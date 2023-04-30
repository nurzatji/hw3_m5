package com.example.hw3_m5.ui

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hw3_m5.CounterViewModel
import com.example.hw3_m5.R
import com.example.hw3_m5.databinding.FragmentDisplayedBinding


class DisplayedFragment : Fragment() {
    private lateinit var binding: FragmentDisplayedBinding
    private lateinit var  viewModel : CounterViewModel
 private val  adapter by  lazy {
     displayedAdapter()
 }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDisplayedBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        initAdapter()
        initObserver()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]
    }
    private fun initAdapter() {
        binding.recyclerView.adapter = adapter
    }

    private fun initObserver() {
        viewModel.mCounter.observe(viewLifecycleOwner) {
            adapter.addData(it.split(" "))
        }
    }
}