package com.goalscorers.test;

import com.goalscorers.modelos.Partido;
import com.goalscorers.modelos.Seleccion;
import com.goalscorers.modelos.ResultadoPartido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartidoTest {

    @Test
    public void testEsPartidoNeutral() {
        Seleccion colombia = new Seleccion("Colombia");
        Seleccion brasil = new Seleccion("Brasil");

        Partido p = new Partido(colombia, brasil, 1, 0, "Colombia", "Bogotá", "Eliminatoria", "2020-02-01");

        assertTrue(p.esPartidoNeutral());
    }

    @Test
    public void testNoEsNeutral() {
        Seleccion colombia = new Seleccion("Colombia");
        Seleccion brasil = new Seleccion("Brasil");

        Partido p = new Partido(colombia, brasil, 1, 0, "Brasil", "Rio", "Copa América", "2020-02-01");

        assertFalse(p.esPartidoNeutral());
    }

    @Test
    public void testObtenerGanadorLocal() {
        Seleccion l = new Seleccion("A");
        Seleccion v = new Seleccion("B");

        Partido p = new Partido(l, v, 3, 1, "A", "X", "Test", "2022");

        assertEquals(ResultadoPartido.LOCAL, p.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorVisitante() {
        Seleccion l = new Seleccion("A");
        Seleccion v = new Seleccion("B");

        Partido p = new Partido(l, v, 0, 1, "A", "X", "Test", "2022");

        assertEquals(ResultadoPartido.VISITANTE, p.obtenerGanador());
    }

    @Test
    public void testObtenerEmpate() {
        Seleccion l = new Seleccion("A");
        Seleccion v = new Seleccion("B");

        Partido p = new Partido(l, v, 1, 1, "A", "X", "Test", "2022");

        assertEquals(ResultadoPartido.EMPATE, p.obtenerGanador());
    }

    @Test
    public void testSetPuntuacionLocalValido() {
        Seleccion l = new Seleccion("A");
        Seleccion v = new Seleccion("B");

        Partido p = new Partido(l, v, 0, 0, "A", "X", "Test", "2022");

        assertTrue(p.setPuntuacionLocal(5));
        assertEquals(5, p.getPuntuacionLocal());
    }

    @Test
    public void testSetPuntuacionLocalInvalido() {
        Seleccion l = new Seleccion("A");
        Seleccion v = new Seleccion("B");

        Partido p = new Partido(l, v, 0, 0, "A", "X", "Test", "2022");

        assertFalse(p.setPuntuacionLocal(-1));
    }
}
