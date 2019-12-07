package com.ashwinrao.factfoundry

import android.app.Application
import com.ashwinrao.factfoundry.di.AppComponent
import com.ashwinrao.factfoundry.di.DaggerAppComponent
import com.ashwinrao.factfoundry.di.NetworkModule

class FactFoundry : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent =
            DaggerAppComponent
                .builder()
                .networkModule(NetworkModule(this))
                .build()
    }

}