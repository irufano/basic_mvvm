package com.irufano.basicmvvm.repository

import com.irufano.basicmvvm.datastore.PokemonSetDataStore
import com.irufano.basicmvvm.model.PokemonSet

class PokemonSetRepository(
    private val setLocalDataStore: PokemonSetDataStore,
    private val setRemoteDataStore: PokemonSetDataStore
) {
    suspend fun getSets(): MutableList<PokemonSet>? {
        val cache = setLocalDataStore.getSets()
        if (cache != null) return cache
        val response = setRemoteDataStore.getSets()
        setLocalDataStore.addAll(response)
        return response
    }
}