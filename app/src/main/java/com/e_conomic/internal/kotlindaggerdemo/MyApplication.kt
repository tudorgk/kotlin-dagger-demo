package com.e_conomic.internal.kotlindaggerdemo

import android.app.Application
import android.location.LocationManager
import android.util.Log

import com.e_conomic.internal.kotlindaggerdemo.di.component.ApplicationComponent
import com.e_conomic.internal.kotlindaggerdemo.di.component.DaggerApplicationComponent
import com.e_conomic.internal.kotlindaggerdemo.di.module.ApplicationModule
import javax.inject.Inject

/**
 * Created by tudorgk on 15/2/16.
 */
class MyApplication : Application() {
    companion object {

        @JvmStatic lateinit var applicationComponentGraph: ApplicationComponent
    }

    @Inject
    lateinit var locationManager: LocationManager


    override fun onCreate(){
        super.onCreate()


        applicationComponentGraph = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()

        //applicationComponentGraph.inject(this)
        //locationManager = applicationComponentGraph.locationManger()

        Log.d("Location manager", locationManager.toString())
    }

    fun getAppComponent(): ApplicationComponent {
        return applicationComponentGraph
    }
}