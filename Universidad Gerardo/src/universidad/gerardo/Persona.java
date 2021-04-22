/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.gerardo;

/**
 *
 * @author simon
 */
public class Persona {
    public String nombre;
    public long CI;
    private String direccion;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, long CI, String direccion){
        this.nombre = nombre;
        this.CI = CI;
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
}
