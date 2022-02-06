package com.marvelcatalog.character.data.dataSource

import com.marvelcatalog.character.data.commom.Result
import com.marvelcatalog.character.data.model.Character

interface CharacterDataSource {

    suspend fun getCharacters(page: Int): Result<List<Character>>
    suspend fun getCharacterDetail(characterId: Int): Result<Character>
}