package com.example.lingzhuang_bu.gufengbuilder.task

import android.app.Application
import android.graphics.Typeface
import android.os.AsyncTask
import com.example.lingzhuang_bu.gufengbuilder.base.GFApplication

/**
 * Author：lingzhuang_bu
 * Date：2018/7/18
 * Description：自定义字体加载Task
 */
class CustomTypefaceTask(private val application: Application, private val listener: ReadTypefaceListener) : AsyncTask<String, Void, Typeface>() {

    interface ReadTypefaceListener{
        fun already()
    }

    override fun doInBackground(vararg p0: String?): Typeface {
        val str = p0[0]
        return Typeface.createFromAsset(application.assets,
                if (str.isNullOrEmpty()) { "PingFangRegular.ttf" } else { str })
    }

    override fun onPostExecute(result: Typeface) {
        GFApplication.sCustomTypeface = result
        listener.already()
    }
}