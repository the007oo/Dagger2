package com.phattarapong.eventbus.di

import android.app.Activity
import android.app.Application
import com.phattarapong.eventbus.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        PreferenceModule::class,
        ActivityModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(mainApplication: MainApplication): Builder
        fun build(): AppComponent
    }

    fun inject(mainApplication: MainApplication)
}