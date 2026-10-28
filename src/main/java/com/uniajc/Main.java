package com.uniajc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Pedales de Colombia", "Colombia");

        Velocista velocista = new Velocista(1, "Carlos", 400, 65);
        Escalador escalador = new Escalador(2, "Andres", 3.5f, 20f);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Luis", 55);

        velocista.setTiempoAcumulado(120);
        escalador.setTiempoAcumulado(135);
        contrarrelojista.setTiempoAcumulado(110);

        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrarrelojista);

        equipo.calcularTotalTiempo();
        equipo.imprimirDatosEquipo();
        System.out.println("\nCiclistas del equipo:");
        equipo.listarNombresCiclistas();

        System.out.println("\nTipos de ciclistas:");
        Ciclista[] ciclistas = {velocista, escalador, contrarrelojista};
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.getNombre() + ": " + ciclista.imprimirTipo());
        }

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("\nIngrese el identificador del ciclista (1, 2 o 3): ");
            if (entrada.hasNextInt()) {
                equipo.imprimirDatosCiclista(entrada.nextInt());
            } else {
                System.out.println("El identificador debe ser un numero entero.");
            }
        }
    }
}
