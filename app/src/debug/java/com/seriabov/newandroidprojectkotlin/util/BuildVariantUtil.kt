package com.seriabov.newandroidprojectkotlin.util

import com.facebook.stetho.Stetho
import com.seriabov.newandroidprojectkotlin.AppDelegate
import timber.log.Timber

/**
 * @author Sergei Riabov
 */

fun AppDelegate.onApplicationCreate() {
  Stetho.initializeWithDefaults(this)

  Timber.plant(Timber.DebugTree())
}