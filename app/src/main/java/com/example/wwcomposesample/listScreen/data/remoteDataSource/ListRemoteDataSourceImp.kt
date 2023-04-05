package com.example.wwcomposesample.listScreen.data.remoteDataSource

import com.example.wwcomposesample.app.api.ApiService
import com.example.wwcomposesample.listScreen.domain.model.ItemModel
import retrofit2.Response
import javax.inject.Inject

class ListRemoteDataSourceImp @Inject constructor(private val apiService: ApiService) :
    ListRemoteDataSource {
    override suspend fun loadAllItems(): Response<ArrayList<ItemModel>> {
        return apiService.loadAllItems()
    }
}