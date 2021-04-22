/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.gerardo;

import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class Estudiante extends Persona{
    private long codigo;
    public float promedio;
    public String carrera;
    public ArrayList<Materia> materias;
    
    public Estudiante(){
        super();
        materias = new ArrayList<>();
    }
    
    public Estudiante(String nombre, long CI, String direccion, long codigo, float promedio, String carrera){
        super(nombre, CI, direccion);
        this.codigo = codigo;
        this.promedio = promedio;
        this.carrera = carrera;
        materias = new ArrayList<>();
    }
    
    public long getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    
    public float obtenerPromedio(){
        float suma = 0;
        for (Materia materia : materias) {
            suma += materia.nota; 
        }
        float promedio = suma / materias.size();
        return promedio;
    }
    
    public void agregarMateria(int codigo, String nombre, int creditos, float nota){
        Materia nueva = new Materia(codigo, nombre, creditos, nota);
        this.materias.add(nueva);
    }
    
    public void listarNombreMaterias(){
        //for (Materia materia : materias) {
            //System.out.println(""+materia.nombre);
       // }
        
        for (int i = 0; i < this.materias.size(); i++) {
            System.out.println(""+this.materias.get(i).nombre);
        }
    }
    
    public void listarMateriasPerdidas(){
        for (int i = 0; i < this.materias.size(); i++) {
            if(this.materias.get(i).nota < 3){
                System.out.println(""+this.materias.get(i));
            }
        }
    }
    @Override
    public String toString(){
        String retorno = "Nombre: "+this.nombre+", Codigo: "+this.codigo+", Carrera: "+this.carrera+", promedio: "+this.promedio + "Materias: ";
        for (int i = 0; i < this.materias.size(); i++) {
            retorno = retorno + " "+ materias.get(i);
        }
        return retorno;
    }
}
