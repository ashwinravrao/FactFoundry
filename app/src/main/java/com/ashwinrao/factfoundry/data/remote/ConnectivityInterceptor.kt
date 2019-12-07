package com.ashwinrao.factfoundry.data.remote

import okhttp3.Interceptor
import okhttp3.Response

interface ConnectivityInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response

    fun isNetworkAvailable(): Boolean
}