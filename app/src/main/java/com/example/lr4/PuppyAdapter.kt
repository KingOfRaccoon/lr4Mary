package com.example.lr4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.lr4.databinding.ItemPuppyBinding

class PuppyAdapter
    : ListAdapter<Puppy, PuppyAdapter.MotorcyclistViewHolder>(differ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorcyclistViewHolder {
        return MotorcyclistViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_puppy, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MotorcyclistViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    inner class MotorcyclistViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemPuppyBinding.bind(view)

        fun bind(puppy: Puppy) {
            binding.textTitle.text = puppy.name
            binding.textDesc.text = puppy.desc
        }
    }

    companion object {
        val differ = object : DiffUtil.ItemCallback<Puppy>() {
            override fun areItemsTheSame(oldItem: Puppy, newItem: Puppy): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Puppy, newItem: Puppy): Boolean {
                return oldItem == newItem
            }
        }
    }
}