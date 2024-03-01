package com.example.worldnews

expect class Platform {
    val osName: String
    val osVersion: String
    val deviceModel: String
    val density: Int

    fun logSystemInfo();
}
