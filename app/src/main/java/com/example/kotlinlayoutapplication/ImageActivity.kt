package com.example.kotlinlayoutapplication

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image.*

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        monster_1_button.setOnClickListener { assestImage("monster01.webp") }
        monster_2_button.setOnClickListener { assestImage("monster02.webp") }
        monster_3_button.setOnClickListener { assestImage("monster03.webp") }
    }

    private fun assestImage(fileName: String){
        assets.open(fileName).use {
            val drawable = Drawable.createFromStream(it,null)
            imageView.setImageDrawable(drawable)
        }
    }
}
