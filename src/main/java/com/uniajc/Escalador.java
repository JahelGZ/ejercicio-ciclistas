package com.uniajc;

public class Escalador extends Ciclista {
    // Atributos propios del escalador
    private float aceleracionPromedio;
    private float gradoRampa;

    // Constructor: inicializa los datos del ciclista y su especialidad
    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    // Métodos get y set protegidos
    protected float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected float getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    protected String imprimirTipo() {
        return "Es un escalador";
    }

    @Override
    protected void imprimirDatos() {
        // Imprime los datos heredados y luego los propios
        super.imprimirDatos();
        System.out.println("Aceleracion promedio = " + aceleracionPromedio + " m/s2");
        System.out.println("Grado de rampa = " + gradoRampa + " grados");
    }
}
