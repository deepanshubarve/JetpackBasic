package com.example.jetpackintro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          layout()
        
        }
    }
    @Composable
    fun layout(){
        var context = LocalContext.current
        Box (modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Hemant",
                color = Color.Blue,
                modifier = Modifier.align(Alignment.Center),
                fontSize = 28.sp
            )
            Text(
                text = "Sahu",
                color = Color.Green,
                modifier = Modifier.align(Alignment.TopCenter),
                fontSize = 28.sp
            )
            Text(
                text = "british",
                color = Color.Red,
                modifier = Modifier.align(Alignment.BottomCenter),
                fontSize = 28.sp
            )
            Button(onClick = {
                Toast.makeText(context,"Button clicked",Toast.LENGTH_SHORT).show()
            },modifier = Modifier.align(Alignment.CenterEnd)) {
                Text(text = "Button Clicked")
            }

        }

    }

    @Composable
    fun card(){
        Card(
            modifier = Modifier.padding(horizontal = 8.dp).fillMaxWidth().height(200.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()

            ) {
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground)
                    , contentDescription = null,
                    modifier = Modifier.padding(8.dp))

                Text(text = "the photo is of deepanskar")
            }
            
        }
    }
}



