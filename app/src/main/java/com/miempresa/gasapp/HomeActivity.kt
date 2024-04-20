package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_app)
        val imagen = findViewById<ImageView>(R.id.img_home_mas)
        imagen.setOnClickListener {
            val intent = Intent(this, AddsensorActivity::class.java)
            startActivity(intent)
        }
    }
}
