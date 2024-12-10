package com.example.udlaaccess;

public class Asistencia {
    private String nombrePersona;
    private String fecha;
    private boolean presente;

    public Asistencia(String nombrePersona, String fecha, boolean presente) {
        this.nombrePersona = nombrePersona;
        this.fecha = fecha;
        this.presente = presente;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return nombrePersona + " - " + fecha + " - " + (presente ? "Presente" : "Ausente");
    }
}

