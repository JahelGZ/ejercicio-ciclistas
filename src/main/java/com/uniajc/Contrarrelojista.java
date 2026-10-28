package com.uniajc;

public class Contrarrelojista extends Ciclista {
    // Atributos propios del contrarrelojista
    private double velocidadMaxima;

    // Constructor: inicializa los datos del ciclista y su especialidad
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos get y set protegidos
    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    protected String imprimirTipo() {
        return "Es un contrarrelojista";
    }

    @Override
    protected void imprimirDatos() {
        // Imprime los datos heredados y luego los propios
        super.imprimirDatos();
        System.out.println("Velocidad maxima = " + velocidadMaxima + " km/h");
    }
}
