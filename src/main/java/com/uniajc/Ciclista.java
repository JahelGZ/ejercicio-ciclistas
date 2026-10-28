package com.uniajc;

public abstract class Ciclista {
    
    // Atributos privados
    private int identificador;
    private String nombre;
    private int tiempoAcumulado; 

    //Constructor vacio
    
    public Ciclista() {
    }

    
    //Constructor de la clase Ciclista
     
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0; 
    }

    // Métodos get y set protegidos para que puedan ser usados por las subclases
    protected int getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }


    protected void imprimirDatos() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado + " minutos");
    }

    protected abstract String imprimirTipo();
}