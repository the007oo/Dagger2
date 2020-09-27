package com.phattarapong.eventbus

import android.app.Activity
import android.app.Application
import com.phattarapong.eventbus.di.AppInjector
import com.squareup.otto.Bus
import com.squareup.otto.ThreadEnforcer
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    companion object {
        var bus = Bus(ThreadEnforcer.MAIN)
    }

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = activityDispatchingAndroidInjector
}