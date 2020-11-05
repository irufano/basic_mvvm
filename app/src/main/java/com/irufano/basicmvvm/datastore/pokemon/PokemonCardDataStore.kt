package com.irufano.basicmvvm.datastore.pokemon

import com.irufano.basicmvvm.model.PokemonCard

interface PokemonCardDataStore {
    suspend fun getPokemons(set: String): MutableList<PokemonCard>?
    suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?)
}