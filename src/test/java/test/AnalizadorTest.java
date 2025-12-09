package com.goalscorers.logica;

import com.goalscorers.modelos.Partido;
import com.goalscorers.modelos.ResultadoPartido;
import com.goalscorers.modelos.Seleccion;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnalizadorTest {

    @Test
    public void testObtenerVictorias() {
        Seleccion colombia = new Seleccion("Colombia");
        Seleccion brasil = new Seleccion("Brasil");

        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(new Partido(colombia, brasil, 3, 0, "Colombia", "Bogotá", "Amistoso", "2023-01-01"));
        partidos.add(new Partido(brasil, colombia, 2, 1, "Brasil", "Rio", "Amistoso", "2023-02-01"));

        DatosCargados datos = new DatosCargados(partidos, new ArrayList<>());

        int victorias = Analizador.obtenerVictorias(datos, colombia);
        assertEquals(1, victorias);
    }

    @Test
    public void testObtenerEmpates() {
        Seleccion colombia = new Seleccion("Colombia");
        Seleccion argentina = new Seleccion("Argentina");

        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(new Partido(colombia, argentina, 1, 1, "Colombia", "Medellín", "Amistoso", "2023-01-05"));

        DatosCargados datos = new DatosCargados(partidos, new ArrayList<>());

        int empates = Analizador.obtenerEmpates(datos, colombia);
        assertEquals(1, empates);
    }

    @Test
    public void testObtenerDerrotas() {
        Seleccion colombia = new Seleccion("Colombia");
        Seleccion uruguay = new Seleccion("Uruguay");

        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(new Partido(colombia, uruguay, 0, 2, "Colombia", "Cali", "Amistoso", "2023-03-01"));

        DatosCargados datos = new DatosCargados(partidos, new ArrayList<>());

        int derrotas = Analizador.obtenerDerrotas(datos, colombia);
        assertEquals(1, derrotas);
    }

    @Test
    public void testObtenerGolesAFavor() {
        Seleccion colombia = new Seleccion("Colombia");
        Seleccion peru = new Seleccion("Perú");

        ArrayList<Partido> partidos = new ArrayList<>();
        partidos.add(new Partido(colombia, peru, 2, 1, "Colombia", "Cartagena", "Amistoso", "2023-04-01"));
        partidos.add(new Partido(peru, colombia, 0, 3, "Perú", "Lima", "Amistoso", "2023-04-15"));

        DatosCargados datos = new DatosCargados(partidos, new ArrayList<>());

        int goles = Analizador.obtenerGolesAFavor(datos, colombia);
        assertEquals(5, goles);
    }
}

