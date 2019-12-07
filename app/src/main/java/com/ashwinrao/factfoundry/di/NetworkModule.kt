package com.ashwinrao.factfoundry.di

import android.app.Application
import com.ashwinrao.factfoundry.data.remote.ConnectivityInterceptor
import com.ashwinrao.factfoundry.data.remote.ConnectivityInterceptorImpl
import com.ashwinrao.factfoundry.data.remote.DataSource
import com.ashwinrao.factfoundry.data.remote.DataSourceImpl
import com.ashwinrao.factfoundry.data.repository.Repository
import com.ashwinrao.factfoundry.data.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideRepository(): Repository = RepositoryImpl()

    @Provides
    @Singleton
    fun provideDataSource(): DataSource = DataSourceImpl()

    @Provides
    @Singleton
    fun provideConnectivityInterceptor(): ConnectivityInterceptor =
        ConnectivityInterceptorImpl(application)

}