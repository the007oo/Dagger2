package com.phattarapong.eventbus.di

import com.phattarapong.eventbus.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentModule::class,MainModule::class])
    abstract fun contributeMainActivity(): MainActivity
}