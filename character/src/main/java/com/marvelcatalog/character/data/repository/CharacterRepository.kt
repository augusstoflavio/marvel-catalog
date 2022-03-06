package com.marvelcatalog.character.data.repository

import com.marvelcatalog.character.api.Character
import com.marvelcatalog.character.core.model.Result

interface CharacterRepository {

    suspend fun getCharacters(page: Int): Result<List<Character>>
    suspend fun getCharacter(characterId: Int): Result<Character>
}