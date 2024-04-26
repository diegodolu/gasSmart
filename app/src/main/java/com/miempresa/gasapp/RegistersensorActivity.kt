package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistersensorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrar_balon)
        val btnRegistrar = findViewById<View>(R.id.btn_register_registrar)
        btnRegistrar.setOnClickListener {
            val intent = Intent(this, DetailssensorActivity::class.java)
            startActivity(intent)

        }
    }
}