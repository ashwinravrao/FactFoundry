package com.ashwinrao.factfoundry.sl

import com.ashwinrao.factfoundry.data.remote.DataSource
import com.ashwinrao.factfoundry.data.remote.DataSourceImpl
import com.ashwinrao.factfoundry.data.remote.RestCountriesService
import com.ashwinrao.factfoundry.data.repository.Repository
import com.ashwinrao.factfoundry.data.repository.RepositoryImpl
import com.ashwinrao.factfoundry.viewmodel.DetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val networkModule = module {

    single { RepositoryImpl(get()) } bind Repository::class

    single { DataSourceImpl(get()) } bind DataSource::class

    single { RestCountriesService() }

//    single { ConnectivityInterceptorImpl(androidApplication()) } bind ConnectivityInterceptor::class

    viewModel { DetailViewModel(get()) }

}