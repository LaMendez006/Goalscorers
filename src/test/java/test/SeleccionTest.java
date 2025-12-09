package test;

import com.goalscorers.modelos.Seleccion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeleccionTest {

    @Test
    public void testGetSetNombre() {
        Seleccion s = new Seleccion("Colombia");

        assertEquals("Colombia", s.getNombre());

        s.setNombre("Brasil");
        assertEquals("Brasil", s.getNombre());
    }
}
