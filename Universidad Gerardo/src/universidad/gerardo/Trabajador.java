
package universidad.gerardo;

public class Trabajador extends Persona{
    //Atributos de la clase
    public String fechaInicio;
    public int salario;
    
    //Constructor Por Defecto
    public Trabajador(){
        super();
    }
    
    //Constructor Parametrizado
    public Trabajador(String nombre, long CI, String direccion,String fechaInicio,int salario){
        super(nombre,CI,direccion);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+", Fecha de Entrada: "+this.fechaInicio+", Salario: "+this.salario;
    }
}
