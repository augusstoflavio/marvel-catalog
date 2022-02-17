package com.marvelcatalog.character.impl

import com.marvelcatalog.character.api.CharacterIterator
import com.marvelcatalog.character.core.model.Result
import com.marvelcatalog.character.data.model.Character
import com.marvelcatalog.character.useCase.GetCharacterDetailUseCase
import com.marvelcatalog.character.useCase.GetCharacterUseCase

class CharacterIteratorImpl(
    private val getCharacterUseCase: GetCharacterUseCase,
    private val getCharacterDetailUseCase: GetCharacterDetailUseCase
): CharacterIterator {

    override suspend fun getCharacters(page: Int): Result<List<Character>> {
        return getCharacterUseCase.invoke(page)
    }

    override suspend fun getCharacter(characterId: Int): Result<Character> {
        return getCharacterDetailUseCase.invoke(characterId)
    }

}