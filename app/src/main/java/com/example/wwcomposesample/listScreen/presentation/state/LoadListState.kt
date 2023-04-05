package com.example.wwcomposesample.listScreen.presentation.state

import com.example.wwcomposesample.listScreen.domain.model.ItemModel

sealed class LoadListState{
    object Loading: LoadListState()
    data class LoadFail(val message: String): LoadListState()
    data class LoadSuccess(val itemList: ArrayList<ItemModel>?): LoadListState()
}
