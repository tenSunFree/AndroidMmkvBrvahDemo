package com.home.androidmmkvbrvahdemo.presenter

import com.home.androidmmkvbrvahdemo.model.MainModel
import com.home.androidmmkvbrvahdemo.model.MainPojo

class MainPresenter {

    private val mainModel = MainModel()

    fun getMainPojo(): MainPojo {
        return mainModel.getMainPojo()
    }
}