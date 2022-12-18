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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pratice1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    main(
                        "Android",
                        para1 = stringResource(R.string.para_1),
                        para2 = stringResource(R.string.para2)
                    )
                }
            }
        }
    }
}

@Composable
fun imgfun(){
    var img = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = img,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun main(name: String, para1: String, para2: String){
    Box(modifier = Modifier.fillMaxSize()){
        Row {
            Column {
                imgfun()
                Text(
                    text = "$name",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = "$para1",
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Justify,
                    fontStyle = FontStyle.Italic
                )
                Text(
                    text = "$para2",
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Justify,
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Pratice1Theme {
        main(
            name= stringResource(R.string.main_line),
            para1 = stringResource(R.string.para_1),
            para2 = stringResource(R.string.para2)
        )
    }
}