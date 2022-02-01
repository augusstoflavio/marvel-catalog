package com.marvelcatalog.api.datasource.character

import com.marvelcatalog.api.model.CharacterDataWrapper
import io.ktor.client.*
import io.ktor.client.request.*

class CharacterApi(private val httpClient: HttpClient) {

    suspend fun getCharacters(page: Int) =
        httpClient.get<CharacterDataWrapper>("/v1/public/characters") {
            parameter("offset", page)
        }

    suspend fun getCharacterDetail(characterId: Int) =
        httpClient.get<CharacterDataWrapper>("/v1/public/characters/$characterId")
}