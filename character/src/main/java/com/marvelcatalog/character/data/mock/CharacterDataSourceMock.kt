package com.marvelcatalog.character.data.mock

import com.marvelcatalog.character.core.model.Result
import com.marvelcatalog.character.data.dataSource.CharacterDataSource
import com.marvelcatalog.character.api.Character

class CharacterDataSourceMock: CharacterDataSource {

    private val characters = listOf(
        Character(
            id = 1,
            name = "Homem de ferro",
            description = "Homem de ferro descrição",
            thumbnail = ""
        ),
        Character(
            id = 2,
            name = "Homem Aranha",
            description = "Homem Aranha",
            thumbnail = ""
        )
    )

    override suspend fun getCharacters(page: Int): Result<List<Character>> {
        return Result.Success(characters)
    }

    override suspend fun getCharacterDetail(characterId: Int): Result<Character> {
        return Result.Success(characters.first { it.id == characterId })
    }
}