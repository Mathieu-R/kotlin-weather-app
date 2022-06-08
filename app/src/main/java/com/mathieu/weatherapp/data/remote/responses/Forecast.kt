package com.mathieu.weatherapp.data.remote.responses

data class Forecast(
    val current: CurrentX,
    val forecast: ForecastX,
    val location: LocationX
)