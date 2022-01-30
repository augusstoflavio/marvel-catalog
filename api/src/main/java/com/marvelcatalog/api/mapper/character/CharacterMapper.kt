package com.marvelcatalog.api.mapper.character

import com.marvelcatalog.api.model.CharacterResponse
import com.marvelcatalog.data.model.Character

object CharacterMapper {

    fun responseToModel(characterResponse: CharacterResponse) = Character(
        id = characterResponse.id,
        name = characterResponse.name ?: "",
        description = characterResponse.description,
        thumbnail = characterResponse.thumbnail,
    )
}