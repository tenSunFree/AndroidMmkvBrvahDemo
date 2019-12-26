package com.home.androidmmkvbrvahdemo.view

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.module.DraggableModule
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.home.androidmmkvbrvahdemo.R
import com.home.androidmmkvbrvahdemo.model.MainPojo

class MainRecyclerViewAdapter(results: MutableList<MainPojo.Result>) :
    BaseQuickAdapter<MainPojo.Result, BaseViewHolder>(
        R.layout.activity_main_recycler_view_item, results
    ), DraggableModule {

    override fun convert(helper: BaseViewHolder, item: MainPojo.Result?) {
        helper.setText(R.id.text_view_content, item?.content)
        helper.setText(R.id.text_view_time, item?.time)
    }
}