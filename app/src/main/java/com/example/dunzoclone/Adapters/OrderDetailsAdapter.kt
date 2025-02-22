package com.example.dunzoclone.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dunzoclone.DataModels.OrderDetailsModel
import com.example.dunzoclone.R
import com.example.dunzoclone.ViewHolders.OrderDetailsViewHolder
import com.example.dunzoclone.ViewHolders.OrderViewHolder

class OrderDetailsAdapter(private val detailsList: List<OrderDetailsModel>) : RecyclerView.Adapter<OrderDetailsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderDetailsViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.order_details_item_layout, parent, false)
        return OrderDetailsViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderDetailsViewHolder, position: Int) {
        val details_item : OrderDetailsModel = detailsList[position]
        holder.setOrderDetailsData(details_item)

    }

    override fun getItemCount(): Int {
        return detailsList.size
    }

}