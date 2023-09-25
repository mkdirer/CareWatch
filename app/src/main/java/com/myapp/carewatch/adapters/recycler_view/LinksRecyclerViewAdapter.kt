package com.myapp.carewatch.adapters.recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myapp.carewatch.R
import com.myapp.carewatch.adapters.recycler_view.view_holders.LinksViewHolder

class LinksRecyclerViewAdapter(private val listOfLinks :ArrayList<String>): RecyclerView.Adapter<LinksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinksViewHolder {
        return LinksViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.link_card,parent,false))
    }

    override fun getItemCount(): Int {
        return listOfLinks.size
    }

    override fun onBindViewHolder(holder: LinksViewHolder, position: Int) {
        holder.linkText.text = listOfLinks[holder.adapterPosition]
    }


}