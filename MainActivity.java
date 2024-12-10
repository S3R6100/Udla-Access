package com.example.udlaaccess;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnVerHorario = findViewById(R.id.btnVerHorario);
        btnVerHorario.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HorarioActivity.class);
            startActivity(intent);
        });


        Button btnVerAsistencias = findViewById(R.id.btnVerAsistencias);
        btnVerAsistencias.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AsistenciaActivity.class);
            startActivity(intent);
        });

    }
}
