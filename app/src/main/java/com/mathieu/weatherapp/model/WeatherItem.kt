package com.mathieu.weatherapp.model

data class WeatherItem(
  val localisation: Localisation,
  val temperature: Double,
  val weather: String,
  val windSpeed: Int,
  val humidity: Int,
  val cloudiness: Int,
  val sunrise: Int,
  val sunset: Int
)
