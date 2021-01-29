package com.example.shymko_hw_lesson18_220121_drawableimages

import android.content.Context
import android.content.Intent
import android.graphics.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.btnButton2
import kotlinx.android.synthetic.main.activity_second.btnButton1
import kotlinx.android.synthetic.main.activity_second.ivBitmap
import kotlinx.android.synthetic.main.activity_third.*
import java.io.ByteArrayOutputStream

class ThirdActivityBitmap : AppCompatActivity() {
    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ThirdActivityBitmap::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnButton1.setOnClickListener {
            MainActivityGlide.start(this)
        }

        btnButton2.setOnClickListener {
            val bitmap = BitmapFactory.decodeResource(resources, R.drawable.loader)
                .copy(Bitmap.Config.ARGB_8888, true)
            val canvas = Canvas(bitmap)
            val paint = Paint().apply {
                strokeWidth = 55f
                color = Color.rgb(25, 0, 0)
            }
            canvas.drawLine(
                canvas.width.toFloat() / 2,
                canvas.height.toFloat() / 2,
                0F,
                0f,
                paint
            )
            ivBitmap.setImageBitmap(bitmap)
            val bitmapStream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bitmapStream)
            val bitmapArray = bitmapStream.toByteArray()
            tvBitampArray.text = "bitmapArray = +  ${bitmapArray.toString()}"
        }
    }
}
