package com.example.wwcomposesample.listScreen.data.repository

import com.example.wwcomposesample.listScreen.data.remoteDataSource.ListRemoteDataSource
import com.example.wwcomposesample.listScreen.domain.model.ItemModel
import com.example.wwcomposesample.listScreen.domain.repository.ListRepository
import retrofit2.Response
import javax.inject.Inject

class ListRepositoryImp @Inject constructor(
    private val listRemoteDataSource: ListRemoteDataSource
) : ListRepository {
    override suspend fun loadAllItems(): Response<ArrayList<ItemModel>> {
        return listRemoteDataSource.loadAllItems()
    }
}