package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
class BoundActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bound_app)

        val icon = findViewById<ImageView>(R.id.img_bound_check)
        icon.setOnClickListener{
            val intent=Intent(this, RedsensorActivity::class.java)
            startActivity(intent)
        }
    }
}
