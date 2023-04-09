package com.example.newsapp.utils

import com.example.newsapp.models.NewsResponse

sealed class Resource<T>(
    val data: NewsResponse? = null,
    val message: String? = null
) {
    class Success<T>(data: NewsResponse?): Resource<T>(data = data)
    class Error<T>(message: String?): Resource<T>(message = message)
    class Loading<T>: Resource<T>()
}
