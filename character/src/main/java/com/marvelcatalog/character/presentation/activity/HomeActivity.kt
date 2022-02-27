package com.marvelcatalog.character.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.findNavController
import com.marvelcatalog.character.R
import com.marvelcatalog.character.databinding.ActivityHomeBinding
import com.marvelcatalog.character.router.CharacterRoutesImpl

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment)
        val graph = navController.navInflater.inflate(R.navigation.character_nav_graph)

        intent.getStringExtra(CharacterRoutesImpl.PARAM_START_PAGE)?.let {
            configStartPage(graph, navController, it)
        }
    }

    private fun configStartPage(graph: NavGraph, navController: NavController, startPage: String) {
        when (startPage) {
            CharacterRoutesImpl.PAGE_CHARACTER -> setupPageCharacter(graph, navController)
            CharacterRoutesImpl.PAGE_CHARACTER_LIST -> setupPageCharacterList(graph, navController)
        }
    }

    private fun setupPageCharacterList(graph: NavGraph, navController: NavController) {
        graph.startDestination = R.id.characterListFragment
        navController.graph = graph
    }

    private fun setupPageCharacter(graph: NavGraph, navController: NavController) {
        graph.startDestination = R.id.characterFragment
        navController.graph = graph
        val bundle = Bundle().apply {
            putInt(
                "characterId",
                intent.getIntExtra(CharacterRoutesImpl.PARAM_CHARACTER_ID, 0)
            )
        }
        navController.setGraph(graph, bundle)
    }
}