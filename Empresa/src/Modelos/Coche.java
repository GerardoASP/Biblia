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
public class Coche {
    //Atributos de la Clase
    public String matricula;
    public String marca;
    public String modelo;
    
    //Constructor Por Defecto
    public Coche(){
        
    }
    //Constructor Parametrizado

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
}
