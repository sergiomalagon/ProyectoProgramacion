/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;
import java.util.Stack;
/**
 *
 * @author Vespertino
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numero=34;
        Stack pila = new Stack();
        
        pila.push(10);
        pila.push(13);
        System.out.println("Esta vacio: " + pila.empty());
        System.out.println("Ultimo elemento: " + pila.peek());
        pila.pop();
        System.out.println("Exite el numero "+numero +"?: "+ + pila.search(34));
    }
    
}
