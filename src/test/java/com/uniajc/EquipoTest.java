package com.uniajc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EquipoTest {
    @Test
    void calcularTotalTiempoSumaLosTiemposDeLosCiclistas() {
        Equipo equipo = new Equipo("Pedales de Colombia", "Colombia");
        Velocista velocista = new Velocista(1, "Carlos", 400, 65);
        Escalador escalador = new Escalador(2, "Andres", 3.5f, 20f);
        velocista.setTiempoAcumulado(120);
        escalador.setTiempoAcumulado(135);
        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);

        equipo.calcularTotalTiempo();

        assertEquals(255, Equipo.getTiempoTotalEquipo());
    }

    @Test
    void calcularTotalTiempoEnEquipoVacioDejaElTotalEnCero() {
        Equipo equipo = new Equipo("Equipo vacio", "Colombia");
        Equipo.setTiempoTotalEquipo(500);

        equipo.calcularTotalTiempo();

        assertEquals(0, Equipo.getTiempoTotalEquipo());
    }

}
