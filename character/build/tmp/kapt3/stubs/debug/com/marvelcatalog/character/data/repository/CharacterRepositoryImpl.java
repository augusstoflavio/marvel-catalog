package com.marvelcatalog.character.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00062\u0006\u0010\r\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/marvelcatalog/character/data/repository/CharacterRepositoryImpl;", "Lcom/marvelcatalog/character/data/repository/CharacterRepository;", "characterDataSource", "Lcom/marvelcatalog/character/data/dataSource/CharacterDataSource;", "(Lcom/marvelcatalog/character/data/dataSource/CharacterDataSource;)V", "getCharacter", "Lcom/marvelcatalog/character/data/commom/Result;", "Lcom/marvelcatalog/character/data/model/Character;", "characterId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "", "page", "character_debug"})
public final class CharacterRepositoryImpl implements com.marvelcatalog.character.data.repository.CharacterRepository {
    private final com.marvelcatalog.character.data.dataSource.CharacterDataSource characterDataSource = null;
    
    public CharacterRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.marvelcatalog.character.data.dataSource.CharacterDataSource characterDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCharacters(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marvelcatalog.character.data.commom.Result<? extends java.util.List<com.marvelcatalog.character.data.model.Character>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCharacter(int characterId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marvelcatalog.character.data.commom.Result<com.marvelcatalog.character.data.model.Character>> continuation) {
        return null;
    }
}