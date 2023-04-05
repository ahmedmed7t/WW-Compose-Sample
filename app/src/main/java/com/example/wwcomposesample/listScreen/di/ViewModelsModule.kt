package com.example.wwcomposesample.listScreen.di

import com.example.wwcomposesample.listScreen.domain.usecase.LoadAllItemsUseCase
import com.example.wwcomposesample.listScreen.presentation.ListViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityComponent::class)
class ViewModelsModule {

    @Provides
    fun provideListViewModel(
        loadAllItemsUseCase: LoadAllItemsUseCase
    ) = ListViewModel(
        loadAllItemsUseCase
    )
}
