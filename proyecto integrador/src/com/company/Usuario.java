package com.company;

public class Usuario {
    private String nombre;
    private String nombreUsuario;
    private Integer edad;
    private Character sexo;
    private Float peso;
    private Float altura;


    public Usuario(String nombre, String nombreUsuario, Integer edad, Character sexo, Float peso, Float altura) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public static void editarDatos(){
        
    }
    public static void encuesta(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
