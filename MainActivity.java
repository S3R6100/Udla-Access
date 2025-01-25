package com.example.udlaaccess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configuración de button3
        ImageButton button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TareasActivity.class);
                startActivity(intent);
            }
        });

        // Configuración de button2
        ImageButton button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HorarioActivity.class);
                startActivity(intent);
            }
        });

        // Configuración de buttonRight2 para abrir QrActivity
        ImageButton buttonRight2 = findViewById(R.id.buttonRight2);
        buttonRight2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QrActivity.class);
                startActivity(intent);
            }
        });
    }
}

