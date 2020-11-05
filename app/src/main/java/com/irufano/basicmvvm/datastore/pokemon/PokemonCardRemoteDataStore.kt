package com.irufano.basicmvvm.datastore.pokemon

import com.irufano.basicmvvm.model.PokemonCard
import com.irufano.basicmvvm.webservice.PokemonTcgService

class PokemonCardRemoteDataStore(private val pokemonTcgService: PokemonTcgService) : PokemonCardDataStore {
    override suspend fun getPokemons(set: String): MutableList<PokemonCard>? {
        val response = pokemonTcgService.getCards(set)
        if (response.isSuccessful) return response.body()?.cards

        throw Exception("Terjadi kesalahan saat melakukan request data, status error ${response.code()}")
    }

    override suspend fun addAll(set: String, pokemons: MutableList<PokemonCard>?) {
    }
}