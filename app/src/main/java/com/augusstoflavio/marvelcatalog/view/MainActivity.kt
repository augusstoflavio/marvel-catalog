package com.augusstoflavio.marvelcatalog.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.augusstoflavio.marvelcatalog.R
import com.marvelcatalog.character.router.CharacterRoutesImpl

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_go_to_character_list).setOnClickListener {
            //TODO deve ser injetado um objeto de CharacterRoutes
            val router = CharacterRoutesImpl()
            router.goListCharacters(this)
        }

        findViewById<Button>(R.id.btn_go_to_character).setOnClickListener {
            //TODO deve ser injetado um objeto de CharacterRoutes
            val router = CharacterRoutesImpl()
            router.goCharacter(this, 2)
        }
    }
}