package com.seriabov.newandroidprojectkotlin.ui.common

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * @author Sergei Riabov
 */

open class BasePresenter<V : BaseContract.View> : BaseContract.Presenter<V> {

  var view: V? = null

  private val mDisposables: CompositeDisposable by lazy { CompositeDisposable() }

  override fun attachView(view: V) {
    this.view = view
  }

  override fun detachView() {
    view = null
    mDisposables.clear()
  }


  fun Disposable.addToDisposables() {
    mDisposables.add(this)
  }
}