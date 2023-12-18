package com.example.pokedex.data

import com.example.pokedex.data.ApiService
import com.example.pokedex.domain.PokeItem
import com.example.pokedex.domain.PokeItemDetails
import com.example.pokedex.domain.toDomain

class PokeRepository {

    private val api = ApiService()

    suspend fun getAllPokemons(): List<PokeItem> {
        val response = api.getPokemons()
        return response.map { it.toDomain() }
    }

    suspend fun getPokeDetails(id: Int): PokeItemDetails? {
        val response = api.getDetailsPokemon(id)
        return response?.toDomain()
    }
}