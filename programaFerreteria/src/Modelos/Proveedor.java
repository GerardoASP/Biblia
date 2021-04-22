package Modelos;

public class Proveedor extends Persona{
    //Atributos de la Clase
    public String nombreEmpresa;
    public String tipoEmpresa;
    public String tipoDistribucion;
    public int plazoPago;
    
    //Constructor Por Defecto
    public Proveedor(){
        
    }
    //Constructor Parametrizado
    public Proveedor(long numDocumento,String tipoDocumento,String nacionalidad,String domicilio,String nombreEmpresa,String tipoEmpresa,String tipoDistribucion,int plazoPago,String nombre){
        super(numDocumento,tipoDocumento,nacionalidad,domicilio,nombre);
        this.nombreEmpresa = nombreEmpresa;
        this.tipoEmpresa = tipoEmpresa;
        this.tipoDistribucion = tipoDistribucion;
        this.plazoPago = plazoPago;
    }
    
}
