package com.myapp.carewatch.adapters.recycler_view.view_holders

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.photo_and_desc_card.view.*

class MedicineFormsViewHolder(v:View):RecyclerView.ViewHolder(v) {
    val allBox: LinearLayout = v.full_box
    val photo: ImageView = v.photo
    val description: TextView = v.description
}