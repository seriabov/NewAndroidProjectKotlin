package com.seriabov.newandroidprojectkotlin

import android.app.Application
import com.seriabov.newandroidprojectkotlin.util.onApplicationCreate

/**
 * @author Sergei Riabov
 */

class AppDelegate : Application() {

  override fun onCreate() {
    super.onCreate()

    onApplicationCreate()
  }
}