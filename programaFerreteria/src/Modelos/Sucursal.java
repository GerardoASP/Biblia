
package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sucursal {
    //Atributos de la clase
    public String localizacion;
    private String logistica;
    protected ArrayList<Cliente> listaClientes;
    public ArrayList<Producto> listaProductosS;
    
    //Constructor Por Defecto
    public Sucursal(){
        this.listaClientes = new ArrayList<>();
        this.listaProductosS = new ArrayList<>();
    }
    //Constructor Parametrizado
    public Sucursal(String localizacion,String logistica){
        this.localizacion = localizacion;
        this.logistica = logistica;
    }
    
    public Sucursal(String localizacion,String logistica,ArrayList<Producto> listaProductosS,ArrayList<Cliente> listaClientes){
        this.localizacion = localizacion;
        this.logistica = logistica;
        this.listaProductosS = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }
    
    public Sucursal(String localizacion,String logistica,ArrayList<Producto> listaProductosS){
        this.localizacion = localizacion;
        this.logistica = logistica;
        this.listaProductosS = new ArrayList<>();
    }
    //Serie de Getters And Setters
    public String getLogistica(){
        return this.logistica;
    }
    public void setLogistica(String logistica){
        this.logistica = logistica;
    }
    
    public String getLocalizacion(){
        return this.localizacion;
    }
    
    public void setLocalizacion(String localizacion){
        this.localizacion = localizacion;
    }
    
    public ArrayList getListaProductosS(){
        return this.listaProductosS;
    }
    
    public void setListaProductosS(ArrayList<Producto> listaProductosS){
        this.listaProductosS = listaProductosS;
    }
    
    //Metodos de la Clase
    public void controlarInventario(ArrayList<Producto> listaProductos){
        if(listaProductos.size() <= 0){
            JOptionPane.showMessageDialog(null,"Alerta");
        }else{
            JOptionPane.showMessageDialog(null,"Inventario Lleno");
        }
    }
    
    public String generarInformePrincipal(Producto p,Cliente c,VendedorExterno ve){
        String retornoInforme;
        retornoInforme = "El producto " + p.nombre + "Ha sido Comprado por El Cliente con el nombre " + c.nombre + "y numero de documento" + c.numDocumento + "Con Ayuda del Vendedor Externo de nombre " + ve.nombre;
        return retornoInforme;
    }
    
    public void atenderVentas(String localizacion){
        JOptionPane.showMessageDialog(null,"Bienvenidos a la Sucursal " + localizacion + "en que podemos servirle");
    }
    
    @Override
    public String toString(){
        return "Localizacion: " + this.localizacion + "Logistica: " + this.logistica;
    }
}
