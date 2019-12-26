package com.home.androidmmkvbrvahdemo.view

import android.graphics.Canvas
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemSwipeListener
import com.home.androidmmkvbrvahdemo.R
import com.home.androidmmkvbrvahdemo.model.MainModel.Companion.MAIN_POJO
import com.home.androidmmkvbrvahdemo.model.MainPojo
import com.home.androidmmkvbrvahdemo.presenter.MainPresenter
import com.tencent.mmkv.MMKV
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    // 獲取默認的全局實例
    private val mmkv: MMKV by lazy { MMKV.defaultMMKV() }
    var adapter: MainRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeData()
    }

    private fun initializeData() {
        val mainPojo = mmkv.decodeParcelable(MAIN_POJO, MainPojo::class.java)
        if (mainPojo == null) {
            toast("產生全新的列表資料")
            val presenter = MainPresenter()
            val presenterMainPojo = presenter.getMainPojo()
            mmkv.encode(MAIN_POJO, presenterMainPojo)
            val results = presenterMainPojo.results
            initializeRecyclerView(results)
        } else {
            toast("從MMKV取得目前的列表資料")
            val results = mainPojo.results
            initializeRecyclerView(results)
        }
    }

    private fun initializeRecyclerView(results: MutableList<MainPojo.Result>) {
        // 側滑監聽
        val onItemSwipeListener = object : OnItemSwipeListener {
            override fun onItemSwipeStart(viewHolder: RecyclerView.ViewHolder, pos: Int) {}
            override fun clearView(viewHolder: RecyclerView.ViewHolder, pos: Int) {}
            override fun onItemSwiped(viewHolder: RecyclerView.ViewHolder, pos: Int) {}
            override fun onItemSwipeMoving(
                canvas: Canvas, viewHolder: RecyclerView.ViewHolder,
                dX: Float, dY: Float, isCurrentlyActive: Boolean
            ) {
                canvas.drawColor(
                    ContextCompat.getColor(this@MainActivity, R.color.color_8ec31e)
                )
            }
        }
        adapter = MainRecyclerViewAdapter(results)
        adapter!!.draggableModule!!.isSwipeEnabled = true
        adapter!!.draggableModule!!.setOnItemSwipeListener(onItemSwipeListener)
        adapter!!.draggableModule!!.itemTouchHelperCallback.setSwipeMoveFlags(
            ItemTouchHelper.START or ItemTouchHelper.END
        )
        adapter!!.isAnimationFirstOnly = false
        adapter!!.setAnimationWithDefault(BaseQuickAdapter.AnimationType.ScaleIn)
        recycler_view.adapter = adapter
    }

    override fun onStop() {
        toast("保存目前的列表資料至MMKV")
        val results = adapter!!.data
        val mainPojo = MainPojo(results)
        mmkv.encode(MAIN_POJO, mainPojo)
        super.onStop()
    }
}
