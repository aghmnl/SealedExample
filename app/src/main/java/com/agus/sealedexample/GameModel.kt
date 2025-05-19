package com.agus.sealedexample

data class GameModel(val title: String, val serialNumber: Number, val error: GameError) {

}

sealed class GameError() {
    object RayadoError : GameError()  // Los objetos de la sealed class suelen ir en mayúscula
    object InternetError : GameError()
    object NoError : GameError()
}
