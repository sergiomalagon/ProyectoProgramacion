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
Realizar una clase llamada Ej4, que pida al usuario el aÃ±o actual
y tambien el nacimiento del usuario.
Debe calcular la edad del usario supuniendo que ya a cumplido aÃ±os
 */
public class Ej4 {

    public static void main(String[] args) {
        short añonacimiento;
        short añoactual;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Por favor introduzca su aÃ±o de nacimiento:");
        añonacimiento = keyboard.nextShort();
        
        System.out.println("Por favor introduzca el aÃ±o actual:");
        añoactual = keyboard.nextShort();

        byte edad = (byte) (añoactual - añonacimiento);
        System.out.println("Tu edad es de " + (edad) + " aÃ±os");

    }
}
