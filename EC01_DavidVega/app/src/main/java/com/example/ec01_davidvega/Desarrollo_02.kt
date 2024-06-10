package com.example.ec01_davidvega


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenorNUmeroScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = 25.dp)){

        var Primera by rememberSaveable {
            mutableStateOf("")
        }
        var Segunda by rememberSaveable {
            mutableStateOf("")
        }
        var Tercera by rememberSaveable {
            mutableStateOf("")
        }
        var Cuarta by rememberSaveable {
            mutableStateOf("")
        }

        var resultado by rememberSaveable {
            mutableStateOf("")
        }

        Column {
            Text(text = "NUMERO MENOR",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            MySpace(16)
            OutlinedTextField(value = Primera,
                onValueChange = { Primera = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text ="Primer Numero") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            MySpace(16)
            OutlinedTextField(value = Segunda,
                onValueChange = { Segunda = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text ="Segundo Numero") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            MySpace(16)
            OutlinedTextField(value = Tercera,
                onValueChange = { Tercera = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text ="Tecer Numero") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            MySpace(16)
            OutlinedTextField(value = Cuarta,
                onValueChange = { Cuarta = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text ="Cuato Numero") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            MySpace(16)
            Button(onClick = {
                resultado = calcularMenorNumero(
                    Primera.toInt(), Segunda.toInt(), Tercera.toInt(), Cuarta.toInt()
                )

            },
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "CALCULAR MENOR")
            }
            MySpace(espacio = 16)
            Text(text = resultado,
                style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray)
            )
        }
    }
}


fun calcularMenorNumero(n1: Int, n2: Int, n3: Int, n4: Int): String {
    val menor = minOf(n1, n2, n3, n4)
    return "El menor número es: $menor"
}