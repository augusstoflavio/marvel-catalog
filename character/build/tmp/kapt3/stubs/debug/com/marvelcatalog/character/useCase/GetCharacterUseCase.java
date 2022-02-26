package com.marvelcatalog.character.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/marvelcatalog/character/useCase/GetCharacterUseCase;", "", "characterRepository", "Lcom/marvelcatalog/character/data/repository/CharacterRepository;", "(Lcom/marvelcatalog/character/data/repository/CharacterRepository;)V", "invoke", "Lcom/marvelcatalog/character/core/model/Result;", "", "Lcom/marvelcatalog/character/api/Character;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "character_debug"})
public final class GetCharacterUseCase {
    private final com.marvelcatalog.character.data.repository.CharacterRepository characterRepository = null;
    
    public GetCharacterUseCase(@org.jetbrains.annotations.NotNull()
    com.marvelcatalog.character.data.repository.CharacterRepository characterRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marvelcatalog.character.core.model.Result<? extends java.util.List<com.marvelcatalog.character.api.Character>>> continuation) {
        return null;
    }
}