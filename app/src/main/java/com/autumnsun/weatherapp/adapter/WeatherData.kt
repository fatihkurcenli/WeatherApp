package com.autumnsun.weatherapp.adapter

data class WeatherData(
    val city: String,
    val country: String,
    val day: String,
    val logoResource: Int,
    val celciusDay: Int,
    val damp: Int,
    val windy: Int,
    val rainy: Int
)