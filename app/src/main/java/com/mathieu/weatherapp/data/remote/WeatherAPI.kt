package com.mathieu.weatherapp.data.remote

import com.mathieu.weatherapp.data.remote.responses.Forecast
import com.mathieu.weatherapp.data.remote.responses.Weather
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
  @GET("current")
  suspend fun getCurrentWeather(
    // api key
    @Query("key") key: String,
    // locality of the weather forecast
    @Query("q") locality: String,
    // flag to indicate if you want air quality informations
    @Query("aqi") airQuality: String? = null
  ): Weather

  @GET("forecast")
  suspend fun getWeatherForecast(
    // api key
    @Query("key") key: String,
    // locality of the weather forecast
    @Query("q") locality: String,
    // number of days of weather forecast
    @Query("days") days: Int,
    // flag to indicate if you want air quality informations
    @Query("aqi") airQuality: String? = null,
    // flag to indicate if you want weather alerts informations
    @Query("alerts") alerts: String? = null
  ) : Forecast
}