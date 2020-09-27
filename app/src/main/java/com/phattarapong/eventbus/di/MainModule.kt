package com.phattarapong.eventbus.di

import com.phattarapong.eventbus.ProductInfo
import dagger.Module
import dagger.Provides

@Module
class MainModule{

    @Provides
    fun provideMainProductInfo() : ProductInfo = ProductInfo(9977,"Phattaraoong",100,"Handsome")
}