package com.mathieu.weatherapp.di

import com.mathieu.weatherapp.data.remote.WeatherAPI
import com.mathieu.weatherapp.repository.WeatherRepository
import com.mathieu.weatherapp.util.Constants.API_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

// Tell dagger-hilt it's a module
@Module
// Install in singleton so Repository and WeatherAPI lives as long as our application does
@InstallIn(SingletonComponent::class)
object AppModule {

  @Singleton
  @Provides
  fun providesWeatherRepository(
    api: WeatherAPI
  ) = WeatherRepository(api)

  @Singleton
  @Provides
  fun providesWeatherAPI(): WeatherAPI {
    return Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .baseUrl(API_URL)
      .build()
      .create(WeatherAPI::class.java)
  }
}