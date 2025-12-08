/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.goalscorers.modelos;

/**
 *
 * @author hijo
 */
public class Partido {
    private Seleccion equipoLocal;
    private Seleccion equipoVisitante;
    private int puntuacionLocal;
    private int puntuacionVisitante;
    private String pais;
    private String ciudad;
    private String torneo;
    private String fecha;
    private boolean esNeutral; 

    public Partido(Seleccion equipoLocal, Seleccion equipoVisitante, int puntuacionLocal, int puntuacionVisitante, String pais, String ciudad, String torneo, String fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntuacionLocal = puntuacionLocal;
        this.puntuacionVisitante = puntuacionVisitante;
        this.pais = pais;
        this.ciudad = ciudad;
        this.torneo = torneo;
        this.fecha = fecha;
        if(equipoLocal.equals(pais)){
            this.esNeutral = true;
        }else{
            this.esNeutral = false;
        }
    }
    
    
}
