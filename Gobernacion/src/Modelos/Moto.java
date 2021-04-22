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
public class Moto extends Vehiculo{
    //Atributos de la Clase
    public int cilindraje;
    public int numLlantas;
    
    //Constructor Por Defecto
    public Moto(){
        
    }
    //Constructor Parametrizado

    public Moto(int cilindraje, int numLlantas, String placa, String color, int numPasajeros, int modelo, int valorComercial) {
        super(placa, color, numPasajeros, modelo, valorComercial);
        this.cilindraje = cilindraje;
        this.numLlantas = numLlantas;
    }
    
    //Metodos de la Clase
    @Override
    public String mostrar(){
        return "Placa Carro: " + this.placa + "Color: " + this.color + "Cantidad de Asientos: " + this.numPasajeros + "Modelo: " + this.modelo + "Valor Comercial: " + this.valorComercial + "Cilindraje: " + this.cilindraje + "Numero de Llantas: " + this.numLlantas;
    }
    
    @Override
    public float calcularValorReal(){
        float valor3 = 0;
        float valor2 = 0;
        
        valor2 = (float) (valorComercial - (valorComercial*0.19));
        if(this.numLlantas == 2){
            valor3 = (float) (valor2 - (valor2*0.02));
        }else if(this.numLlantas == 4){
            valor3 = (float) (valor2 - (valor2*0.03));
        }else{
            System.out.println("El valor no se puede calcular");
        }
        
        return valor3;
    }
}
