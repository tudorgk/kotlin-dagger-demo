package com.e_conomic.internal.kotlindaggerdemo.di.module

import com.e_conomic.internal.kotlindaggerdemo.model.Motor
import com.e_conomic.internal.kotlindaggerdemo.model.Vehicle
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by tudorgk on 15/2/16.
 */
@Module
class VehicleModule {

    @Provides
    @Singleton
    fun provideMotor() : Motor = Motor()

    @Provides
    @Singleton
    fun provideVehicle() : Vehicle = Vehicle(motor = Motor())
}