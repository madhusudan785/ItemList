package com.example.apilearning

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getProduct() : Call<MyData>
}