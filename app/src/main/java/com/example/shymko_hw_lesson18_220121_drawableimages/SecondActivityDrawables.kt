package com.example.shymko_hw_lesson18_220121_drawableimages

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.btnButton2
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivityDrawables : AppCompatActivity() {
    companion object {
        fun start(context: Context) {
            val intent = Intent(context, SecondActivityDrawables::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnButton2.setOnClickListener {
            MainActivityGlide.start(this)
        }

        btnButton3.setOnClickListener {
            ThirdActivityBitmap.start(this)
        }
    }
}