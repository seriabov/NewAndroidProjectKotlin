package com.seriabov.newandroidprojectkotlin.ui.common

import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seriabov.newandroidprojectkotlin.R

/**
 * @author Sergei Riabov
 */

open class BaseActivity  : AppCompatActivity(), BaseContract.View {
  private var mLoadingView: View? = null

  override fun showLoading(isLoading : Boolean) {
    if(isLoading) {
      runOnUiThread {
        mLoadingView = LayoutInflater.from(this).inflate(R.layout.view_common_loading, null)
        window.addContentView(mLoadingView,
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
      }
    } else if(mLoadingView != null) {
      runOnUiThread {
        mLoadingView?.parent?.let { (it as ViewGroup).removeView(mLoadingView) }
      }
      mLoadingView = null
    }
  }
}