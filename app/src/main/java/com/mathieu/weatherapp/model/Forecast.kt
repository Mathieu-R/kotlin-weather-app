package com.mathieu.weatherapp.model

data class Forecast(
  val current: CurrentX,
  val forecast: ForecastX,
  val location: LocationX
)