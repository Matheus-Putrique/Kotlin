package com.example.meu

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meu.ui.theme.MeuTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeuTheme {
                Scaffold(){
                    Surface(Modifier.padding(it)){
                        Formulario()
                    }
                }
            }
        }
    }
}

@Composable
fun PrimeiraTela(modifier: Modifier = Modifier) {

    var contador by remember{mutableStateOf(0)}

    Column(modifier = modifier) {
        Text("Olá mundo!")
        Text("Olá mundo!")
        Text("Olá mundo!")
        Text("Olá mundo!")
        Text("Olá mundo!")

        Text("Contador: $contador")

        Button(
            onClick = {
                contador++
                Log.d("btn", "contador atual: $contador")
            }
        ) {
            Text("Clique aqui")
        }

        Button(
            onClick = {
                contador = 0
            }
        ){
            Text("Zerar contador")
        }
        Button(
            onClick = {
                contador--
            }
        ){
            Text("Diminuir 1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrimeiraTelaPreview() {
    MeuTheme {
        PrimeiraTela()
    }
}


@Composable
fun Formulario(){

    var nome by remember { mutableStateOf("") }

    Column() {
        Text("Cadastro")

        TextField(
            value = nome,
            onValueChange = {nome = it},
            label = { Text("Nome") }

        )

        Button(onClick = {}) {
            Text("Enviar")
        }
    }
}