/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogenerico;

import Modelos.Driver;
import Modelos.GuerreroSentai;
import Modelos.KamenRider;
import java.util.Scanner;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class ProyectoGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Declaración de Variables
        int pos=0;
        int pos1 = 0;
        int pos2 = 0;
        
        Driver<GuerreroSentai> driver1 = new Driver<>();
        Driver<KamenRider> driver2 = new Driver<>();
        
        GuerreroSentai sentai1 = new GuerreroSentai("Geki Red","Kung fu","rojo",31);
        GuerreroSentai sentai2 = new GuerreroSentai("Geki Blue","Kung fu","azul",31);
        GuerreroSentai sentai3 = new GuerreroSentai("Gokai Silver","Piratas","plateado",35);
        GuerreroSentai sentai4 = new GuerreroSentai("Geki Yellow","Kung fu","azul",31);
        
        KamenRider rider2 = new KamenRider("gemn","video juegos","morado");
        KamenRider rider1 = new KamenRider("ex-aid","video juegos","rosado");
        KamenRider rider3 = new KamenRider("brave","video juegos","azul");
        KamenRider rider4 = new KamenRider("Gaim","Samurais","Naranja");
        
        driver1.agregar(sentai1);
        driver1.agregar(sentai2);
        driver1.agregar(sentai4);
        driver1.agregar(sentai3);
        
        driver2.agregar(rider2);
        driver2.agregar(rider1);
        driver2.agregar(rider4);
        driver2.agregar(rider3);
        
        System.out.println("La cantidad de Guerreros Sentai es: " + driver1.contarCantidadE());
        System.out.println("La cantidad de Kamen Rider es: " + driver2.contarCantidadE());
        
        System.out.println("El ultimo Guerrero Sentai es: " + driver1.obtenerUltimoE().toString());
        System.out.println("El ultimo Kamen Rider es: " + driver2.obtenerUltimoE().toString());
        
        System.out.println("Digite la posicion del Guerrero Sentai a buscar: ");
        pos = entrada.nextInt();
        System.out.println("El guerrero Sentai de la posicion " + pos + " Es: " + driver1.obtenerEPorPosicion(pos));
        
        System.out.println("Digite la posicion del Kamen Rider a buscar: ");
        pos = entrada.nextInt();
        System.out.println("El Kamen Rider de la posicion " + pos + " Es: " + driver2.obtenerEPorPosicion(pos));
        
        System.out.println("La lista de Guerreros Sentai es: ");
        driver1.mostrar();
        
        System.out.println("Digite las posiciones a intercambiar de la lista de guerros sentai ");
        pos1 = entrada.nextInt();
        pos2 = entrada.nextInt();
        driver1.intercambiarPosiciones(pos1, pos2);
        
        System.out.println("La nueva lista de Guerreros Sentai es: ");
        driver1.mostrar();
        
        System.out.println("Digite las posiciones a intercambiar de la lista de Kamen Riders ");
        pos1 = entrada.nextInt();
        pos2 = entrada.nextInt();
        driver2.intercambiarPosiciones(pos1, pos2);
        
        System.out.println("La nueva lista de Kamen Riders es: ");
        driver2.mostrar();
    }
    
}
