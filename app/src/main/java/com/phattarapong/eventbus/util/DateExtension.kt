package com.phattarapong.eventbus.util

import java.text.SimpleDateFormat
import java.util.*

fun Date.format(): String = SimpleDateFormat("dd-MM-YYYY").format(this)