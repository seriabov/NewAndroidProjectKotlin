package com.seriabov.newandroidprojectkotlin.util

import com.facebook.stetho.Stetho
import com.seriabov.newandroidprojectkotlin.AppDelegate
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

/**
 * @author Sergei Riabov
 */

fun AppDelegate.onApplicationCreate() {

  if (LeakCanary.isInAnalyzerProcess(this)) {
    return
  }
  LeakCanary.install(this)

  Stetho.initializeWithDefaults(this)

  Timber.plant(Timber.DebugTree())
}