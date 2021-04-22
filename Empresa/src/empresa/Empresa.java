/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import Modelos.Cliente;
import Modelos.Empleado;
import Modelos.JefeZona;
import Modelos.Secretario;
import Modelos.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado jefe1 = new JefeZona("Piso 4", null, null, null,"Luis","Vega",234,"villa",880,230000,"Jefe");
        Empleado secretario1 = new Secretario("Oscar","zuluaga ortiz",235,"centro",5,882,100000,"secretario",null,"piso 1",2);
        Empleado secretario2 = new Secretario("Gustavo","zuluaga ortiz",235,"cable",5,882,100000,"secretario",null,"piso 1",2);
        Empleado vendedor1 = new Vendedor(null,313,"celulares", (float) 0.30,"Jin","Katana",251,"centro",10,881,150000,"vendedor", secretario1, true);
        Empleado vendedor2 = new Vendedor(null,313,"Computadores", (float) 0.30,"Horobi","Katana",251,"centro",10,881,155000,"vendedor", secretario1, true);
        ArrayList<Empleado> listadoEmpresa = new ArrayList<>();
        listadoEmpresa.add(jefe1);
        listadoEmpresa.add(secretario1);
        listadoEmpresa.add(secretario2);
        listadoEmpresa.add(vendedor1);
        listadoEmpresa.add(vendedor2);
        Scanner entrada = new Scanner(System.in);
        //Declaración de Variables
        int opcion=0;
        System.out.println("\t\t\t" + "Bienvenidos a la Empresa de Ventas GASP");
        System.out.println("\n");
        System.out.println("\tEstos son nuestros de Perfiles");
        System.out.println("\n");
        System.out.println("1.Imprimir Datos " + "\n" + "2.Cambiar Supervisor " + "\n" + "3.Incrementar Salario " + "\n" + "4.Dar de Alta Cliente " + "\n" + "5.Dar de Baja Cliente " + "\n" + "6.Cambiar Coche " +"\n" +"7.Cambiar Secretario " + "\n" + "8.Dar Alta Vendedor " + "\n"  + "9.Dar Baja Vendedor " + "\n" + "10.Cantidad de Cada Sector " + "\n" + "11.Listar Vendedores del Jefe de la Zona ");
        System.out.println("Digite su opción: ");
        opcion = entrada.nextInt();
        mostrarOpcion(opcion, listadoEmpresa);
    }
    
    public static void mostrarOpcion(int opcion,ArrayList<Empleado> listadoEmpresa){
        switch(opcion){
            case 1:
                System.out.println("Escogio la opción 1");
                Scanner entrada2 = new Scanner(System.in);
                String nombreEmpleado;
                System.out.println("Digite el nombre del Empleado");
                nombreEmpleado = entrada2.next();
                String resultado = mostrarOpc1(nombreEmpleado, listadoEmpresa);
                System.out.println("Los Datos del Empleado son: ");
                System.out.println(resultado);
            break;
                
            case 2:
                System.out.println("Escogio la opción 2");
                Scanner entrada3 = new Scanner(System.in);
                String nombreEmpleado2;
                System.out.println("Digite el nombre del Empleado");
                nombreEmpleado2 = entrada3.next();
                mostrarOpc2(nombreEmpleado2,listadoEmpresa);
            break;
                
            case 3:
                System.out.println("Escogio la opción 3");
                Scanner entrada4 = new Scanner(System.in);
                String nombreEmpleado3;
                System.out.println("Digite el nombre del Empleado");
                nombreEmpleado3 = entrada4.next();
                mostrarOpc3(nombreEmpleado3,listadoEmpresa);
            break;
                
            case 4:
                System.out.println("Escogio la opción 4");
                Scanner entrada5 = new Scanner(System.in);
                String nombreEmpleado4;
                System.out.println("Digite el nombre del Vendedor");
                nombreEmpleado4 = entrada5.next();
            break;
                
            case 5:
                
            break;
                
            case 6:
                
            break;
                
            case 7:
                
            break;
                
            case 8:
                
            break;
                
            case 9:
                
            break;
                
            case 10:
                
            break;
                
            case 11:
                int contJefes=0;
                int contSecretarios=0;
                int contVendedores=0;
                System.out.println("Escogio la opción 11");
                for (Empleado e : listadoEmpresa) {
                    if(e instanceof JefeZona){
                        contJefes++;
                    }
                    if(e instanceof Secretario){
                        contSecretarios++;
                    } 
                    if(e instanceof Vendedor){
                        contVendedores++;
                    }
                }
                System.out.println("Cantidad de Jefes: "+contJefes);
                System.out.println("Cantidad de Secretarios: "+contSecretarios);
                System.out.println("Cantidad de Vendedores: "+contVendedores);
            break;
                
            default:
                System.out.println("Opcion Invalida");
            break;    
        }
    }
    
    public static String mostrarOpc1(String nombre,ArrayList<Empleado> listadoEmpresa){
        for (Empleado e : listadoEmpresa) {
            if (e != null && e.getNombre().equals(nombre)) {
                return e.imprimir();
            }
        }
        JOptionPane.showMessageDialog(null,"No se encontro empleado");
        return null;
    }
    
    public static String mostrarOpc2(String nombre,ArrayList<Empleado> listadoEmpresa){
        for (Empleado e : listadoEmpresa) {
            if (e != null && e.getNombre().equals(nombre)) {
                System.out.println("Empleado Encontrado");
                Scanner entradaEspecial = new Scanner(System.in);
                System.out.println("Digite los datos del supervisor: ");
                System.out.println("Nombre-Apellidos-Documento-Direccion-Tiempo en la Empresa-Telefono Contacto-salario-puesto");
                String nombreSupervisor;
                String apellidos;
                long documento;
                String direccion;
                int tiempoEmpresa; //Años de Antiguedad
                long telefonoContacto;
                int salario;
                String puesto;
                Empleado paraAsignar = new Empleado(nombreSupervisor = entradaEspecial.next(),apellidos = entradaEspecial.next(), 
                documento= entradaEspecial.nextLong(), direccion=entradaEspecial.next(), tiempoEmpresa=entradaEspecial.nextInt(), telefonoContacto=entradaEspecial.nextLong(), salario = entradaEspecial.nextInt(), 
                puesto=entradaEspecial.next(),null);
                e.setSupervisor(paraAsignar);
            }
        }
        JOptionPane.showMessageDialog(null,"Proceso Finalizado");
        return null;
    }
    
    public static void mostrarOpc3(String nombre,ArrayList<Empleado> listadoEmpresa){
        for (Empleado e : listadoEmpresa) {
            if (e != null && e.getNombre().equals(nombre)) {
                System.out.println("Empleado Encontrado");
                System.out.println("Saldo Anterior: " + e.getSalario());
                e.incrementarSalario();
                System.out.println("Saldo Actual: " + e.getSalario());
            }
        }
        JOptionPane.showMessageDialog(null,"Proceso Finalizado");
    }
    
    public static void mostrarOpc4(String nombre,ArrayList<Empleado> listadoEmpresa){
        Empleado aux = new Vendedor();
        for (Empleado e : listadoEmpresa) {
            if (e != null && e.getNombre().equals(nombre)) {
                System.out.println("Empleado Encontrado");
                if(e instanceof Vendedor){
                    Vendedor auxiliar = (Vendedor)e;
                    ArrayList<Cliente> listaAuxiliarC = new ArrayList<>();
                    //listaAuxiliarC = auxiliar.get;
                    Scanner entradaEspecial2 = new Scanner(System.in);
                    System.out.println("Digite el nombre del Cliente: ");
                    String nameClient;
                    nameClient = entradaEspecial2.next();
            
                    for (Cliente cl : listaAuxiliarC) {
                        if (cl != null && cl.getNombre().equals(nombre)) {
                            System.out.println("Cliente Encontrado");
                            System.out.println("Estado Anterior del Cliente: " + cl.getEstadoCliente());
                            cl.setEstadoCliente(true);
                            System.out.println("Estado Actual : " + cl.getEstadoCliente());
                            System.out.println("Por lo tanto el cliente ha sido dado de alta");
                        }
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,"Proceso Finalizado");
    }
}
