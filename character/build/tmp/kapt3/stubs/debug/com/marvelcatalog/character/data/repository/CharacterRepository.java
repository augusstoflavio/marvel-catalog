package com.marvelcatalog.character.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00032\u0006\u0010\n\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/marvelcatalog/character/data/repository/CharacterRepository;", "", "getCharacter", "Lcom/marvelcatalog/character/core/model/Result;", "Lcom/marvelcatalog/character/api/Character;", "characterId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "", "page", "character_debug"})
public abstract interface CharacterRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacters(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marvelcatalog.character.core.model.Result<? extends java.util.List<com.marvelcatalog.character.api.Character>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacter(int characterId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marvelcatalog.character.core.model.Result<com.marvelcatalog.character.api.Character>> continuation);
}