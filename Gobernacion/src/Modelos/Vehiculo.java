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
public class Vehiculo {
    //Atributos de la Clase
    public String placa;
    public String color;
    public int numPasajeros;
    public int modelo;
    public int valorComercial;
    
    //Constructor Por Defecto
    public Vehiculo(){
        
    }
    //Constructor Parametrizado

    public Vehiculo(String placa, String color, int numPasajeros, int modelo, int valorComercial) {
        this.placa = placa;
        this.color = color;
        this.numPasajeros = numPasajeros;
        this.modelo = modelo;
        this.valorComercial = valorComercial;
    }
    
    //Metodos de la Clase
    public String mostrar(){
        return "Placa Carro: " + this.placa + "Color: " + this.color + "Cantidad de Asientos: " + this.numPasajeros + "Modelo: " + this.modelo + "Valor Comercial: " + this.valorComercial;
    }
    
    public float calcularValorReal(){
        float valor3 = 0;
        float valor2 = 0;
        
        valor2 = (float) (this.valorComercial - (this.valorComercial*0.19));
        valor3 = (float) (valor2 - (valor2*0.05));
        return valor3;
    }
    
    public void cambiarColor(String nuevoColor){
        this.color = nuevoColor;
    }
    
    
}
