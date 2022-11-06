package edu.ar.parcial_tp3.api

import edu.ar.parcial_tp3.`interface`.rickAndMortyAPI
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.logging.Level

class RickAndMortyService {
    private val BASE_URL=""
    companion object {
    fun create(baseUrl: String): rickAndMortyAPI{
        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }
        val client = OkHttpClient.Builder()
            .addInterceptor(logger)
            .build()
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(rickAndMortyAPI::class.java)
    }

    }
    }