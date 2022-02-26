package com.marvelcatalog.character.domain.di

import com.marvelcatalog.character.data.repository.CharacterRepository
import com.marvelcatalog.character.useCase.GetCharacterDetailUseCase
import com.marvelcatalog.character.useCase.GetCharacterUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DomainModule {

    @Binds
    fun provideGetCharacterDetail(repository: CharacterRepository) = GetCharacterDetailUseCase(repository)

    @Binds
    fun provideGetCharacter(repository: CharacterRepository) = GetCharacterUseCase(repository)
}