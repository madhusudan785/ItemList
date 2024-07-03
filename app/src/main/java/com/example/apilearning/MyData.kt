package com.example.apilearning

data class MyData(
    //all objects are here
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)