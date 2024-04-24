package com.miempresa.gasapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class RegistersensorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar_balon);

        Button btnRegistrar = (Button) findViewById(R.id.btn_register_registrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistersensorActivity.this, "Balón registrado correctamente", Toast.LENGTH_SHORT).show();
            }
        });
    }
}