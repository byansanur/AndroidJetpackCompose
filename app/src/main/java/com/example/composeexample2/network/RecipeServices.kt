package com.example.composeexample2.network

import com.example.composeexample2.network.model.RecipeNetworkEntity
import com.example.composeexample2.network.response.RecipeSearchResponses
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecipeServices {

    @GET("search")
    suspend fun searchRecipe(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("query") query: String
    ) : RecipeSearchResponses

    @GET("get")
    suspend fun get(
        @Header("Authorization") token: String,
        @Query("id") id: Long
    ) : RecipeNetworkEntity

}