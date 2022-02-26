package com.marvelcatalog.character.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marvelcatalog.character.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}