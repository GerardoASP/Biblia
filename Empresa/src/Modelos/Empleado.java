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
public class Empleado {
    //Atributos de la clase
    public String nombre;
    public String apellidos;
    public long documento;
    public String direccion;
    public int tiempoEmpresa; //Años de Antiguedad
    public long telefonoContacto;
    public int salario;
    public String puesto;
    public Empleado supervisor;
    
    //Constructor Por Defecto
    public Empleado(){
        
    }
    //Constructor Parametrizado
    public Empleado(String nombre,String apellidos,long documento,String direccion,long telefonoContacto,int salario,String puesto){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
        this.salario = salario;
        this.puesto = puesto;
    }

    public Empleado(String nombre, String apellidos, long documento, String direccion, int tiempoEmpresa, long telefonoContacto, int salario, String puesto,Empleado supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.direccion = direccion;
        this.tiempoEmpresa = tiempoEmpresa;
        this.telefonoContacto = telefonoContacto;
        this.salario = salario;
        this.puesto = puesto;
        this.supervisor = supervisor;
    }
    
    //Serie de Getters And Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    //Metodos de la Clase
    public String imprimir(){
        return "Nombre: " + this.nombre + "Apellidos: " + this.apellidos + "Documento: " + this.documento + "Direccion: " + this.direccion + "Telefono Contacto: " + this.telefonoContacto + "Salario: " + this.salario + "Supervisor: "+ this.supervisor.nombre;
    }
    
    public void cambiarSupervisor(String nombre,String apellidos,long documento,String direccion,long telefonoContacto,int salario,String puesto){
        Empleado supervisorAsignado = new Empleado(nombre, apellidos, documento, direccion, telefonoContacto, salario,puesto);
        supervisor = supervisorAsignado;
    }
    
    public void incrementarSalario(){
        salario++;
    }
}
