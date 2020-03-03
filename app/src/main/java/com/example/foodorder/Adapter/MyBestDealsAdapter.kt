package com.example.foodorder.Adapter

import android.content.Context
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.foodorder.Model.BestDealModel
import com.example.foodorder.R

class MyBestDealsAdapter(context: Context,
                         itemList:List<BestDealModel>,
                         isInfinite:Boolean):LoopingPagerAdapter<BestDealModel>(context, itemList, isInfinite) {

    override fun inflateView(viewType: Int, container: ViewGroup, listPosition: Int): View {
        return LayoutInflater.from(context)
            .inflate(R.layout.layout_best_deals_item, container, false)
    }

    override fun bindView(convertView: View?, listPosition: Int, viewType: Int) {
        val imageView = convertView!!.findViewById<ImageView>(R.id.img_best_deal)
        val textView = convertView.findViewById<TextView>(R.id.txt_best_deal)
        //set data
        Log.d("Image: ",""+ itemList[listPosition].image)
        val options = RequestOptions()
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.drawable.default_image)
        Glide.with(context).load(itemList[listPosition].image).into(imageView)
        textView.text = itemList[listPosition].name
    }

}