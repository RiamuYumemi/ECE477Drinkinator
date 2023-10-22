package com.example.bletutorial.data

data class ParameterResult(
    val temperature:Float,
    val motorSetting:Int,
    val timer:Int,
    val connectionState: ConnectionState
)
