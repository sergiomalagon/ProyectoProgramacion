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
Modidfica el ejercicio 2, para que muestre los numero separados por una coma
excepto el ultimo que se mostrara con un punto final(1,2,3,4 y 5.)
 */
public class Ej4 {

    public static void main(String[] args) {
        int numero = 0;
        int contador = 1;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Por favor introduzca numero:");
            numero = teclado.nextInt();
        } while (numero < 1);
        if (numero == 1) {
            System.out.println("1");
        } else {
            for (; contador < numero - 1; contador++) {
                System.out.print(contador + ",");
            }
            System.out.print(contador + " y " + numero + ".");
        }
    }
}
