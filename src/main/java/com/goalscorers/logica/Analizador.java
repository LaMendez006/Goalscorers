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
            if(partido.obtenerGanador()==ResultadoPartido.LOCAL && partido.getEquipoLocal().equals(seleccion)){
                victorias ++;
            }
            if(partido.obtenerGanador()==ResultadoPartido.VISITANTE && partido.getEquipoVisitante().equals(seleccion)){
                victorias ++;
            }
        }
        return victorias;
    }
    
    public static int obtenerEmpates(DatosCargados datos, Seleccion seleccion){
        int empates = 0;
        for(Partido partido: datos.getPartidos()){
            if(partido.obtenerGanador()==ResultadoPartido.EMPATE && (partido.getEquipoLocal().equals(seleccion) || partido.getEquipoVisitante().equals(seleccion))){
                empates ++;
            }
        }
        return empates;
    }
    
    public static int obtenerDerrotas(DatosCargados datos, Seleccion seleccion){
        int derrotas = 0;
        for(Partido partido: datos.getPartidos()){
            if(partido.obtenerGanador()==ResultadoPartido.LOCAL && partido.getEquipoVisitante().equals(seleccion)){
                derrotas ++;
            }
            if(partido.obtenerGanador()==ResultadoPartido.VISITANTE && partido.getEquipoLocal().equals(seleccion)){
                derrotas ++;
            }
        }
        return derrotas;     
    }
    
    public static int obtenerGolesAFavor(DatosCargados datos, Seleccion seleccion){
        int goles = 0;
        for(Partido partido: datos.getPartidos()){
            if(partido.getEquipoVisitante().equals(seleccion)){
                goles += partido.getPuntuacionVisitante();
            }
            if(partido.getEquipoLocal().equals(seleccion)){
                goles += partido.getPuntuacionLocal();
            }
        }
        return goles; 
    }
}
