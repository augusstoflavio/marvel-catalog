package com.marvelcatalog.character.data.repository

import com.marvelcatalog.character.data.commom.Result
import com.marvelcatalog.character.data.model.Character

interface CharacterRepository {

    suspend fun getCharacters(page: Int): Result<List<Character>>
    suspend fun getCharacter(characterId: Int): Result<Character>
}