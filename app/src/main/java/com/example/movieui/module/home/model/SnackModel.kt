package com.example.movieui.module.home.model

import com.example.movieui.R

data class SnackModel(
    val id:String,
    val title: String,
    val assetImage: Int,
    val price: String
)

val snackList = listOf(
    SnackModel("1", "Popcorn", R.drawable.box_popcorn, "Rp. 30.000"),
    SnackModel("2", "Coca Cola", R.drawable.bucket_popcorn, "Rp. 45.000"),
    SnackModel("3", "Nachos", R.drawable.coca_cola, "Rp. 20.000"),
    SnackModel("4", "Hotdog", R.drawable.ice_chocolate, "Rp. 25.000"),

)
