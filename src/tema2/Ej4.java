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
Realizar una clase llamada Ej4, que pida al usuario el año actual
y tambien el nacimiento del usuario.
Debe calcular la edad del usario supuniendo que ya a cumplido años
 */
public class Ej4 {

    public static void main(String[] args) {
        short a�onacimiento;
        short a�oactual;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Por favor introduzca su año de nacimiento:");
        a�onacimiento = keyboard.nextShort();
        
        System.out.println("Por favor introduzca el año actual:");
        a�oactual = keyboard.nextShort();

        byte edad = (byte) (a�oactual - a�onacimiento);
        System.out.println("Tu edad es de " + (edad) + " años");

    }
}
