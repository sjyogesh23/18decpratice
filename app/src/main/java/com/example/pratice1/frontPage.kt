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

class frontPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pratice1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    func()
                }
            }
        }
    }
}

@Composable
fun logofuc(){
    var logoimg = painterResource(id = R.drawable.android_logo)
    Image(painter = logoimg, contentDescription = null, modifier = Modifier.fillMaxWidth())
}
/*fun phonefuc(){
    var phoneimg = painterResource(id = R.drawable.android_logo)
    Image(painter = phoneimg, contentDescription = null, modifier = Modifier.fillMaxWidth())
}
fun sharefun(){
    var shareimg = painterResource(id = R.drawable.android_logo)
    Image(painter = shareimg, contentDescription = null, modifier = Modifier.fillMaxWidth())
}
fun mailfun(){
    var mailimg = painterResource(id = R.drawable.android_logo)
    Image(painter = mailimg, contentDescription = null, modifier = Modifier.fillMaxWidth())
}*/

@Composable
fun func(){
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Row(Modifier.weight(50f).fillMaxSize()){
            Column {
                logofuc()
                Text(text = "name", )
                Text(text = "name", )
            }
        }
        Row(Modifier.weight(3f)){

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Show() {
    Pratice1Theme {
        func()
    }
}