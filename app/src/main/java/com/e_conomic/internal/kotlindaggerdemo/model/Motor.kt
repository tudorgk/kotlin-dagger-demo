package com.e_conomic.internal.kotlindaggerdemo.model

/**
 * Created by tudorgk on 15/2/16.
 */
class Motor {
    private var _rpm : Int = 0

    public val rpm: Int
        get(){
            return _rpm
        }

    public fun accelerate(value: Int){
        _rpm += value
    }

    public fun brake(){
        _rpm = 0;
    }

}