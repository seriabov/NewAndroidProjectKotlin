package com.seriabov.newandroidprojectkotlin.util

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * @author Sergei Riabov
 */

fun ImageView.loadImage(imageUri: String) {
  Glide.with(context)
      .load(imageUri)
      .into(this)
}