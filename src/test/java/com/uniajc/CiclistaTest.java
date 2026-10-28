package com.uniajc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CiclistaTest {
    @Test
    void constructorInicializaDatosHeredadosYTiempoEnCero() {
        Velocista ciclista = new Velocista(7, "Ana", 350, 60);

        assertEquals(7, ciclista.getIdentificador());
        assertEquals("Ana", ciclista.getNombre());
        assertEquals(0, ciclista.getTiempoAcumulado());
    }

    @Test
    void settersActualizanLosDatosHeredados() {
        Velocista ciclista = new Velocista(7, "Ana", 350, 60);

        ciclista.setIdentificador(8);
        ciclista.setNombre("Laura");
        ciclista.setTiempoAcumulado(125);

        assertEquals(8, ciclista.getIdentificador());
        assertEquals("Laura", ciclista.getNombre());
        assertEquals(125, ciclista.getTiempoAcumulado());
    }

}
