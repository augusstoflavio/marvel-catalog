package com.marvelcatalog.character.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.marvelcatalog.character.databinding.FragmentCharacterBinding
import com.marvelcatalog.character.presentation.model.CharacterView
import com.marvelcatalog.commons.extensions.loadImage

class CharacterFragment: Fragment() {

    private var _binding: FragmentCharacterBinding? = null
    private val binding get() = _binding!!
    val args: CharacterFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FakeListCharacter.find(args.characterId)?.let {
            setupView(it)
        }
    }

    private fun setupView(it: CharacterView) {
        with(binding) {
            ivThumbnail.loadImage(it.thumbnail)
            tvTitle.text = it.name
            tvDescription.text = it.description
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}