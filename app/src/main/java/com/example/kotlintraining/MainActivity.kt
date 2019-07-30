package com.example.kotlintraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c1 = findViewById<MyCustomView>(R.id.myCustom1)
        val c2 = findViewById<MyCustomView>(R.id.myCustom2)
        val c3 = findViewById<MyCustomView>(R.id.myCustom3)
        val c4 = findViewById<MyCustomView>(R.id.myCustom4)

        c1.setImage(R.drawable.abc_btn_radio_to_on_mtrl_015)
        c2.setImage(R.drawable.abc_ic_menu_overflow_material)
        c3.setImage(R.drawable.abc_ic_star_half_black_48dp)

        c1.setTitle("title 1")
        c2.setTitle("title 2")
        c3.setTitle("title 3")
        c4.setTitle("title 4")

    }
}
