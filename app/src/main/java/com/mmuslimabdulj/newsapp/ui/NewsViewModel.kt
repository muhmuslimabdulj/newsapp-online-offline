package com.mmuslimabdulj.newsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mmuslimabdulj.newsapp.data.NewsRepository
import com.mmuslimabdulj.newsapp.data.local.entity.NewsEntity
import kotlinx.coroutines.launch

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()

    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()

    fun saveNews(news: NewsEntity) {
        viewModelScope.launch {
            newsRepository.setBookmarkedNews(news, true)
        }
    }

    fun deleteNews(news: NewsEntity) {
        viewModelScope.launch {
            newsRepository.setBookmarkedNews(news, false)
        }
    }
}