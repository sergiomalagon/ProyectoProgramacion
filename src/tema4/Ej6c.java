/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ej6c {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

//        int cuadrado = (int) Math.pow(numero, 2);
        for (; numero != 0;) {
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
