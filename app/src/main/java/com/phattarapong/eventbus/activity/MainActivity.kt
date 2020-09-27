package com.phattarapong.eventbus.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.phattarapong.eventbus.MainApplication.Companion.bus
import com.phattarapong.eventbus.ProductInfo
import com.phattarapong.eventbus.R
import com.phattarapong.eventbus.fragment.HelloFragment
import com.phattarapong.eventbus.manager.UserPreference
import com.squareup.otto.Subscribe
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var userPreference: UserPreference
    @Inject
    lateinit var productInfo: ProductInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "productInfo : ${productInfo.toString()}")

        val fragment = HelloFragment.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.contentLayout, fragment).commit()

        bus.register(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        bus.unregister(this)
    }

    @Subscribe
    fun getMessage(data : String){
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }
}