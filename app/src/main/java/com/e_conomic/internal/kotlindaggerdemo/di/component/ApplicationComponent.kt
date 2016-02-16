package com.e_conomic.internal.kotlindaggerdemo.di.component

import android.content.Context
import android.location.LocationManager
import com.e_conomic.internal.kotlindaggerdemo.MyApplication
import com.e_conomic.internal.kotlindaggerdemo.di.module.ApplicationModule
import com.e_conomic.internal.kotlindaggerdemo.view.BaseActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tudorgk on 15/2/16.
 */

@Singleton
@Component (modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun locationManger() : LocationManager

    fun inject(application: MyApplication)

    fun inject(baseActivity: BaseActivity)

    fun inject(context: Context)
}