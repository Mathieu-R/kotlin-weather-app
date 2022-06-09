package com.mathieu.weatherapp.ui.home

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mathieu.weatherapp.ui.theme.Shapes

@Preview(showBackground = true)
@Composable
fun HomeScreen(

) {
  LazyColumn(modifier = Modifier.fillMaxSize()) {
    item { Spacer(modifier = Modifier.height(16.dp)) }

    item { WeatherSummary() }

    item { AdditionalWeatherInformations() }

    item { DayForecast() }

    item { WeekForecast }
  }
}

@Composable
fun WeatherSummary() {
  Row(
    modifier = Modifier.fillMaxWidth()
  ) {
    Column {
      Text(
        text = "Bruxelles",
        style = MaterialTheme.typography.h4,
        modifier = Modifier.padding(horizontal = 8.dp)
      )

      Text(
        text = "20°",
        style = MaterialTheme.typography.h1,
        modifier = Modifier.padding(horizontal = 8.dp)
      )

      Text(
        text = "Cloudy",
        style = MaterialTheme.typography.h6,
        modifier = Modifier
          .clip(Shapes.small)
          .background(MaterialTheme.colors.secondary)
          .padding(horizontal = 16.dp)
      )

    }
  }
}

@Composable
fun AdditionalWeatherInformations() {
  Row(
    modifier = Modifier.fillMaxWidth()
  ) {
    // humidity
    Box() {
      Icon(),
      Text(
        text = "13%"
      )
    }

    // air quality
    Box() {

    }

    // wind kph
    Box() {

    }
  }
}

@Composable
fun DayForecast() {
  Column(
    modifier = Modifier.fillMaxWidth()
  ) {
    Box(
      modifier = Modifier.padding(horizontal = 8.dp)
    ) {
      Text(
        text = "Today",
        style = MaterialTheme.colors.onSurface
      )
    }

    LazyRow {
      // grab day forecast
      // for each hour
      Box() {
        
      }
    }

  }
}

@Composable
fun WeekForecast() {

}