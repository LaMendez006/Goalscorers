package com.goalscorers.test;

import com.goalscorers.logica.DatosCargados;
import com.goalscorers.modelos.Seleccion;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class DatosCargadosTest {

    @Test
    public void testBuscarSeleccionPorNombre() {
        ArrayList<Seleccion> selecciones = new ArrayList<>();
        selecciones.add(new Seleccion("Colombia"));
        selecciones.add(new Seleccion("Argentina"));

        DatosCargados datos = new DatosCargados(new ArrayList<>(), selecciones);

        Seleccion res = datos.buscarSeleccionPorNombre("Argentina");

        assertNotNull(res);
        assertEquals("Argentina", res.getNombre());
    }

    @Test
    public void testBuscarSeleccionInexistente() {
        DatosCargados datos = new DatosCargados();

        assertNull(datos.buscarSeleccionPorNombre("NoExiste"));
    }
}
