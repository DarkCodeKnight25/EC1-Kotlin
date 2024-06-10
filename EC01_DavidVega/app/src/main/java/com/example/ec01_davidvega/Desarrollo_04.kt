package com.example.ec01_davidvega

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CuadradoYMitadScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = 25.dp)){


        var resultado by rememberSaveable {
            mutableStateOf("")
        }

        Column {
            Text(text = "CUADRADO Y MITAD",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )

            MySpace(16)
            Button(onClick = {
                resultado = calcularCuadradoYMitad()
            },
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "CALCULAR")
            }
            MySpace(espacio = 16)
            Text(text = resultado,
                style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray)
            )
        }
    }
}

fun calcularCuadradoYMitad(): String {
    val resultados = StringBuilder()
    for (i in 15..70) {
        val cuadrado = i * i
        val mitad = i / 2.0
        resultados.append("Número: $i, Cuadrado: $cuadrado, Mitad: $mitad\n")
    }
    return resultados.toString()
}