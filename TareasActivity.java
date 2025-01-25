package com.example.udlaaccess;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class TareasActivity extends AppCompatActivity {  // Cambié a AppCompatActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas); // Carga el diseño de la actividad de tareas
    }
}

