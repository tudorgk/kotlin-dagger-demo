package com.e_conomic.internal.kotlindaggerdemo.di.component

import com.e_conomic.internal.kotlindaggerdemo.di.scope.ActivityScope
import dagger.Component

/**
 * Created by tudorgk on 15/2/16.
 */
@ActivityScope
@Component(dependencies = arrayOf(ApplicationComponent::class))
interface ActivityComponent : ApplicationComponent {

}