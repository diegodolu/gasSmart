package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailssensorActivity:AppCompatActivity() {
    override fun onCreate(savedInstantState:Bundle?){
        super.onCreate(savedInstantState)
        setContentView(R.layout.detailssensor_app)
        val logo = findViewById<ImageView>(R.id.img_detailssensor_ss)
        logo.setOnClickListener{
            val intent = Intent(this, HomeNewActivity::class.java)
            startActivity(intent)
        }
    }
}