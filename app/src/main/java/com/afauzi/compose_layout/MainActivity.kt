package com.afauzi.compose_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afauzi.compose_layout.ui.theme.ComposelayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposelayoutTheme {
                App()
            }
        }
    }
}

@Preview
@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row()
        Column()
        Row()
        BoxL()
    }

}

@Composable
fun Column() {
    Column(
        modifier = Modifier.padding(16.dp)
    ){

        Box(
            modifier = Modifier
                .background(color = Color.Red)
                .size(80.dp, 80.dp)
        )
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .size(80.dp, 80.dp)
        )
        Box(
            modifier = Modifier
                .background(color = Color.Green)
                .size(80.dp, 80.dp)
        )

    }
}

@Composable
fun Row() {
    Row {
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .size(80.dp, 80.dp)
        )
        Box(
            modifier = Modifier
                .background(color = Color.Green)
                .size(80.dp, 80.dp)
        )
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .size(80.dp, 80.dp)
        )
    }
}

@Composable
fun BoxL() {
    Box(
        modifier = Modifier.padding(16.dp)
    ){
        Box(modifier = Modifier
            .padding(start = 16.dp, top = 16.dp)
            .background(color = Color.Red)
            .size(80.dp, 80.dp)
        )
        Box(modifier = Modifier
            .padding(start = 8.dp, top = 8.dp)
            .background(color = Color.Blue)
            .size(80.dp, 80.dp)
        )
        Box(modifier = Modifier
            .background(color = Color.Green)
            .size(80.dp, 80.dp)
        )
    }
}

