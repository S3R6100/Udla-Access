package com.example.udlaaccess;

import java.util.ArrayList;

public class ListaAsistencias {
    private ArrayList<Asistencia> asistencias;

    public ListaAsistencias() {
        asistencias = new ArrayList<>();
    }

    public void agregarAsistencia(String nombrePersona, String fecha, boolean presente) {
        asistencias.add(new Asistencia(nombrePersona, fecha, presente));
    }

    public ArrayList<Asistencia> obtenerAsistencias() {
        return asistencias;
    }

    public void mostrarAsistencias() {
        for (Asistencia asistencia : asistencias) {
            System.out.println(asistencia);
        }
    }
}

