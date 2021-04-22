/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class GuerreroSentai {
    //Atributos de la Clase
    public String nombre;
    public String tematica;
    public String color;
    public int numTemporada;
    
    //Constructor Por Defecto
    public GuerreroSentai(){
        
    }
    //Constructor Parametrizado
    public GuerreroSentai(String nombre, String tematica, String color, int numTemporada) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.color = color;
        this.numTemporada = numTemporada;
    }
    
    //Serie de Getters And Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }
    
    @Override
    public String toString(){
        return " Nombre: " + this.nombre + " Tematica: " + this.tematica + " Color: " + this.color + " Numero Temporada: " + this.numTemporada;
    }
}
