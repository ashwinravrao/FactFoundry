package com.ashwinrao.factfoundry.viewmodel

import androidx.lifecycle.ViewModel
import com.ashwinrao.factfoundry.data.remote.response.CountryResponse
import com.ashwinrao.factfoundry.data.repository.Repository


class DetailViewModel(private val repository: Repository) : ViewModel() {

    suspend fun fetchCountryResponse(name: String): List<CountryResponse>? =
        repository.fetchCountryResponse(name)

}