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
        int año1, año2, contador = 0;
        Scanner teclado;
        teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce el año1");
            año1 = teclado.nextInt();
        } while (año1 < 0);
        do {
            System.out.println("Introduce el año2");
            año2 = teclado.nextInt();
        } while (año2 > 9999);

        while (año1 != año2) {
            if ((año1 % 4 == 0) && ((año1 % 100 != 0) || (año1 % 400 == 0))) {
                contador++;
            }
            año1++;
        }
        System.out.println("El numero de años bisiestos son: " + contador);
    }
}
//
