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
fun MatriculaAlumnoScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(top = 25.dp)){

        var Materia_Curso by rememberSaveable {
            mutableStateOf("")
        }

        var resultado by rememberSaveable {
            mutableStateOf("")
        }

        Column {
            Text(text = "EJERCICIO #3",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            MySpace(16)
            OutlinedTextField(value = Materia_Curso,
                onValueChange = { Materia_Curso = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text ="Ingrese Numero de Materias") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            MySpace(16)
            Button(onClick = {
                resultado = calcularMatricula(Materia_Curso.toInt())
            },
                modifier = Modifier.fillMaxWidth()) {
                Text(text = "EJECUTAR")
            }
            MySpace(espacio = 16)
            Text(text = resultado,
                style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray)
            )
        }
    }
}


fun calcularMatricula(numeroMaterias: Int): String {
    val costoMateria = 520
    val totalCosto = costoMateria * numeroMaterias
    val costoFinal = if (numeroMaterias > 5) totalCosto * 0.9 else totalCosto
    return "El costo total de la matrícula es S/ $costoFinal"
}