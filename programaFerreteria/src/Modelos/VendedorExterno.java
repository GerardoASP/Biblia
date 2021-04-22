package Modelos;

public class VendedorExterno extends Persona {
    //Atributos de la Clase
    public String tipoAtencion;
    
    //Constructor Por Defecto
    public VendedorExterno(){
        
    }
    //Constructor Parametrizado
    public VendedorExterno(long numDocumento,String tipoDocumento,String nacionalidad,String domicilio,String tipoAtencion,String nombre){
        super(numDocumento,tipoDocumento,nacionalidad,domicilio,nombre);
        this.tipoAtencion = tipoAtencion;
    }
}
