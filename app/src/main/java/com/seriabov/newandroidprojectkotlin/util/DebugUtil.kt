@file:Suppress("UNUSED_PARAMETER", "NOTHING_TO_INLINE")

package com.seriabov.newandroidprojectkotlin.util

import timber.log.Timber

const val TAG = "GUIDE_DEBUG"

inline fun log(message: String) {
  Timber.d(message)
}

inline fun Throwable.log(message: String = "") {
  Timber.e(this, message)
}