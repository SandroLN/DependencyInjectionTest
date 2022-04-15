package com.example.dependencyinjectiontest.example2.data

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {

    }
}