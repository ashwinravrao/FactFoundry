package com.ashwinrao.factfoundry.data.remote

import com.ashwinrao.factfoundry.data.remote.response.CountryResponse
import com.ashwinrao.factfoundry.restcountries_v2_api_base_url
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface RestCountriesService {

    @GET("name/{name}")
    suspend fun getCountry(
        @Path("name") name: String
    ): List<CountryResponse>

    companion object {
        operator fun invoke(): RestCountriesService {
            val okHttpClient = OkHttpClient.Builder().build()
            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(restcountries_v2_api_base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RestCountriesService::class.java)
        }
    }

}