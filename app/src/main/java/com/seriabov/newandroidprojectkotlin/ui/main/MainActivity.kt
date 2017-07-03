package com.seriabov.newandroidprojectkotlin.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.seriabov.newandroidprojectkotlin.R
import com.seriabov.newandroidprojectkotlin.di.Injectable
import com.seriabov.newandroidprojectkotlin.ui.common.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), Injectable {

  @Inject
  lateinit var viewModelFactory: ViewModelProvider.Factory

  lateinit var vm: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    vm = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

    vm.content.observe(this, Observer { tvHelloWorld.text = it })
  }
}
