
package Modelos;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ferreteria {
    //Atributos de la Clase
    public String nombreFerreteria;
    public ArrayList<Sucursal> listaSucursales;
    protected ArrayList<Producto> listaProductos;
    //Constructor Por Defecto
    public Ferreteria(){
        this.listaSucursales = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
    }
    
    public Ferreteria(String nombreFerreteria,ArrayList<Sucursal> listaSucursales,ArrayList<Producto> listaProductos){
        this.nombreFerreteria = nombreFerreteria;
        this.listaSucursales = new ArrayList<>();
        this.listaProductos = listaProductos;
    }
    
    //Metodos de la Clase
    public void trasladarMercancia(){
        System.out.println("Trasladando mercancia a la Sucursal");
    }
    
    public void llenarListaSucursales(String localizacion,String logistica,ArrayList<Producto> productosSucursal){
        Sucursal nueva = new Sucursal(localizacion, logistica,productosSucursal);
        listaSucursales.add(nueva);
    }
    
    public int buscarSucursal(String direccion){
        boolean encontrado = false;
        int i=0;
        int pos = 0;
        while(encontrado == false && i<listaSucursales.size()){
            if(listaSucursales.get(i).getLocalizacion().compareToIgnoreCase(direccion)==0){
                encontrado = true;
                pos = i;
            }else{
                i++;
            }
        }
        if(encontrado){
            return pos;
        }
        return 0;
    }
    
    public void listarSucursales(){
        for(Sucursal sucursal: listaSucursales){
            if (sucursal != null) {
                System.out.println("" + sucursal);
            }
        }
    }
    
    public void llenarListaProductos(String nombre,String marca,String codigoBarra,int precioProducto,int inventarioProducto,double iva,String nombreProveedor){
        Producto nuevo = new Producto(nombre, marca, codigoBarra, precioProducto, inventarioProducto, iva, nombreProveedor);
        listaProductos.add(nuevo);
    }
    
    public void listarProductos(){
        for(Producto producto : listaProductos){
            if(producto != null){
                System.out.println("" + producto);
            }
        }
    }
    
    public void surtirSucursales(ArrayList<Producto> listaProductos,String direccion,String tipoEntrega){
        ArrayList<Producto> listaProductosS = new ArrayList<>();
        for (Producto listaProducto : listaProductos) {
            listaProductosS.add(listaProducto);
        }
        Sucursal sucursalAllenar = new Sucursal(direccion,tipoEntrega,listaProductosS);
    }
    
    public void asesorarProyectos(String tipoProyecto,int alto,int ancho){
        int area = alto * ancho;
        if(tipoProyecto.equalsIgnoreCase("Muro")){
            System.out.println("Para su proyecto de " + area + "y de tipo" + " " + "le recomendamos un presupuesto de $426,000");
        }else if(tipoProyecto.equalsIgnoreCase("Metaldeck")){
            System.out.println("Para su proyecto de " + area + "y de tipo" + " " + "le recomendamos un presupuesto de $441,700");
        }else if (tipoProyecto.equalsIgnoreCase("Muro de Bloque")){
            System.out.println("Para su proyecto de " + area + "y de tipo" + " " + "le recomendamos un presupuesto de $135,220");
        }else{
            System.out.println("Ese tipo de proyecto no esta disponible");
        }
    }
    
    public void atenderVentas(String nombre,String tipoDocumento,long numDocumento){
        Cliente nuevoCliente = new Cliente(nombre, tipoDocumento, numDocumento);
        System.out.println("Bienvenido señor/a usuario en que podemos colaborarle");
        
    }
    
    public String alquilarHerramientas(String nombreCliente,long numDocumento,int dinero){
        String respuestaAlquiler;
        
        respuestaAlquiler = "La herramienta esta disponible para prestamo";
        
        return respuestaAlquiler;
    }
}
