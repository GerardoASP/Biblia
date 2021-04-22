/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class Driver <T>{
    //Atributos de la Clase
    private ArrayList<T> listadoRiders;
    
    public Driver(){
        listadoRiders = new ArrayList<>();
    }
    
    //Serie de Getters And Setters

    public ArrayList<T> getListadoRiders() {
        return listadoRiders;
    }

    public void setListadoRiders(ArrayList<T> listadoRiders) {
        this.listadoRiders = listadoRiders;
    }
    
    //Metodos de la Clase
    public void agregar(T elemento){
        listadoRiders.add(elemento);
    }
    
    public void mostrar(){
        for (T r : listadoRiders) {
            System.out.println(r);
        }
    }
    
    public boolean buscar(T elemento){
        for (T r1 : listadoRiders) {
            if(r1.equals(elemento)){
                return true;
            }
        }
        return false;
    }
    
    public int contarCantidadE(){
        int contRespuesta = 0;
        for (T r1 : listadoRiders) {
            contRespuesta++;
        }
        return contRespuesta;
    }
    
    public T obtenerUltimoE(){
        T aux = null;
        for (T r1 : listadoRiders) {
            aux = r1;
        }
        return aux;
    }
    
    public T obtenerEPorPosicion(int pos){
        T aux = null;
        int contAux = 0;
        for (T r1 : listadoRiders) {
            if(contAux == pos){
                aux = r1;
            }
            contAux++;
        }
        return aux;
    }
    
    public void intercambiarPosiciones(int pos1,int pos2){
        Collections.swap(listadoRiders, pos1, pos2);
    }
}
