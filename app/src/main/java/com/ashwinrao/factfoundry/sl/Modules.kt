package com.ashwinrao.factfoundry.sl

import com.ashwinrao.factfoundry.data.remote.*
import com.ashwinrao.factfoundry.data.repository.Repository
import com.ashwinrao.factfoundry.data.repository.RepositoryImpl
import com.ashwinrao.factfoundry.viewmodel.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val networkModule = module {

    single { RepositoryImpl(get()) } bind Repository::class

    single { DataSourceImpl(get()) } bind DataSource::class

    single { RestCountriesService(get()) }

    single { ConnectivityInterceptorImpl(androidApplication()) } bind ConnectivityInterceptor::class

}

val viewModelModule = module {

    viewModel { MainViewModel(get()) }

}