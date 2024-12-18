package com.example.firstappjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting(name = "Юлия")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Студент университета Urban: $name!",
        fontSize = 16.sp,
        color = Color.Red
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Text(
        text = "Студент университета Urban: !",
        fontSize = 16.sp,
        color = Color.Red
    )
}