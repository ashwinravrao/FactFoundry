package com.ashwinrao.factfoundry.data.repository

import com.ashwinrao.factfoundry.data.remote.response.CountryResponse

interface Repository {

    suspend fun fetchCountryResponse(name: String): List<CountryResponse>?

}