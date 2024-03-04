package com.example.worldnews.articles

import com.example.worldnews.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel: BaseViewModel() {

    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState> get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles(){
        scope.launch {

            delay(1500)
            _articlesState.emit(ArticlesState(error = "Something wrong"))
            delay(1500)
            val fetchedArticles = fetchArticles()

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }

    suspend fun fetchArticles(): List<Article> = mockArticles

    private val mockArticles = listOf<Article>(
        Article(
             "Stock market today: Live updates - CNBC",
            "Futures were higher in premarket trading as Well Street tried to regain its footing",
            "2023-11-09",
            "https://cdn.pixabay.com/photo/2019/08/10/17/50/london-4397415_1280.jpg"
        ),
        Article(
            "Stock market today: Live updates - CNBC",
            "Futures were higher in premarket trading as Well Street tried to regain its footing",
            "2023-11-09",
            "https://cdn.pixabay.com/photo/2019/08/10/17/50/london-4397415_1280.jpg"
        ),
        Article(
            "Stock market today: Live updates - CNBC",
            "Futures were higher in premarket trading as Well Street tried to regain its footing",
            "2023-11-09",
            "https://cdn.pixabay.com/photo/2019/08/10/17/50/london-4397415_1280.jpg"
        ),
    )




}