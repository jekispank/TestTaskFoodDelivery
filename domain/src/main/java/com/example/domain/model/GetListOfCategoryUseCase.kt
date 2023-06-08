package com.example.domain.model

import retrofit2.Response

class GetListOfCategoryUseCase(private val repository: MainRepository) {
    suspend fun getListOfCategoryUseCase(): Response<Categories> {
        return repository.getListOfCategory()
    }

}