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
public class Vendedor extends Empleado{
    //Atributos de la clase
    public Coche cocheEmpresa;
    public long telefonoMovil;
    public String areaVenta;
    public ArrayList<Cliente> listadoClientes;
    public boolean estadoVendedor;
    public float porcentajeVentas;
    
    //Constructor Por Defecto
    public Vendedor(){
        super();
        listadoClientes = new ArrayList<>();
    }
    //Constructor Por Defecto

    public Vendedor(Coche cocheEmpresa, long telefonoMovil, String areaVenta, float porcentajeVentas, String nombre, String apellidos, long documento, String direccion, int tiempoEmpresa, long telefonoContacto, int salario, String puesto, Empleado supervisor,boolean estadoVendedor) {
        super(nombre, apellidos, documento, direccion, tiempoEmpresa, telefonoContacto, salario, puesto, supervisor);
        this.cocheEmpresa = cocheEmpresa;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.porcentajeVentas = porcentajeVentas;
        this.estadoVendedor = estadoVendedor;
        listadoClientes = new ArrayList<>();
    }
    
    //Serie de Getters And Setters
    public boolean getEstadoVendedor() {
        return estadoVendedor;
    }

    public void setEstadoVendedor(boolean estadoVendedor) {
        this.estadoVendedor = estadoVendedor;
    }

    public ArrayList<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void setListadoClientes(ArrayList<Cliente> listadoClientes) {
        this.listadoClientes = listadoClientes;
    }
    
    
    //Metodos de la clase
    public void cambiarCoche(String matricula, String marca, String modelo){
        Coche nuevoCoche = new Coche(matricula, marca, modelo);
        cocheEmpresa = nuevoCoche;
    }
    
    public void agregarCliente(String nombre, boolean estadoCliente){
        Cliente nuevo = new Cliente(nombre, estadoCliente);
        listadoClientes.add(nuevo);
    }
    
    public String buscarCliente(String nombre){
        for (Cliente c : listadoClientes) {
            if (c != null && c.getNombre().equals(nombre)) {
                return c.imprimirDatos();
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Cliente con el nombre ingresado ");
        return null;
    }
    
    public void darAltaCliente(String nombre){
        for (Cliente c : listadoClientes) {
            if (c != null && c.getNombre().equals(nombre)) {
                c.setEstadoCliente(true);
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Cliente con el nombre ingresado ");
    }
    
    public void darBajaCliente(String nombre){
        for (Cliente c : listadoClientes) {
            if (c != null && c.getNombre().equals(nombre)) {
                c.setEstadoCliente(false);
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Cliente con el nombre ingresado ");
    }
    @Override
    public void incrementarSalario(){
        int aumento = (int) (this.salario * 0.1);
        this.salario = this.salario + aumento;
    }
}
