package com.seriabov.newandroidprojectkotlin.ui.common

/**
 * @author Sergei Riabov
 */

interface BaseContract {

  interface View {

  }

  interface Presenter<in V : BaseContract.View> {

    fun attachView(view: V)

    fun detachView()

  }

}