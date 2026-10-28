package com.uniajc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContrarrelojistaTest {
    @Test
    void constructorInicializaEspecialidadYTipo() {
        Contrarrelojista ciclista = new Contrarrelojista(3, "Luis", 55);

        assertEquals(55, ciclista.getVelocidadMaxima());
        assertEquals("Es un contrarrelojista", ciclista.imprimirTipo());
    }

    @Test
    void setterActualizaVelocidadMaxima() {
        Contrarrelojista ciclista = new Contrarrelojista(3, "Luis", 55);

        ciclista.setVelocidadMaxima(60);

        assertEquals(60, ciclista.getVelocidadMaxima());
    }

}
