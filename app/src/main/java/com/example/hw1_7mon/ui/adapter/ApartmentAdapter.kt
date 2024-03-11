package com.example.hw1_7mon.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw1_7mon.ui.model.ApartmentModel
import com.example.hw1_7mon.databinding.ApartmentItemBinding

class ApartmentAdapter(private val itemList: List<ApartmentModel>) : RecyclerView.Adapter<ApartmentAdapter.ApartmentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApartmentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ApartmentItemBinding.inflate(inflater, parent, false)
        return ApartmentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ApartmentViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    class ApartmentViewHolder(private val binding: ApartmentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ApartmentModel) {
            binding.apply {
                videoImg.setImageResource(item.img)
                numberTv.text = item.text
            }
        }
    }
}