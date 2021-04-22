package universidad.gerardo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Departamento {
    //Atributos de la clase
    public String nombre;
    public String grupoInvestigacion;
    private long codigo;
    public ArrayList<Profesor> listadoProfesores;
    
    //Constructor Por Defecto
    public Departamento(){
        listadoProfesores = new ArrayList<>();
    }
    //Constructor Parametrizado
    public Departamento(String nombre,String grupoInvestigacion,long codigo){
        this.nombre = nombre;
        this.grupoInvestigacion = grupoInvestigacion;
        this.codigo =  codigo;
        listadoProfesores = new ArrayList<>();
    }
    
    //Serie de getters and setters
    public long getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    
    //Metodos de la clase
    public void agregarProfesor(String nombre, long CI, String direccion,String titulo){
        Profesor nuevo = new Profesor(nombre, CI, direccion, titulo);
        listadoProfesores.add(nuevo);
    }
    public Profesor buscarProfesor(String correo) {
        for (Profesor listadoProfesore : listadoProfesores) {
            if (listadoProfesore != null && listadoProfesore.nombre.equals(nombre)) {
                return listadoProfesore;
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro Profesor");
        return null;
    }
    
    public String listarProfesores(){
        String resultado = "";
        for (Profesor p: listadoProfesores) {
            if (p != null) {
                resultado += p+"\n";
            }
        }
        return resultado;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+", Grupo Investigacion"+this.grupoInvestigacion;
    }
}
 