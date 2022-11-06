package edu.ar.parcial_tp3.`interface`

import androidx.annotation.NonNull
import edu.ar.parcial_tp3.data.Character
import edu.ar.parcial_tp3.data.CharactersResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface rickAndMortyAPI {
    @GET("api/character")
    fun getListCharacters(): Call<CharactersResponse?>?

    @GET("api/character/{characterId}")
    fun getCharacterById(@Path("characterId") characterId: Int ):Call<Character?>?

    @GET("api/character/{charactersIds}")
    fun getFavoriteCharacters(@Path("charactersIds") charactersIds:String):Call<List<Character?>?>?

}