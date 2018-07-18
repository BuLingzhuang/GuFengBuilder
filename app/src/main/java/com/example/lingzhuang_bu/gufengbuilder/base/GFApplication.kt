package com.example.lingzhuang_bu.gufengbuilder.base

import android.app.Application
import android.graphics.Typeface
import com.example.lingzhuang_bu.gufengbuilder.task.CustomTypefaceTask
import java.util.concurrent.Executors

/**
 * Author：lingzhuang_bu
 * Date：2018/7/18
 * Description：
 */
class GFApplication : Application() {
    companion object {
        lateinit var sCustomTypeface: Typeface
    }

    private var mAlready = false
    private var mOvertime = false

    override fun onCreate() {
        super.onCreate()
        CustomTypefaceTask(this, object : CustomTypefaceTask.ReadTypefaceListener {
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