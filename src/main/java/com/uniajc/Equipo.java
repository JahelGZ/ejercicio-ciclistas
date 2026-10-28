package com.uniajc;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    // Atributos privados
    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo; // Atributo estático compartido
    private List<Ciclista> ciclistas;     // Colección para la relación de composición

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        tiempoTotalEquipo = 0;
        this.ciclistas = new ArrayList<>();
    }

    // Métodos get y set protegidos
    protected String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    protected static void setTiempoTotalEquipo(int tiempoTotal) {
        tiempoTotalEquipo = tiempoTotal;
    }

    // Lógica
    protected void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    protected void calcularTotalTiempo() {
        tiempoTotalEquipo = 0;
        for (Ciclista c : ciclistas) {
            tiempoTotalEquipo += c.getTiempoAcumulado();
        }
    }

    protected void listarNombresCiclistas() {
        for (Ciclista c : ciclistas) {
            System.out.println(c.getNombre());
        }
    }

    protected void imprimirDatosCiclista(int identificador) {
        boolean encontrado = false;
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == identificador) {
                c.imprimirDatos();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No existe un ciclista con el identificador ingresado.");
        }
    }

    protected void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + pais);
        System.out.println("Tiempo Total: " + tiempoTotalEquipo + " minutos");
    }
}
