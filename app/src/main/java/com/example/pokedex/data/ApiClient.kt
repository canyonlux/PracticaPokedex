package com.example.pokedex.data

import com.example.pokedex.data.PokeModelDetails
import com.example.pokedex.data.ResultApi
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    @GET(value = "pokemon?limit=1154")
    suspend fun getListPokemon(): Response<ResultApi>

    @GET(value = "pokemon/{id}")
    suspend fun getDetailsPokemon(@Path("id") id: Int): Response<PokeModelDetails>
}
