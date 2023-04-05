package com.example.wwcomposesample.listScreen.data.remoteDataSource

import com.example.wwcomposesample.listScreen.domain.model.ItemModel
import retrofit2.Response

interface ListRemoteDataSource {
    suspend fun loadAllItems(
    ): Response<ArrayList<ItemModel>>
}