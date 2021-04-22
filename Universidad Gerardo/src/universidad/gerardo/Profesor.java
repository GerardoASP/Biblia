
package universidad.gerardo;

import java.util.ArrayList;

public class Profesor extends Persona{
    //Atributos de la clase
    public String titulo;
    public ArrayList<Materia> listadoMaterias;
    
    //Constructor Por Defecto
    public Profesor(){
        super();
        listadoMaterias = new ArrayList<>();
    }
    //Constructor Parametrizado
    public Profesor(String nombre, long CI, String direccion,String titulo){
        super(nombre,CI,direccion);
        this.titulo = titulo;
        listadoMaterias = new ArrayList<>();
    }
    
    //Metodos de la clase
    public void agregarMateriaProfesor(int codigo, String nombre, int creditos){
        Materia nueva = new Materia(codigo, nombre, creditos);
        this.listadoMaterias.add(nueva);
    }
    
    public void listarNombreMateriasP(){
        for (Materia listadoMateria : this.listadoMaterias) {
            System.out.println("" + listadoMateria.nombre);
        }
    }
    
    @Override
    public String toString(){
        String retorno = "Nombre: "+this.nombre +"Titulo: " + this.titulo+ "Materias: ";
        for (int i = 0; i < this.listadoMaterias.size(); i++) {
            retorno = retorno + " "+ listadoMaterias.get(i);
        }
        return retorno;
    }
}
