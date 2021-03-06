package com.example.dependencyinjectiontest.example2.di

import com.example.dependencyinjectiontest.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectiontest.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectiontest.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectiontest.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}