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
Realizar un programa que pida al usuario un numero y muestre por pantalla si
el numero es par, positivo y su cuadrado. el proceso se repetira hasta que el numero
introducido por teclado sea 0
 */
public class Ej6 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

//        int cuadrado = (int) Math.pow(numero, 2);

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("PAR: SI ");
            } else {
                System.out.println("PAR: NO");
            }

            if (numero > 0) {
                System.out.println("POSITIVO: SI");
            } else {
                System.out.println("POSITIVO: NO");
            }
            int cuadrado = (int) Math.pow(numero, 2);
            System.out.println("CUADRADO:" + (cuadrado));

            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
//            numero = 0;
        }
        System.out.println("FIN");
    }
}
