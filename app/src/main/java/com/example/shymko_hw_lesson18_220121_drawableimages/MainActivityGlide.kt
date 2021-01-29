package com.example.shymko_hw_lesson18_220121_drawableimages

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btnButton1
import kotlinx.android.synthetic.main.activity_main.btnButton2
import kotlinx.android.synthetic.main.activity_second.*

/*
Створити додаток, у якому будуть декілька кнопок і зображень (зверху донизу), які:
1.    Градієнт бекграунд
2.    Щоб при натиску на кнопку, вона змінювала свій колір
///3. Картинка, створена за декількох Drawables.
Завдання 2:
//1.     Створити Bitmap.
//2.     Намалювати будь-що (навіть звичайну полоску, як на лекцї)
3.     Перевести у масив байтів
Завдання 3:
//1.    Підгрузити зображення завдяки Glide.
//2.    Додати анімацію підгрузки.
//3.    Зробити кругле зображення з Glide.
 */

class MainActivityGlide : AppCompatActivity() {
    companion object {
        fun start(context: Context) {
            val intent = Intent(context, MainActivityGlide::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnButton1.setOnClickListener {
            Glide.with(this)
                .load("https://imagecdn3.luxnet.ua/music/web/uploads/370x300_DIR/photo/song/201710/1772.jpg")
                .placeholder(R.drawable.progres_bar)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(ivImageView1)

            Glide.with(this)
                .load("https://imagecdn3.luxnet.ua/music/web/uploads/370x300_DIR/photo/song/201710/1772.jpg")
                .circleCrop()
                .into(ivImageView2)
        }

        btnButton2.setOnClickListener {
            SecondActivityDrawables.start(this)
        }


    }
}