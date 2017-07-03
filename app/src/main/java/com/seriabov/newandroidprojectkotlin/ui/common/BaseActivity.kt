package com.seriabov.newandroidprojectkotlin.ui.common

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.support.v7.app.AppCompatActivity

/**
 * @author Sergei Riabov
 */

open class BaseActivity : AppCompatActivity(), LifecycleRegistryOwner {
  private val lifecycleRegistry = LifecycleRegistry(this)

  override fun getLifecycle(): LifecycleRegistry = lifecycleRegistry
}