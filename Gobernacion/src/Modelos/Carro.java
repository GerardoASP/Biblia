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
public class Carro extends Vehiculo{
    //Atributos de la Clase
    public String tipoCarro;
    public String tipoServicio;
    public int numPuertas;
    
    //Constructor Por Defecto
    public Carro(){
        
    }
    //Constructor Parametrizado

    public Carro(String tipoCarro, String tipoServicio, int numPuertas, String placa, String color, int numPasajeros, int modelo, int valorComercial) {
        super(placa, color, numPasajeros, modelo, valorComercial);
        this.tipoCarro = tipoCarro;
        this.tipoServicio = tipoServicio;
        this.numPuertas = numPuertas;
    }
    
    //Metodos de la Clase
    @Override
    public String mostrar(){
        return "Placa Carro: " + this.placa + "Color: " + this.color + "Cantidad de Asientos: " + this.numPasajeros + "Modelo: " + this.modelo + "Valor Comercial: " + this.valorComercial + "Tipo Carro: " + this.tipoCarro + "Tipo Servicio: " + this.tipoServicio + "Numero de Puertas: " + this.numPuertas;
    }
    
    @Override
    public float calcularValorReal(){
        float valor3 = 0;
        float valor2 = 0;
        
        valor2 = (float) (valorComercial - (valorComercial*0.19));
        if(this.tipoCarro.equalsIgnoreCase("carro normal")){
           valor3 = (float) (valor2 - (valor2*0.03)); 
        }else if(this.tipoCarro.equalsIgnoreCase("camioneta")){
            valor3 = (float) (valor2 - (valor2*0.05));
        }
        return valor3;
    }
}
