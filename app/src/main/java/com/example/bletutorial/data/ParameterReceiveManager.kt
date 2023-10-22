package com.example.bletutorial.data

import com.example.bletutorial.util.Resource
import kotlinx.coroutines.flow.MutableSharedFlow

interface ParameterReceiveManager {

    val data: MutableSharedFlow<Resource<ParameterResult>>

    fun reconnect()

    fun disconnect()

    fun StartReceiving()

    fun closeConnection()
}