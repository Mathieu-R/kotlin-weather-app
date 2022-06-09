package com.mathieu.weatherapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mathieu.weatherapp.ui.home.HomeScreen
import com.mathieu.weatherapp.ui.theme.WeatherAppTheme
import com.mathieu.weatherapp.ui.theme.primaryBackground
import dagger.hilt.android.AndroidEntryPoint

// tell dagger-hilt we want to inject something in the Activity
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      WeatherAppTheme {
        val navController = rememberNavController()
        Navigation(navController)
      }
    }
  }
}

@Composable
fun Navigation(navController: NavHostController) {
  NavHost(navController, startDestination = "home") {

    composable("home") {
      HomeScreen()
    }
  }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  WeatherAppTheme {
  }
}