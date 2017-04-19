package com.seriabov.newandroidprojectkotlin.ui.common.adapter

import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.ViewGroup
import com.seriabov.newandroidprojectkotlin.ui.common.adapter.AdapterDelegate
import java.util.*

/**
 * @author Sergei Riabov
 */

class AdapterDelegateManager<T> {

  var mDelegates : SparseArray<AdapterDelegate<T>> = SparseArray()

  fun addDelegate(delegate : AdapterDelegate<T>) : AdapterDelegateManager<T> {
    mDelegates.put(mDelegates.size(), delegate)
    return this
  }

  fun getItemViewType(items : T, position : Int) : Int {
    for (i in 0.. mDelegates.size() - 1) {
      val delegate = mDelegates.valueAt(i)
      if (delegate.isForViewType(items, position)) {
        return mDelegates.keyAt(i)
      }
    }
    throw NoSuchElementException(
        "No AdapterDelegate added that matches position=$position in data source")
  }

  fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : RecyclerView.ViewHolder {
    return getDelegateForViewType(viewType).onCreateViewHolder(parent)
  }

  fun onBindViewHolder(item : T, position : Int, viewHolder : RecyclerView.ViewHolder) {
    getDelegateForViewType(viewHolder.itemViewType).onBindViewHolder(item, position, viewHolder)
  }

  fun getDelegateForViewType(viewType: Int): AdapterDelegate<T> {
    return mDelegates.get(viewType)
  }

}