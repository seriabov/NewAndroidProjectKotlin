package com.seriabov.newandroidprojectkotlin.util

import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * @author Sergei Riabov
 */

fun <T> Observable<T>.applySchedulers(
    subscribeOn : Scheduler = Schedulers.io(),
    observeOn : Scheduler = AndroidSchedulers.mainThread()): Observable<T> {
  return this
      .subscribeOn(subscribeOn)
      .observeOn(observeOn)
}

fun Disposable.addTo(disposables : CompositeDisposable) {
  disposables.add(this)
}