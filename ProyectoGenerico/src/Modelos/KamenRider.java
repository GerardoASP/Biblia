
package Modelos;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class KamenRider {
    //Atributos de la Clase
    public String nombre;
    public String tematica;
    public String color;
    
    //Constructor Por Defecto
    public KamenRider(){
        
    }
    //Constructor Parametrizado
    public KamenRider(String nombre, String tematica, String color) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.color = color;
    }
    
    //Serie de Getters And Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return " Nombre: " + this.nombre + " Tematica: " + this.tematica + " Color: " + this.color;
    }
}
