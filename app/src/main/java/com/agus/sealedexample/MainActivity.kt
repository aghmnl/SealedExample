package com.agus.sealedexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.agus.sealedexample.ui.theme.SealedExampleTheme

class MainActivity : ComponentActivity() {

    val gameList = listOf<GameModel>(
        GameModel("Mario 1", 123452345, "error con internet"),
        GameModel("Mario 2", 215648412, "rayado"),
        GameModel("Mario 3", 785135744, "")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gameList.forEach { gameModel ->
            when (gameModel.error) {
                "error con internet" -> println("Error: ${gameModel.error}")
                "rayado" -> println("Rayado: ${gameModel.error}")
                "" -> println("No hay error")
                else -> println("Error desconocido")

            }
        }
//        enableEdgeToEdge()
//        setContent {
//            SealedExampleTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
}

