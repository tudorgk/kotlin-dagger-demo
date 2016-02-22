package com.e_conomic.internal.kotlindaggerdemo.di.module

import com.e_conomic.internal.kotlindaggerdemo.model.Motor
import com.e_conomic.internal.kotlindaggerdemo.model.Vehicle
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by tudorgk on 15/2/16.
 */
@Module
class VehicleModule {

    @Provides
    @Singleton
    @Named("V12")
    fun provideV12() : Motor = Motor()


    @Provides
    @Singleton
    @Named("V8")
    fun provideV8() : Motor {
        return Motor()
    }



    @Provides
    @Singleton
    fun provideVehicle() : Vehicle = Vehicle(motor = Motor(), motor2 = Motor())
}