package com.e_conomic.internal.kotlindaggerdemo.di.module

import android.app.Application
import android.content.Context
import android.location.LocationManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by tudorgk on 15/2/16.
 */
@Module
class ApplicationModule (private val application: Application){

    @Provides
    @Singleton
    fun provideApplicationContext() : Context {
        return application
    }

    @Provides
    @Singleton
    fun provideLocationManager() : LocationManager{
        return application.getSystemService(Context.LOCATION_SERVICE) as LocationManager
    }
}