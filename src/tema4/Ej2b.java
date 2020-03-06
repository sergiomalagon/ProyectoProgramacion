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
public class Ej2b {

    public static void main(String[] args) {
        int numero = 0;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor introduzca numero:");
        numero = teclado.nextInt();

        do {

            System.out.println(contador);
            contador = (byte) (contador + 1);

        } while (contador <= numero);

    }

}
