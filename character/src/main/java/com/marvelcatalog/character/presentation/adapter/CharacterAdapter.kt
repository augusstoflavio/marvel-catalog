package com.marvelcatalog.character.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.marvelcatalog.character.databinding.AdapterCharacterBinding
import com.marvelcatalog.character.presentation.model.CharacterView
import com.marvelcatalog.commons.extensions.loadImage

class CharacterAdapter(
    private val onClickListener: (CharacterView) -> Unit
): ListAdapter<CharacterView, CharacterAdapter.CharacterViewHolder>(CharacterAdapter) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding = AdapterCharacterBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding, onClickListener)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class CharacterViewHolder(
        private val binding: AdapterCharacterBinding,
        private val onClickListener: (CharacterView) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(characterView: CharacterView) {
            binding.ivThumbnail.loadImage(binding.root.context, characterView.thumbnail)
            binding.tvName.text = characterView.name
            binding.tvDescription.text = characterView.description
            binding.root.setOnClickListener {
                onClickListener.invoke(characterView)
            }
        }
    }

    private companion object : DiffUtil.ItemCallback<CharacterView>() {
        override fun areItemsTheSame(oldItem: CharacterView, newItem: CharacterView): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CharacterView, newItem: CharacterView): Boolean {
            return oldItem == newItem
        }
    }
}