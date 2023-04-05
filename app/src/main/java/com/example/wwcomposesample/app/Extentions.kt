package com.example.wwcomposesample.app

import android.content.Context
import android.view.View
import android.widget.Toast


// View extensions
fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.GONE
}

// Context extensions
fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.isConnectedToInternet(): Boolean{
    return try {
        val command = "ping -c 1 google.com"
        Runtime.getRuntime().exec(command).waitFor() == 0
    } catch (e: Exception) {
        false
    }
}

// string extensions
fun String.toWeightWatchersImage(): String {
    return "https://www.weightwatchers.com$this"
}