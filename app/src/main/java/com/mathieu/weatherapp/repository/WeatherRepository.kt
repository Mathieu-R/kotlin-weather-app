package com.mathieu.weatherapp.repository

import com.mathieu.weatherapp.network.WeatherAPIService
import com.mathieu.weatherapp.model.Forecast
import com.mathieu.weatherapp.model.Weather
import com.mathieu.weatherapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

// annotation to make sure our repository live as long as our "Activity" does
@ActivityScoped
class WeatherRepository @Inject constructor(
  private val api: WeatherAPIService
) {
  suspend fun getCurrentWeather(key: String, locality: String, airQuality: String): Resource<Weather> {
    val response = try {
      api.getCurrentWeather(key, locality, airQuality)
    } catch (e: Exception) {
      return Resource.Error("An unknown error occured.")
    }

    return Resource.Success(response)
  }

  suspend fun getWeatherForecast(key: String, locality: String, days: Int, airQuality: String? = null, alerts: String? = null): Resource<Forecast> {
    val response = try {
      api.getWeatherForecast(key, locality, days, airQuality, alerts)
    } catch (e: Exception) {
      return Resource.Error("An unknown error occured.")
    }

    return Resource.Success(response)
  }
}