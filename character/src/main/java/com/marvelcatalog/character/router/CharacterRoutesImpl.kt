package com.marvelcatalog.character.router

import android.app.Activity
import android.content.Intent
import com.marvelcatalog.character.presentation.activity.HomeActivity

//TODO essa classe deve ser uma implementação de CharacterRoutes
class CharacterRoutesImpl {

    fun goHome(fromActivity: Activity) {
        fromActivity.startActivity(
            Intent(fromActivity, HomeActivity::class.java)
        )
    }
}