package com.example.wwcomposesample.listScreen.di

import com.example.wwcomposesample.listScreen.data.remoteDataSource.ListRemoteDataSource
import com.example.wwcomposesample.listScreen.data.remoteDataSource.ListRemoteDataSourceImp
import com.example.wwcomposesample.listScreen.data.repository.ListRepositoryImp
import com.example.wwcomposesample.listScreen.domain.repository.ListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ViewModelComponent::class)
@Module
abstract class ListModule {

    @Binds
    abstract fun bindRemoteDataSource(localDataSourceImp: ListRemoteDataSourceImp): ListRemoteDataSource

    @Binds
    abstract fun bindRepository(listRepositoryImp: ListRepositoryImp): ListRepository
}