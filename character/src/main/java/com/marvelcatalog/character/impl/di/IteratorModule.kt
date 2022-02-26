package com.marvelcatalog.character.impl.di

import com.marvelcatalog.character.api.CharacterIterator
import com.marvelcatalog.character.data.repository.CharacterRepositoryImpl
import com.marvelcatalog.character.impl.CharacterIteratorImpl
import com.marvelcatalog.character.useCase.GetCharacterDetailUseCase
import com.marvelcatalog.character.useCase.GetCharacterUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class IteratorModule {
    @Binds
    fun provideCharacterIterator(
        getCharacterUseCase: GetCharacterUseCase,
        getCharacterDetailUseCase: GetCharacterDetailUseCase
    ) : CharacterIterator = CharacterIteratorImpl(
        getCharacterUseCase,
        getCharacterDetailUseCase
    )
}