package com.example.udlaaccess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HorarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horarios);

        // Encontrar el botón por su ID
        Button button = findViewById(R.id.button);

        // Configurar el evento OnClickListener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para navegar a MateriasActivity
                Intent intent = new Intent(HorarioActivity.this, MateriasActivity.class);
                startActivity(intent);
            }
        });
    }
}


