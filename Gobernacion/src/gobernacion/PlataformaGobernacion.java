/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gobernacion;

import Modelos.Carro;
import Modelos.Contribuyente;
import Modelos.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class PlataformaGobernacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Sección Gobernación
        ArrayList<Contribuyente> listadoContribuyentes;
        listadoContribuyentes = new ArrayList<>();
        
        Vehiculo coche1 = new Carro("carro normal","servicio publico",4,"345-rty","azul",6,2019,900000);
        Vehiculo coche2 = new Carro("camioneta","turismo",4,"456-yui","azul",8,2030,9000000);
        
        Contribuyente  contribuyente1 = new Contribuyente("Luis",234,"luis2@gmail.com",312);
        Contribuyente  contribuyente2 = new Contribuyente("Carlos",345,"car2@gmail.com",314);
        Contribuyente  contribuyente3 = new Contribuyente("Luisa",355,"luisaSS2@gmail.com",315);
        
        listadoContribuyentes.add(contribuyente3);
        listadoContribuyentes.add(contribuyente2);
        listadoContribuyentes.add(contribuyente1);
        
        //Declaración de Variables
        int opcion=0;
        System.out.println("\t\t\t" + "Bienvenidos a la Plataforma de Impuesro de Rodamiento de la Gobernación de Caldas");
        System.out.println("\n");
        System.out.println("\tEstos son nuestros servicios");
        System.out.println("\n");
        System.out.println("1." + "\n" + "2." + "\n");
        
    }
    
}
