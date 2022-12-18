package com.example.pratice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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

class task_manager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pratice1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    abc(
                        txt1= stringResource(R.string.tk_txt1),
                        txt2 = stringResource(R.string.tk_txt2)
                    )
                }
            }
        }
    }
}

@Composable
fun imagefun(){
    var img = painterResource(id = R.drawable.ic_task_completed)
    Image(
        painter = img,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun abc(txt1: String, txt2: String){
    Column(modifier = Modifier.fillMaxHeight().fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        imagefun()
        Text(
            text = "$txt1",
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "$txt2",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
            )
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Pratice1Theme {
        abc(
            txt1= stringResource(R.string.tk_txt1),
            txt2 = stringResource(R.string.tk_txt2)
        )
    }
}