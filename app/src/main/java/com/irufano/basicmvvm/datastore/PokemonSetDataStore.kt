package com.irufano.basicmvvm.datastore

import com.irufano.basicmvvm.model.PokemonSet

interface PokemonSetDataStore {
    suspend fun getSets(): MutableList<PokemonSet>?
    suspend fun addAll(sets: MutableList<PokemonSet>?)
}