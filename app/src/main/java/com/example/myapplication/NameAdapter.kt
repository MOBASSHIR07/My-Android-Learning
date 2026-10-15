package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemNameBinding

class NameAdapter(private val names: List<String>): RecyclerView.Adapter<NameAdapter.NameViewHolder>() {
     class  NameViewHolder(val binding: ItemNameBinding) : RecyclerView.ViewHolder(binding.root)

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
      val binding = ItemNameBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
          return NameViewHolder(binding)
     }

     override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
         holder.binding.tvName.text = names[position]
     }

     override fun getItemCount(): Int {
        return  names.size
     }
}