package com.example.hw3_m5.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw3_m5.databinding.ItemDisplayedBinding

class displayedAdapter : RecyclerView.Adapter<displayedAdapter.dispayedViewHolder>() {

    private val historyList = arrayListOf<String>()

    @SuppressLint("NotifyDataSetChanged")
    fun addData(newData: List<String>) {

        historyList.clear()
        historyList.addAll(newData.reversed())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dispayedViewHolder{
        return dispayedViewHolder(
            ItemDisplayedBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: dispayedViewHolder, position: Int) {
        holder.bind(historyList[position])
    }

    override fun getItemCount(): Int {
        return historyList.size
    }

    inner class dispayedViewHolder(private var binding: ItemDisplayedBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(operation: String) {
            binding.tvItem.text = operation
        }
    }
}