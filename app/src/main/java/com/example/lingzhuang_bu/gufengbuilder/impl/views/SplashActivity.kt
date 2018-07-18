package com.example.lingzhuang_bu.gufengbuilder.impl.views

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lingzhuang_bu.gufengbuilder.R
import com.example.lingzhuang_bu.gufengbuilder.interfaces.views.SplashView

class SplashActivity : AppCompatActivity(),SplashView {
    override fun getContext(): Context {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}
