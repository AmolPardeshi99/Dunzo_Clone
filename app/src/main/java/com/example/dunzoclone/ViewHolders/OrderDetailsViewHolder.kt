package com.example.dunzoclone.ViewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dunzoclone.DataModels.OrderDetailsModel
import kotlinx.android.synthetic.main.order_details_item_layout.view.*
import kotlinx.android.synthetic.main.order_item_layout.view.ivImageProduct

class OrderDetailsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun setOrderDetailsData(detailsList: OrderDetailsModel) {
        itemView.apply {
            Glide.with(ivImageProduct).load(detailsList.image_url).into(ivImageProduct)

            tvQuantity.text = detailsList.product_quantity
            tvProductName.text = detailsList.product_name
            tvProductQuantityInGms.text = detailsList.product_quantity_in_gms
            tvPrice.text = detailsList.price
        }
    }
}