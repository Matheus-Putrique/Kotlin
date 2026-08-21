package com.example.meu

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeuTheme {
                Scaffold(){
                    Surface(Modifier.padding(it)){
                        Trabalho()
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
    var senha by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(10.dp),
        color = Color(255, 255, 0)

    )  {

        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Cadastro")

            TextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Nome") }

            )

            Spacer(modifier = Modifier.height(30.dp))

            TextField(
                value = senha,
                onValueChange = { senha = it },
                label = { Text("Senha") }

            )

            Button(onClick = {}) {
                Text("Enviar")
            }
        }
    }
}
@Composable
fun Trabalho(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0, 0, 0)
    ) {
        Column() {
            Text("Título")

            Surface(
                shape = RoundedCornerShape(40.dp),
                color = Color(255, 255, 255)

            ) {
                Column() {
                    Row(){
                        Button(onClick = {}) {
                            Text("Botão 1")
                        }
                        Button(onClick = {}){
                            Text("Botão 2")

                        }
                    }
                    Row(){
                        Button(onClick = {}) {
                            Text("Botão 3")
                        }
                        Button(onClick = {}){
                            Text("Botão 4")

                        }
                    }
                }
            }

        }
    }
}

