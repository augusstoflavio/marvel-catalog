package com.marvelcatalog.character.useCase

import com.marvelcatalog.character.data.repository.CharacterRepository
import com.marvelcatalog.character.data.commom.Result
import com.marvelcatalog.character.data.model.Character


class GetCharacterDetailUseCase(private val characterRepository: CharacterRepository) {

    suspend operator fun invoke(characterId: Int): Result<Character> {
        return characterRepository.getCharacter(characterId)
    }
}