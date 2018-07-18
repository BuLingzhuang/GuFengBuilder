package com.example.lingzhuang_bu.gufengbuilder.impl.presenters

import com.example.lingzhuang_bu.gufengbuilder.base.GFApplication
import com.example.lingzhuang_bu.gufengbuilder.interfaces.presenters.SplashPresenter
import com.example.lingzhuang_bu.gufengbuilder.interfaces.views.SplashView
import com.example.lingzhuang_bu.gufengbuilder.task.CustomTypefaceTask
import java.util.concurrent.Executors

/**
 * Author：lingzhuang_bu
 * Date：2018/7/18
 * Description：
 */
class SplashPresenterImpl(private val mView:SplashView):SplashPresenter {

    private var mAlready = false
    private var mOvertime = false

    override fun initCustomTypeface() {
        CustomTypefaceTask(GFApplication.sApplication, object : CustomTypefaceTask.ReadTypefaceListener {
            override fun already() {
                if (mOvertime) {
                    TODO("超时，跳转首页")
                } else {
                    mAlready = true
                }
            }
        }).executeOnExecutor(Executors.newSingleThreadExecutor())

        TODO("处理完所有逻辑标记判断是否already，否则标记超时")
    }
}