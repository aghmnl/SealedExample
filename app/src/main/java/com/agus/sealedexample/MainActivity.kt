package com.agus.sealedexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.agus.sealedexample.GameError.*

class MainActivity : ComponentActivity() {

    val gameList = listOf<GameModel>(
        GameModel("Mario 1", 123452345, InternetError),
        GameModel("Mario 2", 215648412, RayadoError),
        GameModel("Mario 3", 785135744, NoError)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gameList.forEach { gameModel ->
            when (gameModel.error) {
                InternetError -> llevarAlSoporteTecnico()
                RayadoError -> eliminarJuego()
                NoError -> vender()
            }
        }
    }

//    private fun niIdea() {}
    private fun vender() {}
    private fun eliminarJuego() {}
    private fun llevarAlSoporteTecnico() {}
}



