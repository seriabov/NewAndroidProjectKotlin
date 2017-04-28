package com.seriabov.newandroidprojectkotlin.util

import android.content.res.Resources

/**
 * @author Sergei Riabov
 */

fun Int.toDp() : Int = (this / Resources.getSystem().displayMetrics.density).toInt()

fun Int.toPx() : Int = (this * Resources.getSystem().displayMetrics.density).toInt()