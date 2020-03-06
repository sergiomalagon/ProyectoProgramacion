/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Escribir un programa para aprender a contar de forma que se perdira al usuario
un numero n y se mostrara por pantall los numeros del 1 al n (con las 3 estructuras)
 */
public class Ej2 {
    public static void main(String[] args) {
        int numero;
        int contador=1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor introduzca numero:");
        numero = teclado.nextInt();
        
        while(contador<=numero){
            System.out.println(contador);
            contador++;
        }
    }
}
