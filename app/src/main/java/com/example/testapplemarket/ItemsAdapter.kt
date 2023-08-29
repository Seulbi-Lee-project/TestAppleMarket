package com.example.testapplemarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplemarket.databinding.ItemMainRecyclerviewBinding
import java.text.DecimalFormat

class ItemsAdapter(var itemsList: MutableList<Items>): RecyclerView.Adapter<ItemsAdapter.Holder>() {

    interface ItemClick {
        fun onClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemMainRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener{
            itemClick?.onClick(it, position)
        }
        holder.bind(itemsList[position])
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return  itemsList.size
    }

    inner class Holder(val binding: ItemMainRecyclerviewBinding): RecyclerView.ViewHolder(binding.root){
        val itemImage = binding.itemImage
        val itemSubject = binding.subjectText
        val itemPlace = binding.placeText
        val itemPrice = binding.priceText
        val commentNumber = binding.commentNumber
        val likeNumber = binding.likeNumber

        fun bind(items:Items){
            itemImage.setImageResource(items.itemImage)
            itemSubject.text = items.itemSubject
            itemPlace.text = items.itemPlace
            itemPrice.text = DecimalFormat("#,###").format(items.itemPrice) + "원"
            commentNumber.text = items.commentNumber.toString()
            likeNumber.text = items.likeNumber.toString()
        }
    }
}