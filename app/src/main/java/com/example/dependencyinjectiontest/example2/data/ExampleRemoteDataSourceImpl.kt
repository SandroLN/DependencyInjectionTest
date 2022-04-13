package com.example.dependencyinjectiontest.example2.data

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}