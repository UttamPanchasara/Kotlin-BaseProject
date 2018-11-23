package com.uttampanchasara.network.remote

import com.uttampanchasara.network.response.RecipeResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiServices {
    @GET("{q}")
    fun getRecipes(@Path("q") query: String): Observable<RecipeResponse>
}