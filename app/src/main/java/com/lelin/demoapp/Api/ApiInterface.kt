package com.zhomprass.zhomprasslimited.ApiClient


import com.lelin.demoapp.Models.CerealsProduct
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @GET("catalog-contents/1/cereals")
    fun getCereals(@Query("page") id:Int) :Call<CerealsProduct>





}