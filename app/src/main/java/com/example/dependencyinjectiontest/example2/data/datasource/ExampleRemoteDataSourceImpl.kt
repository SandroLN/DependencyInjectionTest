package com.example.dependencyinjectiontest.example2.data.datasource

import com.example.dependencyinjectiontest.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}