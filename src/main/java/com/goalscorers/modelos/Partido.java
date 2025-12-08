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
        if(equipoLocal.getNombre().equals(pais)){
            this.esNeutral = true;
        }else{
            this.esNeutral = false;
        }
    }

    public Seleccion getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Seleccion equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Seleccion getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Seleccion equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getPuntuacionLocal() {
        return puntuacionLocal;
    }

    public boolean setPuntuacionLocal(int puntuacionLocal) {
        if(puntuacionLocal >= 0){
            this.puntuacionLocal = puntuacionLocal;
            return true;
        }
        return false;
    }

    public int getPuntuacionVisitante() {
        return puntuacionVisitante;
    }

    public boolean setPuntuacionVisitante(int puntuacionVisitante) {
        if(puntuacionVisitante >=0){
            this.puntuacionVisitante = puntuacionVisitante;
            return true;
        }
        return false;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTorneo() {
        return torneo;
    }

    public void setTorneo(String torneo) {
        this.torneo = torneo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean esPartidoNeutral() {
        return esNeutral;
    }

    public void setEsNeutral(boolean esNeutral) {
        this.esNeutral = esNeutral;
    }
    
    public ResultadoPartido obtenerGanador(){
        if(this.puntuacionLocal>this.puntuacionVisitante){
            return ResultadoPartido.LOCAL;
        }else if(this.puntuacionVisitante > this.puntuacionLocal){
            return ResultadoPartido.VISITANTE;
        }else{
            return ResultadoPartido.EMPATE;
        }
    }

    @Override
    public String toString() {
        return "Partido " +equipoLocal +" vs "+ equipoVisitante +  
                "\nEquipo local: " + equipoLocal + 
                "\nEquipo visitante: " + equipoVisitante + 
                "\nPuntuacion local: " + puntuacionLocal + 
                "\nPuntuacion visitante: " + puntuacionVisitante + 
                "\nPais: " + pais + 
                "\nCiudad: " + ciudad + 
                "\nTorneo: " + torneo + 
                "\nFecha: " + fecha + 
                "\nNeutral: " + esNeutral;
    }
    
    
    
}
