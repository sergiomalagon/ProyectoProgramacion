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
Escribir un programa en java que solicite un numero minimo y maximo de un rango
a continucacion solicitara por teclado un numero si ese numero es incorrecto se
lo volveremos a solicitar junto con un mensaje de advertencia el programa acaba
cuando introduzca un valor correcto
 */
public class Ej3 {

    public static void main(String[] args) {
        int minimo, maximo, numero;
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Introduce un numero minimo y un numero maximo ");
        minimo = teclado.nextInt();
        maximo = teclado.nextInt();

        while (minimo > maximo) {
            System.out.println("Error, el primer numero tiene que ser mas pequeño que el segundo\n");
            System.out.println("Introduce un numero minimo y un numero maximo");
            minimo = teclado.nextInt();
            maximo = teclado.nextInt();
        }

        System.out.println("Introduce un numero dentro tu rango");
        numero = teclado.nextInt();

        while (numero < minimo || numero > maximo) {
            System.out.println("Error, tienes que introducir un numero dentro del rango " + (minimo) + " y " + (maximo) + "\n");
            System.out.println("Introduce un numero dentro tu rango\n");
            numero = teclado.nextInt();
        }
        System.out.println("Correcto");

    }
}
