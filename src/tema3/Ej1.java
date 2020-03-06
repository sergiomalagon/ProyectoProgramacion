/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
/*
Realiza un programa en Java que solicite al usuario un numero e indique si es 
par o impar
*/
public class Ej1 {
    public static void main(String[] args) {
        
        
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
        numero = teclado.nextInt();
        
    if ( (numero % 2) == 0 )
        {
            System.out.println("el numero es par \n" );
        }
        else
        {
            System.out.println("el numero es impar \n" );
        }
    
    }
}
