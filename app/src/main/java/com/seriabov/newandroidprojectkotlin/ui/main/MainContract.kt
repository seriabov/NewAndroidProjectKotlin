package com.seriabov.newandroidprojectkotlin.ui.main

import com.seriabov.newandroidprojectkotlin.ui.common.BaseContract

/**
 * @author Sergei Riabov
 */

interface MainContract {

  interface View : BaseContract.View{

  }

  interface Presenter : BaseContract.Presenter<View> {

  }

}