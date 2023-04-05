package com.example.wwcomposesample.listScreen.domain.model;

import com.google.gson.annotations.SerializedName;

data class ItemModel(
    @SerializedName("filter")
    val mFilter: String,
    @SerializedName("image")
    val mImage: String,
    @SerializedName("title")
    val mTitle: String
)