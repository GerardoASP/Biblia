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
public class Secretario extends Empleado{
    //Atributos de la clase
    public String despacho;
    public int numeroFax;
    
    //Constructor Por Defecto
    public Secretario(){
        super();
    }
    //Constructor Parametrizado
    public Secretario(String despacho,int numeroFax){
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }
    
    public Secretario(String nombre, String apellidos, long documento, String direccion, int tiempoEmpresa, long telefonoContacto, int salario,String puesto,Empleado supervisor,String despacho,int numeroFax){
        super(nombre,apellidos,documento,direccion,tiempoEmpresa,telefonoContacto,salario,puesto,supervisor);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }
    
    //Metodos de la Clase
    @Override
    public String imprimir(){
        return "Nombre: " + this.nombre + "Apellidos: " + this.apellidos + "Documento: " + this.documento + "Direccion: " + this.direccion + "Telefono Contacto: " + this.telefonoContacto + "Puesto en la Empresa: " + this.puesto;
    }
    
    @Override
    public void incrementarSalario(){
        int aumento = (int) (salario * 0.05);
        salario = salario + aumento;
    }
}
