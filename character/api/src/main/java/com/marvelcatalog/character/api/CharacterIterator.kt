package com.marvelcatalog.character.api

import com.marvelcatalog.character.core.model.Result

interface CharacterIterator {

    suspend fun getCharacters(page: Int): Result<List<Character>>
    suspend fun getCharacter(characterId: Int): Result<Character>
}