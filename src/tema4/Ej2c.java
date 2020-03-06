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
public class Ej2c {

    public static void main(String[] args) {
        int numero;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor introduzca numero:");
        numero = teclado.nextInt();

        for (;contador <= numero; contador++) {
            System.out.println(contador);
        }
    }
}
