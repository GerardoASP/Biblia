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
public class JefeZona extends Empleado{
    //Atributos de la clase
    public String despacho;
    public Secretario secretarioJefe;
    public ArrayList<Vendedor> listadoVendedores;
    public Coche cocheEmpresa;
    
    //Constructor Por Defecto
    public JefeZona(){
        
    }
    //Constructor Parametrizado

    public JefeZona(String despacho, Secretario secretarioJefe, ArrayList<Vendedor> listadoVendedores, Coche cocheEmpresa, String nombre, String apellidos, long documento, String direccion, long telefonoContacto, int salario, String puesto) {
        super(nombre, apellidos, documento, direccion, telefonoContacto, salario, puesto);
        this.despacho = despacho;
        this.secretarioJefe = secretarioJefe;
        this.listadoVendedores = listadoVendedores;
        this.cocheEmpresa = cocheEmpresa;
    }
    
    //Metodos de la Clase
    @Override
    public String imprimir(){
        return "Nombre: " + this.nombre + "Apellidos: " + this.apellidos + "Documento: " + this.documento + "Direccion: " + this.direccion + "Telefono Contacto: " + this.telefonoContacto + "Puesto en la Empresa: " + this.puesto;
    }
    
    public void cambiarSecretario(String nombre, String apellidos, long documento, String direccion, int tiempoEmpresa, long telefonoContacto, int salario,String puesto,Empleado supervisor,String despacho,int numeroFax){
        Secretario nuevo = new Secretario(nombre, apellidos, documento, direccion, tiempoEmpresa, telefonoContacto, salario, puesto, supervisor, despacho, numeroFax);
        secretarioJefe = nuevo;
    }
    
    public void cambiarCoche(String matricula, String marca, String modelo){
        Coche nuevoCoche = new Coche(matricula, marca, modelo);
        cocheEmpresa = nuevoCoche;
    }
    
    public void agregarVendedor(Coche cocheEmpresa, long telefonoMovil, String areaVenta, float porcentajeVentas, String nombre, String apellidos, long documento, String direccion, int tiempoEmpresa, long telefonoContacto, int salario, String puesto, Empleado supervisor,boolean estadoVendedor){
        Vendedor nuevo = new Vendedor(cocheEmpresa, telefonoMovil, areaVenta, porcentajeVentas, nombre, apellidos, documento, direccion, tiempoEmpresa, telefonoContacto, salario, puesto, supervisor,estadoVendedor);
        listadoVendedores.add(nuevo);
    }
    
    public String buscarVendedor(String nombre){
        for (Vendedor v : listadoVendedores) {
            if (v != null && v.getNombre().equals(nombre)) {
                return v.imprimir();
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro vendedor con el nombre ingresado ");
        return null;
    }
    
    public void darAltaVendedor(String nombre){
        for (Vendedor v : listadoVendedores) {
            if (v != null && v.getNombre().equals(nombre)) {
                v.setEstadoVendedor(true);
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Vendedor con el nombre ingresado ");
    }
    
    public void darBajaVendedor(String nombre){
        for (Vendedor v : listadoVendedores) {
            if (v != null && v.getNombre().equals(nombre)) {
                v.setEstadoVendedor(false);
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Vendedor con el nombre ingresado ");
    }
    
    @Override
    public void incrementarSalario(){
        int aumento = (int) (salario * 0.2);
        salario = salario + aumento;
    }
}
