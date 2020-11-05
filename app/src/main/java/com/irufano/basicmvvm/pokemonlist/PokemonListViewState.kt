package com.irufano.basicmvvm.pokemonlist

import com.irufano.basicmvvm.model.PokemonCard

data class PokemonListViewState (
    val loading: Boolean = false,
    val error: Exception? = null,
    val data: MutableList<PokemonCard>? = null
)