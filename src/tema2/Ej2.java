/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.Scanner;

/**
 *
 * psvm (Public static void main(String[] args)
 */

/*
Realizar una clase llamada Ej2, que pida un numero al usuario y
posteriormente lo muestre por pantalla con el texto "El numero que usted
introdujo fue:xxx"
 */
public class Ej2 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digame un numero:");
        numero = teclado.nextInt();
        System.out.println("El numero que usted introdujo fue:" + numero);

    }
}
