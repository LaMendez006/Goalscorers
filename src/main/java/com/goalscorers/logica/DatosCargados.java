/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.goalscorers.logica;

import java.util.ArrayList;
import com.goalscorers.modelos.Partido;
import com.goalscorers.modelos.Seleccion;

/**
 *
 * @author hijo
 */
public class DatosCargados {
    private ArrayList<Partido> partidos;
    private ArrayList<Seleccion> selecciones;

    public DatosCargados(ArrayList<Partido> partidos, ArrayList<Seleccion> selecciones) {
        this.partidos = partidos;
        this.selecciones = selecciones;
    }

    public DatosCargados() {
        this.partidos = new ArrayList<>();
        this.selecciones = new ArrayList<>();
    }
    
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Seleccion> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<Seleccion> selecciones) {
        this.selecciones = selecciones;
    }
}
