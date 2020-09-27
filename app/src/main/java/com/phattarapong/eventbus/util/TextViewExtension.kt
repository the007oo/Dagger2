package com.phattarapong.eventbus.util

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

fun TextView.copyTextToClipBoard(context: Context) {
    val clipBorad = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText("", text)
    clipBorad.setPrimaryClip(clip)

    Toast.makeText(context, "Copied", Toast.LENGTH_SHORT).show()
}

fun TextView.replaceEmptyString(){
    text = text.toString().replace("","-")
}