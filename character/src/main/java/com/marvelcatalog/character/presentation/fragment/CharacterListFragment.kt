package com.marvelcatalog.character.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.marvelcatalog.character.databinding.FragmentCharacterListBinding
import com.marvelcatalog.character.presentation.adapter.CharacterAdapter
import com.marvelcatalog.character.presentation.model.CharacterView

class CharacterListFragment: Fragment() {

    private var _binding: FragmentCharacterListBinding? = null
    private val binding get() = _binding!!
    private lateinit var characterAdapter: CharacterAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCharacterListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        characterAdapter = CharacterAdapter(::onClickCharacter)

        setupView()
        setupObservers()
    }

    private fun setupView() {
        binding.rvCharacters.adapter = characterAdapter
        binding.rvCharacters.layoutManager = LinearLayoutManager(context)
    }

    private fun setupObservers() {
        //TODO alterar para observar do viewModel
        val characteres = listOf(
            CharacterView(
                id = 1,
                name = "Homem de ferro",
                description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean in nulla magna. Sed ac lacinia odio. Cras augue ipsum, auctor semper risus sit amet, aliquam sodales tortor. Aenean lacinia mi sed purus sollicitudin, quis tempus orci iaculis. Duis vitae nisi hendrerit, vestibulum lectus eget, commodo eros",
                thumbnail = "https://hqrock.files.wordpress.com/2013/03/iron_man_movie.jpg?w=386&h=568"
            ),
            CharacterView(
                id = 2,
                name = "Homem aranha",
                description = "Aliquam elementum finibus volutpat. Aenean nec nisi nulla. Ut est felis, tempus vitae quam ut, efficitur dictum turpis. Suspendisse vulputate elit et sapien venenatis sagittis.",
                thumbnail = "https://upload.wikimedia.org/wikipedia/pt/thumb/5/52/Spider-Man.png/250px-Spider-Man.png"
            ),
            CharacterView(
                id = 3,
                name = "Capitão américa",
                description = "Maecenas posuere rhoncus nulla. Proin vestibulum lacus velit, eget blandit sem elementum at. Nunc auctor fermentum fermentum. Nulla sed dolor nisl.",
                thumbnail = "https://upload.wikimedia.org/wikipedia/pt/thumb/b/bc/Steven_Rogers_%28Earth-616%29.jpg/200px-Steven_Rogers_%28Earth-616%29.jpg"
            ),
            CharacterView(
                id = 4,
                name = "Hulk",
                description = "Isse consectetur tincidunt mi et scelerisque. Praesent a nisl et lacus faucibus eleifend. In facilisis justo finibus, viverra tortor ut, maximus tortor. Praesen",
                thumbnail = "https://upload.wikimedia.org/wikipedia/pt/thumb/9/91/Bruce_Banner.jpg/200px-Bruce_Banner.jpg"
            ),
            CharacterView(
                id = 5,
                name = "Viúva negra",
                description = "Aliquam sit amet diam ac augue ullamcorper mollis eu vitae orci.",
                thumbnail = "https://upload.wikimedia.org/wikipedia/pt/thumb/1/1c/Black_Widow_Vol_6_12.jpg/200px-Black_Widow_Vol_6_12.jpg"
            ),
            CharacterView(
                id = 6,
                name = "Capitã Marvel",
                description = "Cras porttitor libero mauris, ut dictum lectus suscipit",
                thumbnail = "https://upload.wikimedia.org/wikipedia/pt/thumb/2/20/Captain_Marvel_Vol_9_3.jpg/200px-Captain_Marvel_Vol_9_3.jpg"
            )
        )

        characterAdapter.submitList(characteres)
    }

    private fun onClickCharacter(characterView: CharacterView) {
        //TODO ir para a tela de visualização do personagem
        Toast.makeText(requireContext(), characterView.name, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}