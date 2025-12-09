package test;

import com.goalscorers.logica.DatosCargados;
import com.goalscorers.modelos.Partido;
import com.goalscorers.modelos.Seleccion;
import com.goalscorers.util.GestorArchivos;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorArchivosTest {

    @Test
    public void testCargarDatos_ArchivoExiste() throws Exception {
        URL resource = getClass().getClassLoader().getResource("results.csv");
        assertNotNull(resource, "El archivo dataset.csv no se encontró en test/resources");

        String ruta = Paths.get(resource.toURI()).toString();

        DatosCargados datos = GestorArchivos.cargarDatos(ruta);

        assertNotNull(datos, "El objeto DatosCargados no debe ser null");
        assertNotNull(datos.getPartidos(), "La lista de partidos no debe ser null");
        assertNotNull(datos.getSelecciones(), "La lista de selecciones no debe ser null");

        assertTrue(datos.getPartidos().size() > 0, "Debe cargar al menos un partido");
        assertTrue(datos.getSelecciones().size() > 0, "Debe crear al menos una selección");
    }

    @Test
    public void testCargarDatos_SinDuplicarSelecciones() throws Exception {
        URL resource = getClass().getClassLoader().getResource("results.csv");
        assertNotNull(resource, "El archivo dataset.csv no se encontró en test/resources");

        String ruta = Paths.get(resource.toURI()).toString();
        DatosCargados datos = GestorArchivos.cargarDatos(ruta);

        List<Seleccion> selecciones = datos.getSelecciones();

        long nombresDistintos = selecciones.stream()
                .map(s -> s.getNombre())
                .distinct()
                .count();

        assertEquals(nombresDistintos, selecciones.size(),
                "No debe haber selecciones duplicadas");
    }

    @Test
    public void testCargarDatos_VerificarPrimerPartido() throws Exception {
        URL resource = getClass().getClassLoader().getResource("results.csv");
        assertNotNull(resource, "El archivo dataset.csv no se encontró en test/resources");

        String ruta = Paths.get(resource.toURI()).toString();

        DatosCargados datos = GestorArchivos.cargarDatos(ruta);
        List<Partido> partidos = datos.getPartidos();

        assertTrue(partidos.size() > 0, "Debe haber partidos cargados");

        Partido p = partidos.get(0); 

        assertNotNull(p.getEquipoLocal(), "El equipo local no puede ser null");
        assertNotNull(p.getEquipoVisitante(), "El equipo visitante no puede ser null");
        assertNotNull(p.getFecha(), "La fecha no debe ser null");
        assertFalse(p.getFecha().trim().isEmpty(), "La fecha no debe estar vacía");
        assertNotNull(p.getCiudad(), "La ciudad no debe ser null");
        assertFalse(p.getCiudad().trim().isEmpty(), "La ciudad no debe estar vacía");
        assertNotNull(p.getPais(), "El país no debe ser null");
        assertFalse(p.getPais().trim().isEmpty(), "El país no debe estar vacío");
        assertTrue(p.getPuntuacionLocal() >= 0, "Puntuacion local no puede ser negativa");
        assertTrue(p.getPuntuacionVisitante() >= 0, "Puntuacion visitante no puede ser negativa");
    }
}
