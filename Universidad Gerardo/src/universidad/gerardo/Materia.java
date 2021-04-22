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
public class Materia {
    public int codigo;
    public String nombre;
    public int creditos;
    public float nota;

    public Materia() {
    }

    public Materia(int codigo, String nombre, int creditos, float nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
    }
    
    public Materia(int codigo,String nombre,int creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    @Override
    public String toString(){
        return "["+this.codigo+", "+this.nombre+", "+this.creditos+", "+this.nota+"]";
    }
    
    public String toStringg(){
        return "["+this.codigo+", "+this.nombre+", "+this.creditos+", ";
    }
}
