package com.example.foodorder.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodorder.Model.PopularCategoryModel
import com.example.foodorder.R
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.layout_popular_categories_item.view.*

class MyPopularCategoriesAdapter(internal var context: Context,
                                 internal var popularCategoryModels: List<PopularCategoryModel>):
RecyclerView.Adapter<MyPopularCategoriesAdapter.MyViewHolder>()
{
    inner class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        var category_name : TextView?=null

        var category_image : CircleImageView?=null

        init {
            category_name = itemView.findViewById(R.id.txt_category_name) as TextView
            category_image = itemView.findViewById(R.id.category_image) as CircleImageView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_popular_categories_item,parent, false))
    }

    override fun getItemCount(): Int {
        return popularCategoryModels.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(popularCategoryModels.get(position).image).into(holder.category_image!!)
        holder.category_name!!.text = popularCategoryModels[position].name
    }

}