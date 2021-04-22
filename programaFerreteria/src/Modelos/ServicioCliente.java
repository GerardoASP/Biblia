package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ServicioCliente {
    //Atributos de la Clase
    public String lineaDeAtencion;
    
    //Constructor Por Defecto
    public ServicioCliente(){
        
    }
    //Constructor parametrizado
    public ServicioCliente(String lineaDeAtencion){
        this.lineaDeAtencion = lineaDeAtencion;
    }
    
    //Metodos de la Clase
    protected void atenderPQRS(){
        JOptionPane.showMessageDialog(null,"Atendiendo al Usuario");
    }
    
    protected void monitorear(){
        JOptionPane.showMessageDialog(null,"Monitoreando los procesos de la Ferreteria");
    }
    
    protected void verificarDevoluciones(String nombreCliente,long numDocumentoC,String tipoDocumento,ArrayList<Cliente> listaClientes){
        String respuestaDevolucion;
        for(int i=0;i<listaClientes.size();i++){
            if((listaClientes.get(i).numDocumento)== numDocumentoC){
                respuestaDevolucion = "La devolución esta aprobada";
                JOptionPane.showConfirmDialog(null,respuestaDevolucion);
            }else{
                respuestaDevolucion = "La devolución no esta aprobada";
                JOptionPane.showMessageDialog(null,respuestaDevolucion);
            }
        }
    }
    
    protected void verificarGarantias(String nombreCliente,long numDocumento,ArrayList<Compra> historialCompras){
        if(historialCompras.size() > 0){
           JOptionPane.showMessageDialog(null,"Señor/a " + nombreCliente + "Su Garantia esta Aprobada");
        }else{
           JOptionPane.showMessageDialog(null,"Señor/a " + nombreCliente + "Su Garantia No esta Aprobada");
        }
    }
}
