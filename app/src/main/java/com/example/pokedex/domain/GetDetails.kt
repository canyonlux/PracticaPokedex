package com.example.pokedex.domain

import com.example.pokedex.data.PokeRepository
import com.example.pokedex.domain.PokeItemDetails

class GetDetails {

    private val repository = PokeRepository()

    suspend fun fromPokemon(id: Int): PokeItemDetails? {
        return repository.getPokeDetails(id)
    }
}