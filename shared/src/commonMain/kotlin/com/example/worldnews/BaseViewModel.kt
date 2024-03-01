package com.example.worldnews

import kotlinx.coroutines.CoroutineScope

expect  open class BaseViewModel() {

    val scope: CoroutineScope

}