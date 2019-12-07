package com.ashwinrao.factfoundry

import android.app.Application
import com.ashwinrao.factfoundry.sl.networkModule
import com.ashwinrao.factfoundry.sl.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FactFoundry : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@FactFoundry)
            modules(listOf(networkModule, viewModelModule))
        }
    }

}