package com.seriabov.newandroidprojectkotlin.ui.common.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup


/**
 * @author Sergei Riabov
 */

interface AdapterDelegate<T> {

  fun isForViewType(item: T, position: Int): Boolean

  fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

  fun onBindViewHolder(item: T, position: Int, holder: RecyclerView.ViewHolder)

}