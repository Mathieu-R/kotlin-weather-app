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
        // A surface container using the 'background' color from the theme
        Surface(color = primaryBackground) {
          Column() {
            MainInfos()
            Summary()
            Settings()
          }
        }
      }
    }
  }
}

@Composable
fun MainInfos() {
  Row (
    modifier = Modifier
      .fillMaxWidth()
      .padding(top = 64.dp)
  ) {
    Text("Ophain-Bois-Seigneur-Isaac, Belgique")
    Image(
      painter = painterResource(),
      contentDescription = null
    )
    Text("Shine")
    Text("20°C")
  }
}

@Composable
fun Summary() {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .padding()
  ) {
    SummaryItem(
      // icon
      // value
    )
  }
}

@Composable
fun SummaryItem(icon: Icon, value: String) {
  Column {
    Image(
      painter = painterResource(),
      contentDescription = null
    )
    Text(value)
  }
}

@Composable
fun Settings() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  WeatherAppTheme {
  }
}