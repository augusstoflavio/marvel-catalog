package com.marvelcatalog.character.api

import com.marvelcatalog.character.core.model.Result
import com.marvelcatalog.character.data.model.Character

interface CharacterIterator {

    suspend fun getCharacters(page: Int): Result<List<Character>>
    suspend fun getCharacter(characterId: Int): Result<Character>
}