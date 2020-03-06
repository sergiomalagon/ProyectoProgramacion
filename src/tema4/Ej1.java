/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Vespertino
 */

/*
Realizar un programa en java que muestre por pantall los numeros del 0 al 9 
inclusive lo haremos con las 3 estructuras explicadas en clase
*/
public class Ej1 {
    public static void main(String[] args) {
        byte numero=0;
        
        while(numero<10){
            System.out.println(numero);
            numero=(byte)(numero+1);
        }
    }
}