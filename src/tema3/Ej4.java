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
Idem al 3 considerando el caso de que los numeros enteros puedan ser iguales
 */
public class Ej4 {

    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        numero1 = teclado.nextInt();
        System.out.println("Introduce otro numero:");
        numero2 = teclado.nextInt();

        if (numero1 == numero2) {
            System.out.printf("Ambos numeros son iguales \n");

        } else {
            if (numero1 > numero2) {
                System.out.printf(numero1 + " es mayor que " + numero2 + "\n");
            } else {
                System.out.printf(numero1 + " es menor que " + numero2 + "\n");
            }

        }

    }
}
