package com.example.testtaskfooddelivery.di

import com.example.testtaskfooddelivery.presentation.MainVIewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {



    viewModel {
        MainVIewModel(
            getListOfCategoryUseCase = get(),
            application = get()
        )
    }
}