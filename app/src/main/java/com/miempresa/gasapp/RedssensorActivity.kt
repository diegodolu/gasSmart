package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RedssensorActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.redssensor_app)
        val boton = findViewById<Button>(R.id.btn_redssensor_calibrar)
        boton.setOnClickListener{
            val intent = Intent(this, RegistersensorActivity::class.java)
            startActivity(intent)
        }

    }
}