package com.seriabov.newandroidprojectkotlin.util

import com.seriabov.newandroidprojectkotlin.AppDelegate
import timber.log.Timber

/**
 * @author Sergei Riabov
 */

fun AppDelegate.onApplicationCreate() {
  Timber.plant(Timber.DebugTree())
}