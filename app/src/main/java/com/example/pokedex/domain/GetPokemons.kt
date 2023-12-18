package com.example.pokedex.domain

import com.example.pokedex.data.PokeRepository
import com.example.pokedex.domain.PokeItem

class GetPokemons {

    private val repository = PokeRepository()

    suspend fun listAll(): List<PokeItem> {
        return repository.getAllPokemons()
    }
}