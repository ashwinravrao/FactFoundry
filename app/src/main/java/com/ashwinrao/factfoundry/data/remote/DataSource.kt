package com.ashwinrao.factfoundry.data.remote

import com.ashwinrao.factfoundry.data.remote.response.CountryResponse

interface DataSource {

    var fetchedCountryResponse: List<CountryResponse>?

    suspend fun fetchCountryResponse(name: String): List<CountryResponse>?

}