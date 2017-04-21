package com.seriabov.newandroidprojectkotlin.ui.common

/**
 * @author Sergei Riabov
 */

interface BaseContract {

  interface View {

    fun showLoading(isLoading : Boolean)

  }

  interface Presenter<in V : BaseContract.View> {

    fun attachView(view: V)

    fun detachView()

  }

}