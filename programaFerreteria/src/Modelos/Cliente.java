package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Persona{
    //Atributos de la Clase
    protected String medioPago;
    protected ArrayList<Compra> historialCompras;
    
    
    //Constructor Por Defecto
    public Cliente(){
        this.historialCompras = new ArrayList<>();
    }
    //Constructor Parametrizado
    public Cliente(long numDocumento,String tipoDocumento,String nacionalidad,String domicilio,String medioPago,String nombre){
        super(numDocumento,tipoDocumento,nacionalidad,domicilio,nombre);
        this.medioPago = medioPago;
    }
    
    public Cliente(String nombre,String tipoDocumento,long numDocumento){
        super(nombre,tipoDocumento,numDocumento);
    }
    
    //Metodos de la Clase
    protected boolean preguntarPorProducto(String nombreProducto,String marcaProducto,ArrayList<Producto>listaProductos,int cantProducto){
        boolean respuesta = false;
        for(int j=0;j<listaProductos.size();j++){
            if((listaProductos.get(j).nombre.equals(nombreProducto)) && (listaProductos.get(j).marca.equalsIgnoreCase(marcaProducto))){
                respuesta=true;
            }else{
                respuesta = false;
            }
        }
        return respuesta;
    }
    
    protected int pagarPorProducto(boolean confirmacionProducto,int dineroCliente,int valorProducto,int cantProducto){
        String retorno;
        int devuelta = 0;
        if(confirmacionProducto == true){
            if(dineroCliente >= valorProducto){
                JOptionPane.showMessageDialog(null,"El pago es valido");
                devuelta = dineroCliente - valorProducto;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Lo siento señor/a no se puede validar el pago porque no tenemos disponible el producto");
        }
        return devuelta;
    }
    
    protected String hacerPedido(String nombreProducto,boolean confirmacionProducto,int cantProducto,String marcaProducto){
        String retornoFuncion;
        if(confirmacionProducto == true){
            if(cantProducto > 0){
                retornoFuncion = "Pedido Valido";
            }else{
                retornoFuncion = "Pedido no valido";
            }
        }else{
            retornoFuncion = "No se puede generar pedido";
        }
        return retornoFuncion;
    }
}
