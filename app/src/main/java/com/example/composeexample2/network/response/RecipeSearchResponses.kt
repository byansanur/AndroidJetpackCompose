package com.example.composeexample2.network.response

import com.example.composeexample2.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

class RecipeSearchResponses(
    @SerializedName("count")
    var count: Int,

    @SerializedName("result")
    var recipes: List<RecipeNetworkEntity>,
)