
package com.example.apptarjetaspresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apptarjetaspresentacion.ui.theme.AppTarjetasPresentacionTheme


val Fondo = Color(0xFFD2E5D3)
val Verde = Color(0xFF006D3B)
val VerdeAndroid = Color(0xFF3DDC84)
val AzulOscuro = Color(0xFF073042)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppTarjetasPresentacionTheme {
                TarjetaPresentacion()
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun TarjetaPresentacion() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Fondo)
            .safeDrawingPadding()
    ) {

        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-45).dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Logo de Android",
                modifier = Modifier.size(104.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Fidel Aguilar",
                fontSize = 42.sp,
                fontWeight = FontWeight.Light,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Android Developer Pro",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Verde,
                textAlign = TextAlign.Center
            )
        }


        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 48.dp)
                .width(300.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            FilaContacto(

                texto = "+591 677678182"
            )

            FilaContacto(

                texto = "@fidelaguilar2006"
            )

            FilaContacto(

                texto = "fidiaguilar@gmail.com"
            )
        }
    }
}

@Composable
fun FilaContacto(
    texto: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {


        Spacer(modifier = Modifier.width(24.dp))

        Text(
            text = texto,
            fontSize = 14.sp,
            color = Color.Black
        )
    }
}
