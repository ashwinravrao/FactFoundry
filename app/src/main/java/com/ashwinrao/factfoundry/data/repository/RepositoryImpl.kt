package com.ashwinrao.factfoundry.data.repository

import com.ashwinrao.factfoundry.data.remote.DataSource
import com.ashwinrao.factfoundry.data.remote.response.CountryResponse


class RepositoryImpl(private val dataSource: DataSource) : Repository {

    override suspend fun fetchCountryResponse(name: String): List<CountryResponse>? =
        dataSource.fetchCountryResponse(name)

}