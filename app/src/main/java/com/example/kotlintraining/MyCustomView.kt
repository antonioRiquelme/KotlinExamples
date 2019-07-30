package com.example.kotlintraining

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class MyCustomView(context: Context, attributeSet: AttributeSet? = null) : FrameLayout(context, attributeSet) {

    val image by lazy { findViewById<ImageView>(R.id.image) }
    val text: TextView by lazy { findViewById<TextView>(R.id.text) }


    init {
        View.inflate(context, R.layout.my_custom_view, this)
    }


    fun setTitle(title: String) {
        text.text = title
    }

    fun setImage(imageRes: Int) {
        image.setImageResource(imageRes)
    }

}
