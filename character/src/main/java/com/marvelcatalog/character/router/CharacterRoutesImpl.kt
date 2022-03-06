package com.marvelcatalog.character.router

import android.app.Activity
import android.content.Intent
import com.marvelcatalog.character.presentation.activity.HomeActivity

//TODO essa classe deve ser uma implementação de CharacterRoutes
class CharacterRoutesImpl {

    fun goListCharacters(fromActivity: Activity) {
        fromActivity.startActivity(
            Intent(fromActivity, HomeActivity::class.java).apply {
                putExtra(PARAM_START_PAGE, PAGE_CHARACTER_LIST)
            }
        )
    }

    fun goCharacter(fromActivity: Activity, characterId: Int) {
        fromActivity.startActivity(
            Intent(fromActivity, HomeActivity::class.java).apply {
                putExtra(PARAM_START_PAGE, PAGE_CHARACTER)
                putExtra(PARAM_CHARACTER_ID, characterId)
            }
        )
    }

    companion object {
        const val PARAM_START_PAGE = "START_DESTINATION"
        const val PAGE_CHARACTER_LIST = "CHARACTER_LIST"
        const val PAGE_CHARACTER = "CHARACTER"
        const val PARAM_CHARACTER_ID = "CHARACTER_ID"
    }
}