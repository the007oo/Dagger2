package com.phattarapong.eventbus.di

import com.phattarapong.eventbus.MainApplication
import com.phattarapong.eventbus.manager.UserPreference
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class PreferenceModule {
    @Singleton
    @Provides
    fun provideUserPreference(application: MainApplication) = UserPreference(application)
}