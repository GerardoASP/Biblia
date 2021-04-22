
package tipogenerico;

import Modelos.Elemento;
import java.util.Scanner;

public class TipoGenerico {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Elemento <Double> el = new Elemento<>();
        el.setDato(123.12312);
        System.out.println(el.getDato());
    }
    
}
