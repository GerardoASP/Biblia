
package programaferreteria;

import Modelos.Cliente;
import Modelos.Ferreteria;
import Modelos.Producto;
import Modelos.Sucursal;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaFerreteria {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Declaración de Variables
        int opcion=0;
        //Seccion Ferreteria
        ArrayList<Producto> listadoProductos;
        listadoProductos = new ArrayList<>();
        ArrayList<Sucursal> listadoSucursales;
        listadoSucursales = new ArrayList<>();
        Ferreteria gasp = new Ferreteria("GASP", listadoSucursales, listadoProductos);
        //Seccion Sucursal
        gasp.llenarListaSucursales("Centro","Recepcion de Productos", listadoProductos);
        gasp.llenarListaSucursales("Villamaria","Despacho Productos", listadoProductos);
        //Seccion Productos
        gasp.llenarListaProductos("Teja Plastica Ondulada","luz","5-(345)",34000,100,0.19,"Luis Alberto");
        gasp.llenarListaProductos("Cables Electricos","Nexan","5-(670)",123000,50,0.19,"Daniel Huertas");
        gasp.llenarListaProductos("Martillo","Elite","5-(145)",20000,200,0.19,"Maria Rubiela");
        gasp.llenarListaProductos("Tubo PVC","Dias","5-(444)",10000,290,0.19,"Simon Orozco");
        System.out.println("\t\t\t" + "Bienvenidos a la Ferreteria GASP");
        System.out.println("\n");
        System.out.println("\tEstos son nuestros de Perfiles");
        System.out.println("\n");
        System.out.println("1.Ferreteria " + "\n" + "2.Sucursal " + "\n" + "3.Cliente " + "\n" + "4.Proveedor " + "\n" + "5.Vendedor " + "\n" + "6.Servicio Cliente " +"\n" +"7.Salir");
        System.out.println("Digite su opción: ");
        opcion = entrada.nextInt();
        mostrarOpcion(opcion,gasp);
    }
    
    public static void mostrarOpcion(int opcion,Ferreteria objeto){
        switch(opcion){
            case 1:
                Scanner entrada = new Scanner(System.in);
                int opc1 = 0;
                mensajesOpcion1();
                System.out.println("Digite su opción: ");
                opc1 = entrada.nextInt();
                mostrarMetodosopc1(opc1,objeto);
            break;
                
            case 2:
                Scanner entrada2 = new Scanner(System.in);
                int opc2 = 0;
                String address;
                String logistics;
                ArrayList<Cliente> listaClientes;
                listaClientes = new ArrayList<>();
                ArrayList<Producto> listaProductosS;
                listaProductosS = new ArrayList<>();
                mensajesOpcion2();
                System.out.println("Digite la direccion y el tipo de logistica de la sucursal");
                Sucursal sucursalGasp = new Sucursal(address=entrada2.next(),logistics = entrada2.next(), listaProductosS, listaClientes);
                System.out.println("Ahora digite el numero del servicio que desea");
                opc2 = entrada2.nextInt();
                mostrarMetodosopc2(opc2, sucursalGasp);
            break;
                
            case 3:
               Scanner entrada3 = new Scanner(System.in);
               int opc3 = 0;
               String nombreUser;
               String tipoDocumentoU;
               long numDocumentoU;
               mensajesOpcion3();
               System.out.println("Digite su nombre: ");
               System.out.println("Digite su tipo de documento: ");
               System.out.println("Digite su numero de Documento: ");
               Cliente clienteGasp = new Cliente(nombreUser=entrada3.next(), tipoDocumentoU=entrada3.next(), numDocumentoU=entrada3.nextLong());
               System.out.println("Ahora digite el numero del servicio que desea");
               opc3 = entrada3.nextInt();
            break;    
        }
    }
    
    public static void mensajesOpcion1(){
        System.out.println("La opción escogida fue la 1");
        System.out.println("Bienvenido al Perfil de Ferreteria");
        System.out.println("Tenemos los siguientes servicios");
        System.out.println("1.Trasladar Mercancia " + "\n" + "2.Surtir Sucursales " + "\n" + "3.Asesorar Proyectos " + "\n" + "4.Atender Ventas " + "\n" + "5.Alquilar Herramientas ");
        System.out.println("6.Registrar sucursales " + "\n" + "7.Registrar Productos" + "\n" + "8.Mostrar lista de Sucursales "+ "\n" + "9.Mostrar lista de Productos");
    }
    
    public static void mensajesOpcion2(){
        System.out.println("La opción escogida fue la 2");
        System.out.println("Bienvenido al Perfil de Sucursal");
        System.out.println("Tenemos los siguientes servicios");
        System.out.println("1.Controlar Inventario" + "\n" + "2.Generar Informe Principal" + "\n" + "3.Atender Ventas" + "\n");
    }
    
    public static void mensajesOpcion3(){
        System.out.println("La opción escogida fue la 3");
        System.out.println("Bienvenido al Perfil de Cliente");
        System.out.println("Tenemos los siguientes servicios");
        System.out.println("1.Controlar Inventario" + "\n" + "2.Generar Informe Principal" + "\n" + "3.Atender Ventas" + "\n");
    }
    
    public static void mostrarMetodosopc1(int opc1,Ferreteria objeto){
        switch(opc1){
            case 1:
                objeto.trasladarMercancia();
             break;
                
            case 2:
                Scanner entradaS= new Scanner(System.in);
                String direccionSS;
                System.out.println("Digite la localizacion de la sucursal");
                int posSucursal= objeto.buscarSucursal(direccionSS = entradaS.next());
                if(posSucursal != 0){
                    ArrayList<Producto> productoAtransferir;
                    productoAtransferir = new ArrayList<>();
                    
                }else{
                    System.out.println("No se encuentra la sucursal digitada");
                }
            break;
                
            case 3:
                String tipoProyect;
                int altura;
                int ancho;
                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite el tipo del proyecto ");
                System.out.println("Digite la altura en metros");
                System.out.println("Digite el ancho en metros");
                objeto.asesorarProyectos(tipoProyect = entrada.next(),altura = entrada.nextInt(),ancho = entrada.nextInt());  
            break;
                
            case 4:
                
            break;
                
            case 5:
                
            break;
                
            case 6:
                ArrayList<Producto> listadoAentregar;
                listadoAentregar = new ArrayList<>();
                String direccionS;
                String logisticaS;
                Scanner entradaD= new Scanner(System.in);
                System.out.println("Digite la dirección de la sucursal ");
                System.out.println("Digite el tipo de logistica de la sucursal");
                Sucursal nuevaSucursal = new Sucursal(direccionS = entradaD.next(), logisticaS= entradaD.next(), listadoAentregar);
                objeto.llenarListaSucursales(direccionS, logisticaS, listadoAentregar);
            break;
                
            case 7:
               String nombreP;
               String marcaP;
               String codigoBarraP;
               int precioProducto;
               int inventarioProducto;
               double iva;
               String nombreProveedorP;
               Scanner entradaP= new Scanner(System.in);
               System.out.println("Digite el nombre del producto: " + "Digite la marca del producto: " + "Digite codigo de Barra del producto " + "Digite el precio del producto " + "Digite la cantidad del producto " + "Digite el nombre del Proveedor ");
               Producto nuevoProducto = new Producto(nombreP = entradaP.next(), marcaP = entradaP.next(), codigoBarraP=entradaP.next(), precioProducto=entradaP.nextInt(), inventarioProducto=entradaP.nextInt(),0.19, nombreProveedorP = entradaP.next());
               objeto.llenarListaProductos(nombreP, marcaP, codigoBarraP, precioProducto, inventarioProducto,0.19, nombreProveedorP);
            break;
                
            case 8:
                System.out.println("La lista de sucursales es: ");
                objeto.listarSucursales();
            break;
                
            case 9:
                System.out.println("La lista de productos es: ");
                objeto.listarProductos();
            break;    
        }
    }
    
    public static void mostrarMetodosopc2(int opc2,Sucursal objeto){
        switch(opc2){
            case 1:
                objeto.controlarInventario(objeto.listaProductosS);
            break;
            
            case 2:
               objeto.generarInformePrincipal(null, null, null);
            break;
                
            case 3:
               objeto.atenderVentas(objeto.getLogistica());
            break;    
        }
    }
    
    public static void mostrarMetodosopc3(int opc3,Cliente objeto){
        switch(opc3){
            case 1:
                
            break;    
        }
    }
    
}
