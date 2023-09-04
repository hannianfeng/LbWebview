package com.han.webview

import android.view.View
import com.han.webview.databinding.ActivityH5MainBinding

class H5MainActivity : BaseActivity<ActivityH5MainBinding>() {
    override fun getViewBindingRoot(): ActivityH5MainBinding {
        return ActivityH5MainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        val stringExtra = intent.getStringExtra("url")
        val h5 = vb.h5
        h5.setActivity(this@H5MainActivity,object :H5WebView.LW{
            override fun onProgressChanged(progress: Int) {
                vb.lottie.visibility= View.GONE
            }
        })
        if (stringExtra != null) {
            h5.loadUrl(stringExtra)
        }
    }
}