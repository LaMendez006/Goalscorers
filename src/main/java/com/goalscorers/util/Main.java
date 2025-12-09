/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.goalscorers.util;

import com.goalscorers.logica.*;
import com.goalscorers.modelos.*;

/**
 *
 * @author hijo
 */
public class Main {
    public static void main(String[] args){
        DatosCargados datos = GestorArchivos.cargarDatos("C:/Users/hijo/Desktop/GoalScorers/src/main/resources/results.csv");
        Seleccion s = datos.buscarSeleccionPorNombre("Colombia");
        System.out.println(Analizador.obtenerGolesAFavor(datos, s));
    }
}

