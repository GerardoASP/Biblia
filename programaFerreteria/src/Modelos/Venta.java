
package Modelos;

import javax.swing.JOptionPane;

public class Venta {
    //Atributos de la Clase
    protected long numCliente;
    
    //Constructor Por Defecto
    public Venta(){
        
    }
    //Constructor Parametrizado
    public Venta(long numCliente){
        this.numCliente = numCliente;
    }
    
    //Metodos de la Clase
    protected void cotizarVentas(Producto p,int cantProducto){
        int cotizacionVenta = 0;
        cotizacionVenta = cantProducto * p.getPrecioProducto();
        JOptionPane.showMessageDialog(null,"Señor/a Usuario la compra le puede salir en " + cotizacionVenta + "Pesos");
    }
    
    protected void facturarVentas(Producto p,int cantProducto,Cliente c){
        int cotizacionVenta = 0;
        cotizacionVenta = cantProducto * p.getPrecioProducto();
        JOptionPane.showMessageDialog(null,"Factura " + "\n" + "Nombre Cliente: " + c.nombre + "\n" + "Producto: " + "\n" + p.nombre + " " + p.marca + " "  + "Valor de la Compra: " + cotizacionVenta);   
    }
    
    protected void registrarPagos(){
        JOptionPane.showMessageDialog(null,"El pago por el producto ha sido registrado");
    }
}
