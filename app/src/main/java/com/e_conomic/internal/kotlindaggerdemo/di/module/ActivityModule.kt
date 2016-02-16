package com.e_conomic.internal.kotlindaggerdemo.di.module

/**
 * Created by tudorgk on 15/2/16.
 */
import android.app.Activity
import android.content.Context

import dagger.Module
import dagger.Provides

@Module
class ActivityModule(internal val mActivity: Activity) {

    @Provides
    fun activityContext(): Context {
        return mActivity
    }
}
