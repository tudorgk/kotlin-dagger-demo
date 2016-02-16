package com.e_conomic.internal.kotlindaggerdemo.model

import javax.inject.Inject


/**
 * Created by tudorgk on 15/2/16.
 */

class Vehicle @Inject constructor (motor: Motor) {

    private val _motor : Motor = motor

    var speed : Int = 0
        get() = this._motor.rpm

    fun stop(){
        this._motor.brake()
    }

}