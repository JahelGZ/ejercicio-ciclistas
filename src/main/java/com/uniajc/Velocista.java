package com.uniajc;

public class Velocista extends Ciclista {
    // Atributos propios del velocista
    private double potenciaPromedio;
    private double velocidadPromedioSprint;

    // Constructor: inicializa los datos del ciclista y su especialidad
    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    // Métodos get y set protegidos
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    protected void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    protected String imprimirTipo() {
        return "Es un velocista";
    }

    @Override
    protected void imprimirDatos() {
        // Imprime los datos heredados y luego los propios
        super.imprimirDatos();
        System.out.println("Potencia promedio = " + potenciaPromedio + " vatios");
        System.out.println("Velocidad promedio en sprint = " + velocidadPromedioSprint + " km/h");
    }
}
