package com.example.dependencyinjectiontest.example2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}