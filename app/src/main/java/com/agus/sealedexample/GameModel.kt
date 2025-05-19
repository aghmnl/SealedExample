package com.agus.sealedexample

data class GameModel(val title: String, val serialNumber: Number, val error: GameError)

sealed class GameError() {
    // Los objetos de la sealed class suelen ir en mayúscula
    object RayadoError : GameError()
    object InternetError : GameError()
    object NoError : GameError()
    object CongeladoError : GameError()

    // Si el juego falla con determinadas versiones, voy a necesitar la versión por parámetro
    data class VersionError(val version: String) : GameError()
}
