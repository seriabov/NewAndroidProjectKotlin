package com.seriabov.newandroidprojectkotlin.ui.common.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * @author Sergei Riabov
 */

class BaseAdapter<T> : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  private val mAdapterDelegateManager : AdapterDelegateManager<T> = AdapterDelegateManager()
  private var mDataList: List<T> = emptyList()

  fun addDelegate(del : AdapterDelegate<T>) : BaseAdapter<T> {
    mAdapterDelegateManager.addDelegate(del)
    return this
  }

  fun setData(list: List<T>) {
    mDataList = ArrayList(list)
    notifyDataSetChanged()
  }

  fun remove(position: Int) {
    mDataList = mDataList.minusElement(mDataList[position])
    notifyItemRemoved(position)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    return mAdapterDelegateManager.onCreateViewHolder(parent, viewType)
  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    mAdapterDelegateManager.onBindViewHolder(mDataList.get(position), position, holder)
  }


  override fun getItemViewType(position: Int): Int {
    return mAdapterDelegateManager.getItemViewType(mDataList.get(position), position)
  }

  override fun getItemCount(): Int {
    return mDataList.size
  }
}