package com.uniajc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EscaladorTest {
    @Test
    void constructorInicializaEspecialidadYTipo() {
        Escalador ciclista = new Escalador(2, "Andres", 3.5f, 20f);

        assertEquals(3.5f, ciclista.getAceleracionPromedio());
        assertEquals(20f, ciclista.getGradoRampa());
        assertEquals("Es un escalador", ciclista.imprimirTipo());
    }

    @Test
    void settersActualizanDatosDeEspecialidad() {
        Escalador ciclista = new Escalador(2, "Andres", 3.5f, 20f);

        ciclista.setAceleracionPromedio(4.2f);
        ciclista.setGradoRampa(25f);

        assertEquals(4.2f, ciclista.getAceleracionPromedio());
        assertEquals(25f, ciclista.getGradoRampa());
    }

}
