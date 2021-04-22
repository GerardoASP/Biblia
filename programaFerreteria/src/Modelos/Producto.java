
package Modelos;

public class Producto {
    //Atributos de la Clase
    public String nombre;
    public String marca;
    protected String codigoBarra;
    private int precioProducto;
    public int inventarioProducto;
    public double iva;
    protected String nombreProveedor;
    
    //Constructor Por Defecto
    public Producto(double iva){
        iva = 0.19;
    }
    //Constructor Parametrizado
    public Producto(String nombre,String marca,String codigoBarra,int precioProducto,int inventarioProducto,double iva,String nombreProveedor){
        this.nombre = nombre;
        this.marca = marca;
        this.codigoBarra = codigoBarra;
        this.precioProducto = precioProducto;
        this.inventarioProducto = inventarioProducto;
        this.iva = 0.19;
        this.nombreProveedor = nombreProveedor;
    }
    //Serie de Getters And Setters
    public int getPrecioProducto(){
        return this.precioProducto;
    }
    
    public void setPrecioProducto(int precioProducto){
        this.precioProducto = precioProducto;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "Marca: " + this.marca + "codigo de Barra: " + this.codigoBarra + "Precio Producto: " + this.precioProducto + "Cantidad del producto: " + this.inventarioProducto + "Iva: " + this.iva + "Nombre del Proveedor: " + this.nombreProveedor;
    }
}
