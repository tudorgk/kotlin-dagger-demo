package com.e_conomic.internal.kotlindaggerdemo.model

import javax.inject.Inject
import javax.inject.Named


/**
 * Created by tudorgk on 15/2/16.
 */

class Vehicle @Inject constructor (@Named("V12") motor: Motor, @Named("V8")motor2: Motor) {

    @Inject constructor (@Named("V12") motor: Motor) : this(motor, Motor()) {}

    private val _motor : Motor = motor

    var speed : Int = 0
        get() = this._motor.rpm

    fun stop(){
        this._motor.brake()
    }

}