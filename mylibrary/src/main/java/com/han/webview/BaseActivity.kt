package com.han.webview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB:ViewBinding>:AppCompatActivity() {
    protected lateinit var vb: VB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb=getViewBindingRoot()
        setContentView(vb.root)
        initView()
    }
    protected abstract fun getViewBindingRoot(): VB
    protected abstract fun initView()
    fun log(logTest:String){
        Log.e("---TAG---", logTest)
    }
}