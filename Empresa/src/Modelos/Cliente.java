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
public class Cliente {
    //Atributos de la Clase
    public String nombre;
    private boolean estadoCliente;
    
    //Constructor Por Defecto
    public Cliente(){
        
    }
    //Constructor Parametrizado

    public Cliente(String nombre, boolean estadoCliente) {
        this.nombre = nombre;
        this.estadoCliente = estadoCliente;
    }
    
    //Serie de Getters And Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
    //Metodos de la Clase
    public String imprimirDatos(){
        return "Nombre: " + this.nombre + "Estado: " + this.estadoCliente;
    }
}
