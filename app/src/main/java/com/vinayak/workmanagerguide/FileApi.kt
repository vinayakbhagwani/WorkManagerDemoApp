package com.vinayak.workmanagerguide

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

        @GET("2018/08/Apple.jpeg")
    suspend fun downloadImage(): Response<ResponseBody>


    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://clemensteam.com/wp-content/uploads/")
                .build()
                .create(FileApi::class.java)
        }
    }
}