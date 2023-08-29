package com.android.recyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerviewproject.ListData.MyItem
import com.android.recyclerviewproject.databinding.ItemRecyclerview2Binding
import com.android.recyclerviewproject.databinding.ItemRecyclerviewBinding

class MyAdapter(private val mItems: List<MyItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding1 = ItemRecyclerviewBinding.inflate(inflater, parent, false)
        val binding2 = ItemRecyclerview2Binding.inflate(inflater, parent, false)
        return when (viewType) {
            multi_type1 -> MultiViewHolder1(binding1)
            else -> MultiViewHolder2(binding2)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (mItems[position].type) {
            multi_type1 -> {
                (holder as MultiViewHolder1).bind(mItems[position])
                holder.setIsRecyclable(false)
            }
            else -> {
                (holder as MultiViewHolder2).bind(mItems[position])
                holder.setIsRecyclable(false)
            }
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    override fun getItemViewType(position: Int): Int {
        return mItems[position].type
    }

    inner class MultiViewHolder1(private val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyItem) {
            binding.img.setImageResource(item.Icon)
            binding.call.text = item.contact
            binding.number.text = item.number
            binding.like.text = if (item.favorite) "즐겨 찾기 O" else "즐겨 찾기 X"
        }
    }

    inner class MultiViewHolder2(private val binding: ItemRecyclerview2Binding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyItem) {
            binding.img.setImageResource(item.Icon)
            binding.call.text = item.contact
            binding.number.text = item.number
        }
    }
}