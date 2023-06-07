package com.example.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

const val BASE_URL = "https://run.mocky.io/v3/"
object GetApiService {
    val retrofitService: GetDataApiService by lazy {
        retrofit.create(GetDataApiService::class.java)
    }
}
private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()