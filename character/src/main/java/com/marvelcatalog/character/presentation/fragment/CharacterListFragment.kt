package com.marvelcatalog.character.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
        characterAdapter.submitList(FakeListCharacter.get())
    }

    private fun onClickCharacter(characterView: CharacterView) {
        findNavController().navigate(
            CharacterListFragmentDirections.toCharacterFragment().setCharacterId(characterView.id)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}