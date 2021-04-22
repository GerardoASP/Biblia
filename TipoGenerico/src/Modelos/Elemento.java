
package Modelos;

public class Elemento<T> {
    //Atributos de la clase
    private T dato;
    //Constructor por defecto
    public Elemento(){
        
    }
    //Series de Getters And Setters
    public void setDato(T t){
        this.dato = t;
    }
    
    public T getDato(){
        return this.dato;
    }
}
