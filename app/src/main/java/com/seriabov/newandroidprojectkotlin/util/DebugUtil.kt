package com.seriabov.newandroidprojectkotlin.util

import android.util.Log

import com.seriabov.newandroidprojectkotlin.BuildConfig

/**
 * @author Sergei Riabov
 */

const val TAG = "GUIDE_DEBUG"

fun log(message: String, tag: String = TAG) {
  if (BuildConfig.DEBUG) {
    Log.d(TAG, message)
  }
}

fun Throwable.log(message : String, tag : String = TAG) {
  if (BuildConfig.DEBUG) {
    Log.d(TAG, message, this)
  }
}