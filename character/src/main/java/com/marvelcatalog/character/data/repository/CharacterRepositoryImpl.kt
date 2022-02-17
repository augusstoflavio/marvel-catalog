package com.marvelcatalog.character.data.repository

import com.marvelcatalog.character.data.dataSource.CharacterDataSource
import com.marvelcatalog.character.data.model.Character
import com.marvelcatalog.character.core.model.Result

class CharacterRepositoryImpl(
    private val characterDataSource: CharacterDataSource
): CharacterRepository {

    override suspend fun getCharacters(page: Int): Result<List<Character>> {
        return characterDataSource.getCharacters(page)
    }

    override suspend fun getCharacter(characterId: Int): Result<Character> {
        return characterDataSource.getCharacterDetail(characterId)
    }
}