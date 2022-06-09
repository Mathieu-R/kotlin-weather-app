package com.mathieu.weatherapp.network

import com.mathieu.weatherapp.model.Forecast
import com.mathieu.weatherapp.model.Weather
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPIService {
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