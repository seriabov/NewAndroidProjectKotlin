package com.seriabov.newandroidprojectkotlin.util

import android.content.Context
import android.view.View
import android.widget.Toast

/**
 * @author Sergei Riabov
 */

fun View.hide() {
  this.visibility = View.GONE
}

fun View.show() {
  this.visibility = View.VISIBLE
}

fun View.invisible() {
  this.visibility = View.INVISIBLE
}

fun View.isVisible() : Boolean {
  return this.visibility == View.VISIBLE
}

fun Context.showToast(text : String, duration : Int = Toast.LENGTH_LONG) {
  Toast.makeText(this, text, duration).show()
}