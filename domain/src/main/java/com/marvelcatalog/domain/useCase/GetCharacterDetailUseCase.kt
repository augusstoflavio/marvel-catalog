package com.marvelcatalog.domain.useCase

import com.marvelcatalog.data.common.Result
import com.marvelcatalog.data.model.Character
import com.marvelcatalog.data.repository.CharacterRepository

class GetCharacterDetailUseCase(private val characterRepository: CharacterRepository) {

    suspend operator fun invoke(characterId: Int): Result<Character> {
        return characterRepository.getCharacter(characterId)
    }
}