package com.example.testtaskfooddelivery.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testtaskfooddelivery.R
import com.example.testtaskfooddelivery.model.CategoryModel

class CategoryListAdapter(private val context: Context): RecyclerView.Adapter<CategoryListAdapter.CategoryHolder>() {
    private var listOfCategory = emptyList<CategoryModel>()

    class CategoryHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nameOfCategory = itemView.findViewById<TextView>(R.id.tv_name_of_category)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val category = listOfCategory[position]
        val uri = category.image_url

        holder.nameOfCategory.text = category.name
    }

    override fun getItemCount(): Int {
        return listOfCategory.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(list: List<CategoryModel>) {
        listOfCategory = list
        notifyDataSetChanged()
    }
}