package com.example.foodorder.Callback

import com.example.foodorder.Model.BestDealModel
import com.example.foodorder.Model.PopularCategoryModel

interface IBestDealLoadCallback {
    fun onBestDealLoadSuccess(bestDealList : List<BestDealModel>)
    fun onBestDealLoadFailed(message:String)
}