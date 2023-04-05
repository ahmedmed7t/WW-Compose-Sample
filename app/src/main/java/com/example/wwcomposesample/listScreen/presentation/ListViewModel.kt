package com.example.wwcomposesample.listScreen.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wwcomposesample.listScreen.domain.usecase.LoadAllItemsUseCase
import com.example.wwcomposesample.listScreen.presentation.state.LoadListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val loadAllItemsUseCase: LoadAllItemsUseCase
) : ViewModel() {

    private val _loadListItems = MutableStateFlow<LoadListState>(LoadListState.Loading)
    val loadListItems: MutableStateFlow<LoadListState> get() = _loadListItems

    init {
        loadAllItems()
    }

    private fun loadAllItems() {
        viewModelScope.launch {
            _loadListItems.value = loadAllItemsUseCase.execute()
        }
    }
}