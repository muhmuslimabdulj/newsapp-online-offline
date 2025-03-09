package com.mmuslimabdulj.newsapp.data.remote.retrofit

import com.mmuslimabdulj.newsapp.data.remote.response.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("everything?q=tesla&sortBy=publishedAt")
    suspend fun getNews(@Query("apiKey") apiKey: String): NewsResponse
}