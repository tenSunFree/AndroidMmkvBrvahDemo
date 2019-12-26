package com.home.androidmmkvbrvahdemo.common

import android.app.Application
import com.tencent.mmkv.MMKV

class AMBDApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeMmkv()
    }

    /**
     * 設置初始化的根目錄
     */
    private fun initializeMmkv() {
        val dir = filesDir.absolutePath + "/mmkv"
        MMKV.initialize(dir)
    }
}