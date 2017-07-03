package com.seriabov.newandroidprojectkotlin

import android.app.Activity
import android.app.Application
import com.seriabov.newandroidprojectkotlin.di.AppInjector
import com.seriabov.newandroidprojectkotlin.util.onApplicationCreate
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * @author Sergei Riabov
 */

class AppDelegate : Application(), HasActivityInjector {

  @Inject
  lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

  override fun onCreate() {
    super.onCreate()

    AppInjector.init(this)

    onApplicationCreate()
  }

  override fun activityInjector(): AndroidInjector<Activity> {
    return dispatchingAndroidInjector
  }
}