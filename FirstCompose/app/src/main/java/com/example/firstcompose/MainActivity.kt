package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			FirstComposeTheme {
				Greeting(
					name = "しんちゃん",
					modifier = Modifier.safeDrawingPadding()
				)
			}
		}
	}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
	Text(
		text = "こんにちは、${name}さん!",
		color = Color(0xFF1D1B20),
		fontSize = 20.sp,
		fontWeight = FontWeight.Bold,
		modifier = modifier
			.fillMaxSize()
			.wrapContentSize(Alignment.Center)
			.background(
				color = Color(0xFFEADDFF),
				shape = RoundedCornerShape(12.dp)
			)
			.border(
				width = 1.dp,
				color = Color(0xFF6750A4),
				shape = RoundedCornerShape(12.dp)
			)
			.padding(24.dp)
	)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	FirstComposeTheme {
		Greeting("Android")
	}
}