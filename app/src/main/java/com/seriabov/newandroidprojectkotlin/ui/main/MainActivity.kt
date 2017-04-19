package com.seriabov.newandroidprojectkotlin.ui.main

import android.os.Bundle
import com.seriabov.newandroidprojectkotlin.R
import com.seriabov.newandroidprojectkotlin.ui.common.BaseActivity

class MainActivity : BaseActivity(), MainContract.View {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}
