/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.goalscorers.logica;

import com.goalscorers.modelos.Partido;
import com.goalscorers.modelos.ResultadoPartido;
import com.goalscorers.modelos.Seleccion;

/**
 *
 * @author hijo
 */
public class Analizador {
    public static int obtenerVictorias(DatosCargados datos, Seleccion seleccion){
        int victorias = 0;
        for(Partido partido: datos.getPartidos()){
            if(partido.obtenerGanador()==ResultadoPartido.LOCAL && partido.getEquipoLocal()==seleccion){
                victorias ++;
            }
            if(partido.obtenerGanador()==ResultadoPartido.VISITANTE && partido.getEquipoVisitante()==seleccion){
                victorias ++;
            }
        }
        return victorias;
    }
    
    public static int obtenerEmpates(DatosCargados datos, Seleccion seleccion){
        int empates = 0;
        for(Partido partido: datos.getPartidos()){
            if(partido.obtenerGanador()==ResultadoPartido.EMPATE && (partido.getEquipoLocal()==seleccion || partido.getEquipoVisitante()==seleccion)){
                empates ++;
            }
        }
        return empates;
    }
}
