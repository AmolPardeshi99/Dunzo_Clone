package com.example.dunzoclone.ViewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dunzoclone.ClickLitener.StoreCatItemClickListener
import com.example.dunzoclone.DataModels.Categories
import com.example.dunzoclone.DataModels.ProductCategory
import kotlinx.android.synthetic.main.item_layout_store_cat.view.*

class StoreCategoryViewHolder(itemView: View, private var storeCatItemClickListener: StoreCatItemClickListener) : RecyclerView.ViewHolder(itemView) {

    fun setStoreCategoryData(categoryList : Categories, position: Int){
        itemView.apply {
            tvStore_cate.text = categoryList.category_name
            Glide.with(ivStore_cate).load(categoryList.category_image).into(ivStore_cate)
        }
        itemView.storeCatCardView.setOnClickListener{
            storeCatItemClickListener.onItemClickListener(categoryList, position)
        }
    }
}