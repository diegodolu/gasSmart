package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RedsensorActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.redsensor_app)
        val texto = findViewById<TextView>(R.id.lbl_redsensor_red)
        texto.setOnClickListener{
            val intent=Intent(this,RedssensorActivity::class.java)
            startActivity(intent)
        }
    }
}