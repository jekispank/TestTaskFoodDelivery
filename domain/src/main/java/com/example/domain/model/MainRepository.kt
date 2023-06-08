package com.example.domain.model

import retrofit2.Response

interface MainRepository {

    suspend fun getListOfCategory(): Response<Categories>
}