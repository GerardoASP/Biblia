package Modelos;

public class Persona {
    //Atributos de la Clase
    public String nombre;
    protected long numDocumento;
    protected String tipoDocumento;
    public String nacionalidad;
    protected String domicilio;
    
    //Constructor Por Defecto
    public Persona(){
        
    }
    //Constructor Parametrizado
    public Persona(long numDocumento,String tipoDocumento,String nacionalidad,String domicilio,String nombre){
        this.nombre = nombre;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
    }
    
    public Persona(String nombre,String tipoDocumento,long numDocumento){
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
    }
    
}
