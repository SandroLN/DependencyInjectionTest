package com.example.dependencyinjectiontest.example2.di

import com.example.dependencyinjectiontest.example2.data.repository.ExampleRepositoryImpl
import com.example.dependencyinjectiontest.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl):ExampleRepository
}