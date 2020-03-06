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
Realizar un programa en Java que solicite al usuario 2 numeros enteros e 
indique si son o no iguales
 */
public class Ej2 {

    public static void main(String[] args) {

        float numero1;
        float numero2;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero:");
        numero1 = teclado.nextFloat();

     
        System.out.println("Introduce otro numero:");
        numero2 = teclado.nextFloat();

        if (numero1 == numero2) {
            System.out.printf("los numeros son iguales \n");
        } else {
            System.out.printf("Los numeros no son iguales \n");
        }
    }
}
