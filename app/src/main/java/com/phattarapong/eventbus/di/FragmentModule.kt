package com.phattarapong.eventbus.di

import com.phattarapong.eventbus.activity.MainActivity
import com.phattarapong.eventbus.fragment.HelloFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector()
    abstract fun contributeHelloFragment(): HelloFragment
}