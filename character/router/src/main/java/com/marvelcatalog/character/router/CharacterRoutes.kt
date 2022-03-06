package com.marvelcatalog.character.router

import android.app.Activity

interface CharacterRoutes {

    fun goListCharacters(fromActivity: Activity)
    fun goCharacter(fromActivity: Activity, characterId: Int)
}