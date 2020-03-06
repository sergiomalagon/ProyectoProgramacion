/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import com.sun.org.apache.xpath.internal.operations.Variable;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Realiza un programa en Java que pida dos numeros enteros y los muestre por
pantalla ordenados de forma creciente ( se debe utilizar el operador ternario)
*/
public class Ej6 {
     public static void main(String[] args) {

        int numero1;
        int numero2;
        int resultado;
        int resultado2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        numero1 = teclado.nextInt();
        System.out.println("Introduce otro numero:");
        numero2 = teclado.nextInt();
        
        resultado=(numero1>numero2)? numero1: numero2;
        resultado2=(numero1<numero2)? numero1: numero2;

        
         System.out.println("\n");
        
        System.out.println(resultado + "\n");
        System.out.println(resultado2 + "\n");
         
    }
}
