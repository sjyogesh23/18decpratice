package com.example.pratice1

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pratice1.ui.theme.Pratice1Theme

class compose_quadrant : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pratice1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    bodyfun()
                }
            }
        }
    }
}

@Composable
fun bodyfun(){

    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(100f)) {
            Column(Modifier.weight(100f)) {
                card(
                    title = stringResource(id = R.string.cq_tx1),
                    body = stringResource(id = R.string.cq_tx2),
                    bg = Color.Green,
                    modifier = Modifier.weight(100f)
                )
            }
            Column(Modifier.weight(100f)) {
                card(
                    title = stringResource(id = R.string.cq_tx3),
                    body = stringResource(id = R.string.cq_tx4),
                    bg = Color.Yellow,
                    modifier = Modifier.weight(100f)
                )
            }
        }
        Row(Modifier.weight(100f)) {
            Column(Modifier.weight(100f)) {
                card(
                    title = stringResource(id = R.string.cq_tx5),
                    body = stringResource(id = R.string.cq_tx6),
                    bg = Color.Cyan,
                )
            }
            Column(Modifier.weight(100f)) {
                card(
                    title = stringResource(id = R.string.cq_tx7),
                    body = stringResource(id = R.string.cq_tx8),
                    bg = Color.LightGray,
                )
            }
        }
    }
}

@Composable
private fun card(
    title: String,
    body: String,
    bg: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bg)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Pre() {
    Pratice1Theme {
        bodyfun()
    }
}
