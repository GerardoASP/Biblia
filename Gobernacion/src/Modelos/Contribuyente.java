/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class Contribuyente {
    //Atributos de la Clase
    public String nombre;
    public long cedula;
    public String correo;
    public long telefono;
    public ArrayList<Vehiculo> listadoVehiculos;
    
    //Constructor Por Defecto
    public Contribuyente(){
        listadoVehiculos = new ArrayList<>();
    }
    //Constructor Parametrizado

    public Contribuyente(String nombre, long cedula, String correo, long telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        listadoVehiculos = new ArrayList<>();
    }
    
    //Metodos de la Clase
    public String mostrar(){
        return "Nombre: " + this.nombre + "Cedula: " + this.cedula + "Correo: " + this.correo + "Telefono: " + this.telefono;
    }
    
    public void agregarCarro(String tipoCarro, String tipoServicio, int numPuertas, String placa, String color, int numPasajeros, int modelo, int valorComercial){
        Vehiculo nuevoC = new Carro(tipoCarro, tipoServicio, numPuertas, placa, color, numPasajeros, modelo, valorComercial);
        listadoVehiculos.add(nuevoC);
    }
    
    public void agregarMoto(String tipoCarro, String tipoServicio, int numPuertas, String placa, String color, int numPasajeros, int modelo, int valorComercial){
        Vehiculo nuevoM = new Moto(modelo, numPuertas, placa, color, numPasajeros, modelo, valorComercial);
        listadoVehiculos.add(nuevoM);
    }
    public int obtenerNumCarros(){
        int contCarros = 0;
        for (Vehiculo ve : listadoVehiculos) {
            if(ve instanceof Carro){
                contCarros++;
            }
        }
        return contCarros;
    }
    
    public int obtenerNumMotos(){
        int contMotos = 0;
        for (Vehiculo ve : listadoVehiculos) {
            if(ve instanceof Moto){
                contMotos++;
            }
        }
        return contMotos;
    }
    
    public int calcularImpuesto(){
        int valorTotal=0;
        int valorImpuestoMoto = 0;
        int valorImpuestoCarro = 0;
        int impuestoPublico = 0;
        for (Vehiculo ve : listadoVehiculos) {
            if(ve instanceof Moto){
                Moto aux = (Moto)ve;
                if(aux.cilindraje > 125){
                    if(aux.numLlantas == 2){
                        valorImpuestoMoto = (int) (aux.valorComercial - (aux.valorComercial*0.1));
                    }else if(aux.numLlantas == 4){
                        valorImpuestoMoto = (int) (aux.valorComercial - (aux.valorComercial*0.15));
                    }else{
                       valorImpuestoMoto = 0; 
                    }
                }else{
                    valorImpuestoMoto = 0;
                }
            }
            if(ve instanceof Carro){
                Carro aux2 = (Carro)ve;
                if(aux2.tipoCarro.equalsIgnoreCase("carro normal")){
                    valorImpuestoCarro = (int) (aux2.valorComercial - (aux2.valorComercial*0.20));
                }else if(aux2.tipoCarro.equalsIgnoreCase("camioneta")){
                    valorImpuestoCarro = (int) (aux2.valorComercial - (aux2.valorComercial*0.25));
                }else if(aux2.tipoServicio.equalsIgnoreCase("servicio publico")){
                    impuestoPublico = (int) (aux2.valorComercial - (aux2.valorComercial*0.20)) + 50000;
                }
            }
        }
        valorTotal = valorImpuestoMoto + valorImpuestoCarro + impuestoPublico;
        return valorTotal;
    }
    
    public int obtenerValorPrCuatriM(){ //Obtener el valor promedio de las cuatrimotos encontradas en la lista de vehiculos
        int promedio = 0;
        int sumaValorCuatriMotos = 0;
        int contMotos = 0;
        for (Vehiculo ve : listadoVehiculos) {
            if(ve instanceof Moto){
               Moto aux = (Moto)ve;
               if(aux.numLlantas == 4){
                   sumaValorCuatriMotos = sumaValorCuatriMotos+ aux.valorComercial;
                   contMotos++;
               }else{
                   sumaValorCuatriMotos = 0;
               }
            }
        }
        
        promedio = sumaValorCuatriMotos/contMotos; 
        return promedio;
    }
    
    public int obtenerValorMaxServicioP(){
        int mayor = -1;
        for (Vehiculo ve : listadoVehiculos) {
            if(ve instanceof Carro){
                Carro aux2 = (Carro)ve;
                if(aux2.tipoServicio.equalsIgnoreCase("serviciopublico")){
                    if(aux2.valorComercial > mayor){
                        mayor = aux2.valorComercial;
                    }
                }
            }
        }
        return mayor;
    }
    
    
}
