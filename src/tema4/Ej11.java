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
Realizar un programa en java que contabilice la cantidad de años bisiestos
que hay entre 2 numero(año1 y año2) introducidos por el usuario.
 */
public class Ej11 {

    public static void main(String[] args) {
        int a�o1, a�o2, contador = 0;
        Scanner teclado;
        teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce el año1");
            a�o1 = teclado.nextInt();
        } while (a�o1 < 0);
        do {
            System.out.println("Introduce el año2");
            a�o2 = teclado.nextInt();
        } while (a�o2 > 9999);

        while (a�o1 != a�o2) {
            if ((a�o1 % 4 == 0) && ((a�o1 % 100 != 0) || (a�o1 % 400 == 0))) {
                contador++;
            }
            a�o1++;
        }
        System.out.println("El numero de años bisiestos son: " + contador);
    }
}
//
