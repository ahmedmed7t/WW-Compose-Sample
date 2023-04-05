package com.example.wwcomposesample.listScreen.domain.usecase

import com.example.wwcomposesample.listScreen.domain.repository.ListRepository
import com.example.wwcomposesample.listScreen.presentation.state.LoadListState
import javax.inject.Inject

class LoadAllItemsUseCase @Inject constructor(
    private val listRepository: ListRepository
) {
    suspend fun execute(): LoadListState {
        listRepository.loadAllItems().let { response ->
            return if (response.isSuccessful) {
                LoadListState.LoadSuccess(response.body())
            } else {
                LoadListState.LoadFail(response.message())
            }
        }
    }
}