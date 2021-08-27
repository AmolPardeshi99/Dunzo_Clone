package com.example.dunzoclone.ViewHolders

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dunzoclone.ClickLitener.ProductItemClickListener
import com.example.dunzoclone.DataModels.ProductModel
import kotlinx.android.synthetic.main.product_item_layout.view.*
import kotlinx.android.synthetic.main.product_item_layout.view.ivProductImage

class ProductViewHolder(view: View, var productItemClickListener: ProductItemClickListener): RecyclerView.ViewHolder(view) {
    fun setProductData(productList : ProductModel, position: Int){
        itemView.apply {
            if(productList.isproductaddedtocart.toBoolean()){
                cvProductAdd.visibility = View.VISIBLE
                tvButtonAdd.visibility = View.GONE
            }
            tvProductName.text = productList.name
            tvProductDesc.text = productList.quantity
            tvProductPrice.text = productList.price
            Glide.with(ivProductImage).load(productList.image).into(ivProductImage)

            tvButtonAdd.setOnClickListener {
                cvProductAdd.visibility = View.VISIBLE
                tvButtonAdd.visibility = View.GONE
                productItemClickListener.onAddButtonClick(productList, position)
            }

            ivButtonPlus.setOnClickListener {
                productItemClickListener.onPlusButtonClick(productList, position)
            }

            ivButtonMinus.setOnClickListener {
//                cvProductAdd.visibility = View.GONE
//                tvButtonAdd.visibility = View.VISIBLE
                productItemClickListener.onMinusButtonClick(productList, position)
            }
        }
        itemView.productCardView.setOnClickListener {
            productItemClickListener.onItemClickListener(productList, position)
        }
    }
}