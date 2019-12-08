package com.ashwinrao.factfoundry.util

import android.content.Context
import android.net.ConnectivityManager

object NetworkAvailability {

    @Suppress("DEPRECATION")
    fun isNetworkAvailable(applicationContext: Context?): Boolean {
        val connectivityManager =
            applicationContext?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        val activeNetworkInfo = connectivityManager!!.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting
    }

}