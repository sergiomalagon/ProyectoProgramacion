/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Solicitar al usuario cuantos numeros desea introducir, a continuacion se 
introducira por teclado esa cantidad de numero por teclado y los mostraremos
en orden inverso a los introducidos
 */
public class Ej2_mostrar_array_inverso {

    public static void main(String[] args) {
        int i;
        int[] numeros;
        Scanner t = new Scanner(System.in);

        //introducimos el numero maximo del array
        System.out.println("Introduce el cantidad de numeros que vas a introducir");
        i = t.nextInt();
        numeros = new int[i];

        //pedimos los numeros
        for (int a = 0; a < numeros.length; a++) {
            System.out.println("Introduce los numeros");
            numeros[a] = t.nextInt();
        }
        //mostramos los numeros en orden inverso a como fueron introducidos
        for (int a = numeros.length - 1; a >= 0; a--) {
            System.out.println(numeros[a]);
        }
    }
}
