package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddsensorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addsensor_app)
        val boton = findViewById<Button>(R.id.btn_addsensor_vincular)
        boton.setOnClickListener{
            val intent = Intent(this, BoundActivity::class.java)
            startActivity(intent)
        }
    }
}
