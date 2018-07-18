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
        lateinit var sApplication: Application
    }

    override fun onCreate() {
        super.onCreate()
        sApplication = this
    }
}