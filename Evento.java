package com.example.udlaaccess;

public class Evento {
    private final String nombre;
    private final String diaSemana;
    private final String horaInicio;
    private final String horaFin;

    public Evento(String nombre, String diaSemana, String horaInicio, String horaFin) {
        this.nombre = nombre;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }
}
