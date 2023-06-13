package com.example.shayari_x.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.shayari_x.Modal.ShayariModel
import com.example.shayari_x.databinding.ShayriItemBinding

class ShayariAdapter : Adapter<ShayariAdapter.ShayariHoldar>() {


    var shayarilist = ArrayList<ShayariModel>()
    lateinit var context: Context

    class ShayariHoldar(itemView: ShayriItemBinding) : ViewHolder(itemView.root) {
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShayariHoldar {

        var binding = ShayriItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShayariHoldar(binding)
    }

    override fun getItemCount(): Int {

        return shayarilist.size

    }

    override fun onBindViewHolder(holder: ShayariHoldar, position: Int) {

        holder.binding.apply {
            shayarilist.get(position).apply {
                txtShayri.text = shayarilist.toString()
            }
        }
    }

    fun setShyri(shayarilist: ArrayList<ShayariModel>) {
        this.shayarilist = shayarilist
    }
}