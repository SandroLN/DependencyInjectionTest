package com.example.dependencyinjectiontest.example2.data.datasource

import com.example.dependencyinjectiontest.example2.data.database.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}