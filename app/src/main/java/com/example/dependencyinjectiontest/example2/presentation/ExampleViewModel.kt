package com.example.dependencyinjectiontest.example2.presentation

import com.example.dependencyinjectiontest.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {

    }
}