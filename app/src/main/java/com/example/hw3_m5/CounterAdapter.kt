package com.example.hw3_m5

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw3_m5.ui.CounterFragment
import com.example.hw3_m5.ui.DisplayedFragment
import com.example.hw3_m5.ui.ResultFragment

class CounterAdapter(activity: FragmentActivity?): FragmentStateAdapter(activity!!){
    private val fragmentList = arrayListOf(CounterFragment(),ResultFragment(),DisplayedFragment())
    override fun getItemCount(): Int = 3



    override fun createFragment(position: Int): Fragment {
       return  fragmentList[position]
    }
}