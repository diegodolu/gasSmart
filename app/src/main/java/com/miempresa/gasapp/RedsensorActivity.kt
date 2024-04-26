package com.miempresa.gasapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RedsensorActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.redsensor_app)
        val wifiBtn = findViewById<ImageView>(R.id.img_redsensor_wifi)
        val context = this@RedsensorActivity

        wifiBtn.setOnClickListener {view ->
            val popUp = PopupMenu(context, view)
            popUp.inflate(R.menu.menu_wifi)

            popUp.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.red1 -> {
                        val intent = Intent(context, RedssensorActivity::class.java)
                        startActivity(intent)
                        true // Agrega un valor de retorno true
                    }

                    R.id.red2 -> {
                        val intent = Intent(context, RedssensorActivity::class.java)
                        startActivity(intent)
                        true // Agrega un valor de retorno true
                    }

                    R.id.red3 -> {
                        val intent = Intent(context, RedssensorActivity::class.java)
                        startActivity(intent)
                        true // Agrega un valor de retorno true
                    }

                    else -> false // Agrega un valor de retorno false
                }
            }
            popUp.show()
        }
    }
}