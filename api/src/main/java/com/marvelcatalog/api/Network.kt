package com.marvelcatalog.api

import com.marvelcatalog.api.exception.NoConnectionException
import com.marvelcatalog.data.common.Result
import io.ktor.client.features.*
import java.lang.Exception

class Network {

    fun isConnected(): Boolean {
        //TODO check if it is connected
        return true
    }

    suspend fun <T> request(a: suspend () -> T): Result<T> {
        if (!isConnected()) {
            return Result.Error(NoConnectionException())
        }

        return try {
            Result.Success(
                a.invoke()
            )
        } catch (e: ServerResponseException) {
            Result.Error(
                com.marvelcatalog.api.exception.ServerResponseException()
            )
        } catch (e: ClientRequestException) {
            Result.Error(
                com.marvelcatalog.api.exception.ClientRequestException(e.response.status.value)
            )
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}