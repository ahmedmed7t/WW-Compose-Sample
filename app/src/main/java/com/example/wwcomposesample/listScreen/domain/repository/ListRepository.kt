package com.example.wwcomposesample.listScreen.domain.repository

import com.example.wwcomposesample.listScreen.domain.model.ItemModel
import retrofit2.Response

interface ListRepository {
    suspend fun loadAllItems(
    ): Response<ArrayList<ItemModel>>
}