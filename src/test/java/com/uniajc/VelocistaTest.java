package com.uniajc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VelocistaTest {
    @Test
    void constructorInicializaEspecialidadYTipo() {
        Velocista ciclista = new Velocista(1, "Carlos", 400, 65);

        assertEquals(400, ciclista.getPotenciaPromedio());
        assertEquals(65, ciclista.getVelocidadPromedioSprint());
        assertEquals("Es un velocista", ciclista.imprimirTipo());
    }

    @Test
    void settersActualizanDatosDeEspecialidad() {
        Velocista ciclista = new Velocista(1, "Carlos", 400, 65);

        ciclista.setPotenciaPromedio(420);
        ciclista.setVelocidadPromedioSprint(68);

        assertEquals(420, ciclista.getPotenciaPromedio());
        assertEquals(68, ciclista.getVelocidadPromedioSprint());
    }

}
