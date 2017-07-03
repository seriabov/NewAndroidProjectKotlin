package com.seriabov.newandroidprojectkotlin.ui.main

import android.arch.lifecycle.MutableLiveData
import com.seriabov.newandroidprojectkotlin.ui.common.BaseViewModel
import javax.inject.Inject

/**
 * @author Sergei Riabov
 */

class MainViewModel
@Inject constructor() : BaseViewModel() {

  var content: MutableLiveData<String> = MutableLiveData()

  init {
    content.value = "Hello, MVVM"
  }

}