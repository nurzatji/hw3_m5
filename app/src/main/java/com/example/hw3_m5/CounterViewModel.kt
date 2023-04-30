package com.example.hw3_m5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val count = MutableLiveData(0)
    val mCounter = MutableLiveData("")
    fun  increment(){
        mCounter.value += "+"
        count.value = count.value?.plus(1)
    }
    fun  decrement(){
        mCounter.value += "-"
        count.value = count.value?.minus(1)

    }
}