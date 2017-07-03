package com.seriabov.newandroidprojectkotlin.ui.common

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * @author Sergei Riabov
 */

abstract class BaseViewModel : ViewModel() {

  private val mDisposables: CompositeDisposable by lazy { CompositeDisposable() }

  override fun onCleared() {
    super.onCleared()
    mDisposables.clear()
  }

  fun Disposable.addToDisposables() {
    mDisposables.add(this)
  }
}