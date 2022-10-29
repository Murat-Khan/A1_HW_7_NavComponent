package com.murat.a1_homework_7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.murat.a1_homework_7.databinding.ItemBinding

class Adapter(
    private val list: List<Model>,
    val onClick : (position:Int)->Unit


) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount() = list.size

  inner class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
      fun onBind(model: Model,position:Int){
          itemView.setOnClickListener {
              onClick(position)
          }
          binding.tvAlive.text = model.alive
          binding.tvName.text = model.name
          binding.imageItem.setImageResource(model.image)



      }







    }
}