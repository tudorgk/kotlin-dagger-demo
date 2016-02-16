package com.e_conomic.internal.kotlindaggerdemo.di.component

import com.e_conomic.internal.kotlindaggerdemo.model.Vehicle
import com.e_conomic.internal.kotlindaggerdemo.di.module.VehicleModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tudorgk on 15/2/16.
 */
@Singleton
@Component(modules = arrayOf(VehicleModule::class))
interface VehicleComponent {
    fun provideVehicle() : Vehicle
}