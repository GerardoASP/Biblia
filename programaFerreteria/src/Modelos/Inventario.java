package Modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Inventario {
    //Atributos de la Clase
    protected ArrayList<Producto> listaProductos;
    protected ArrayList<Compra> listaCompras;
    
    //Constructor Por Defecto
    public Inventario(){
        this.listaProductos = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
    }
    
    //Metodos de la Clase
    protected void trasladarMercancia(){
        JOptionPane.showMessageDialog(null,"Trasladando mercancía");
    }
}
