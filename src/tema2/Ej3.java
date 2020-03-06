/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Pida la edad de una persona y muestre la edad que tendras el año que viene
 */
public class Ej3 {

    public static void main(String[] args) {
        byte edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor introduzca su edad:");
        edad = teclado.nextByte();
        System.out.println("Su edad el año que viene sera:" + (edad + 1));
    }
}
