/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.goalscorers.util;
import com.goalscorers.logica.DatosCargados;
import com.goalscorers.modelos.Partido;
import com.goalscorers.modelos.Seleccion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hijo
 */
public class GestorArchivos {
    public static DatosCargados cargarDatos(String ruta){
        ArrayList<Partido> partidos = new ArrayList<>();
        ArrayList<Seleccion> selecciones = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null){
                String[] partes = linea.split(",");
                String fecha = partes[0];
                String nombreLocal = partes[1];
                String nombreVisitante = partes[2];
                Seleccion local = buscarOcrearSeleccion(nombreLocal, selecciones);
                Seleccion visitante = buscarOcrearSeleccion(nombreVisitante, selecciones);
                int golesLocal = Integer.parseInt(partes[3]);
                int golesVisitante = Integer.parseInt(partes[4]);
                String torneo = partes[5];
                String ciudad = partes[6];
                String pais = partes[7];
                boolean esNeutral = true;
                if(partes[8].equals("FALSE")){
                    esNeutral= false;
                }
                        
                partidos.add(new Partido(local, visitante, golesLocal, golesVisitante, pais, ciudad, torneo, fecha, esNeutral));
                
            }
            br.close();
            System.out.println("Archivo cargado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return new DatosCargados(partidos, selecciones);
    }

    private static Seleccion buscarOcrearSeleccion(String nombre, List<Seleccion> selecciones){
        for (Seleccion s : selecciones){
            if (s.getNombre().equals(nombre)){
                return s;
            }
        }

        Seleccion nueva = new Seleccion(nombre);
        selecciones.add(nueva);
        return nueva;
    }
}
