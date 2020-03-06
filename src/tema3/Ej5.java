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
Realiar un programa en Java que pida por teclado un numero decimal e indique
si es un numero casi-cero, que son aquellos positivos o negativos, que se 
acercan por menos de 1 unidad. Ejem. 0.3, -0.99...
*/
public class Ej5 {
    public static void main(String[] args) {

        float numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero decimal:");
        numero = teclado.nextFloat();


        if (numero > -1 && numero < 0) {
            System.out.printf("Es un numero casi-cero \n");

        } 
        else if (numero < 1 && numero > 0){
            System.out.printf("Es un numero casi-cero \n");
        }
        else{
            
            System.out.println("No es un numero casi-cero \n");
        }
    }
}
