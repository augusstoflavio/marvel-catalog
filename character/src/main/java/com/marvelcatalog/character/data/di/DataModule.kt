package com.marvelcatalog.character.data.di

import com.marvelcatalog.character.data.dataSource.CharacterDataSource
import com.marvelcatalog.character.data.mock.CharacterDataSourceMock
import com.marvelcatalog.character.data.repository.CharacterRepository
import com.marvelcatalog.character.data.repository.CharacterRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DataModule {

    @Provides
    fun provideDataSource(): CharacterDataSource = CharacterDataSourceMock()

    @Binds
    fun provideRepository(characterDataSource: CharacterDataSource): CharacterRepository = CharacterRepositoryImpl(characterDataSource)
}