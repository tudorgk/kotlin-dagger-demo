package com.e_conomic.internal.kotlindaggerdemo.view

import android.location.LocationManager
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.e_conomic.internal.kotlindaggerdemo.MyApplication
import com.e_conomic.internal.kotlindaggerdemo.R
import com.e_conomic.internal.kotlindaggerdemo.di.component.ActivityComponent
import com.e_conomic.internal.kotlindaggerdemo.di.component.DaggerActivityComponent


import javax.inject.Inject


class BaseActivity : AppCompatActivity() {

    //@Inject
    //lateinit var vehicle: Vehicle
    lateinit private var activityComponent: ActivityComponent

    @Inject
    lateinit var mLocationManager : LocationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        activityComponent= DaggerActivityComponent.builder().applicationComponent(getApp().getAppComponent()).build()
        activityComponent.inject(this)
        //or add the line below
        //mLocationManager = activityComponent.locationManger()
        Log.d("Location manager", mLocationManager.toString())

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show() }
    }

    protected fun getApp(): MyApplication {
        return applicationContext as MyApplication
    }

    protected fun getComponent(): ActivityComponent {
        return activityComponent
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
