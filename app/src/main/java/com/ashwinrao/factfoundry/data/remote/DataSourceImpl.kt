package com.ashwinrao.factfoundry.data.remote

import android.util.Log
import com.ashwinrao.factfoundry.data.remote.response.CountryResponse
import retrofit2.HttpException
import java.io.IOException

class DataSourceImpl(private val service: RestCountriesService) : DataSource {

    private val tag = "DataSource"

    override var fetchedCountryResponse: List<CountryResponse>? = null

    override suspend fun fetchCountryResponse(name: String): List<CountryResponse>? {
        try {
            fetchedCountryResponse = service.getCountry(name)
        } catch (e: NoConnectionException) {
            Log.e(tag, e.message!!)
        } catch (f: HttpException) {
            Log.e(tag, f.message())
        }
        return fetchedCountryResponse
    }

    inner class NoConnectionException(message: String) : IOException(message) {
        override val message: String? = "Not connected to the internet. Try again later."
    }
}