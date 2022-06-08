package com.mathieu.weatherapp.model

data class Week(
  val monday: WeatherItem,
  val tuesday: WeatherItem,
  val wednesday: WeatherItem,
  val thursday: WeatherItem,
  val friday: WeatherItem,
  val sunday: WeatherItem,
  val saturday: WeatherItem
)
