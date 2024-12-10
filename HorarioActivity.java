package com.example.udlaaccess;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HorarioActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HorarioAdapter adapter;
    private ArrayList<Evento> eventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_horario);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        recyclerView = findViewById(R.id.recyclerViewHorario);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        eventos = new ArrayList<>();
        eventos.add(new Evento("Matemáticas", "Lunes", "08:00", "10:00"));
        eventos.add(new Evento("Física", "Miércoles", "10:00", "12:00"));
        eventos.add(new Evento("Historia", "Viernes", "14:00", "16:00"));


        adapter = new HorarioAdapter(eventos);
        recyclerView.setAdapter(adapter);
    }
}
