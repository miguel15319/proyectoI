package com.company;

public class Encuesta {
    
    private Character interes;
    private Character desafio;

    public Character getInteres() {
        return interes;
    }

    public void setInteres(Character interes) {
        this.interes = interes;
    }

    public Character getDesafio() {
        return desafio;
    }

    public void setDesafio(Character desafio) {
        this.desafio = desafio;
    }

    public Character getMeta() {
        return meta;
    }

    public void setMeta(Character meta) {
        this.meta = meta;
    }

    public Character getMotivacion() {
        return motivacion;
    }

    public void setMotivacion(Character motivacion) {
        this.motivacion = motivacion;
    }

    public Character getVecesEntrenamiento() {
        return vecesEntrenamiento;
    }

    public void setVecesEntrenamiento(Character vecesEntrenamiento) {
        this.vecesEntrenamiento = vecesEntrenamiento;
    }

    public Character getTiempoEntrenamiento() {
        return tiempoEntrenamiento;
    }

    public void setTiempoEntrenamiento(Character tiempoEntrenamiento) {
        this.tiempoEntrenamiento = tiempoEntrenamiento;
    }

    private Character meta;
    private Character motivacion;
    private Character vecesEntrenamiento;
    private Character tiempoEntrenamiento;

    public Encuesta(Character interes, Character desafio, Character meta, Character motivacion, Character vecesEntrenamiento, Character tiempoEntrenamiento) {
        this.interes = interes;
        this.desafio = desafio;
        this.meta = meta;
        this.motivacion = motivacion;
        this.vecesEntrenamiento = vecesEntrenamiento;
        this.tiempoEntrenamiento = tiempoEntrenamiento;
    }
}
