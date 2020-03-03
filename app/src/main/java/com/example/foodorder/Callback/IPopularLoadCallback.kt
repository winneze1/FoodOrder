package com.example.foodorder.Callback

import com.example.foodorder.Model.PopularCategoryModel

interface IPopularLoadCallback {
    fun onPopularLoadSuccess(popularModelList : List<PopularCategoryModel>)
    fun onPopularLoadFailed(message:String)
}