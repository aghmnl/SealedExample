package com.agus.sealedexample

import android.os.Bundle
import androidx.activity.ComponentActivity

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
                "error con internet" -> llevarAlSoporteTecnico()
                "rayado" -> eliminarJuego()
                "" -> vender()
                else -> niIdea()

            }
        }
    }

    private fun niIdea() {}
    private fun vender() {}
    private fun eliminarJuego() {}
    private fun llevarAlSoporteTecnico() {}

}



