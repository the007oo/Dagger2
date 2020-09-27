package com.phattarapong.eventbus.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.phattarapong.eventbus.MainApplication.Companion.bus
import com.phattarapong.eventbus.R
import com.phattarapong.eventbus.activity.MainActivity
import com.phattarapong.eventbus.manager.UserPreference
import com.phattarapong.eventbus.util.copyTextToClipBoard
import com.phattarapong.eventbus.util.format
import com.phattarapong.eventbus.util.replaceEmptyString
import kotlinx.android.synthetic.main.fragment_hello.*
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class HelloFragment : BaseFragment() {

    /*@Inject
    lateinit var userPreference: UserPreference*/

    companion object {
        @JvmStatic
        fun newInstance() =
            HelloFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bus.register(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hello, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        okButton.setOnClickListener {
            bus.post("Hello from fragment")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        bus.unregister(this)
    }
}
