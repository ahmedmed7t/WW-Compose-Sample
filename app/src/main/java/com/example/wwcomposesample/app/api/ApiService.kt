package com.example.wwcomposesample.app.api

import com.example.wwcomposesample.listScreen.domain.model.ItemModel
import retrofit2.Response
import retrofit2.http.*

interface ApiService {
    @Headers("Accept: application/json")
    @GET("/assets/cmx/us/messages/collections.json")
    suspend fun loadAllItems(): Response<ArrayList<ItemModel>>
}