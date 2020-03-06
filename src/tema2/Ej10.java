/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej10 {

    public static void main(String[] args) {
        // Zona de declaracion de variables
        byte a, b, c;
        float ecuacionX, ecuacionX2;
        Scanner teclado = new Scanner(System.in);

        // Pedir datos
        System.out.println("Introduce el valor de a: ");
        a = teclado.nextByte();
        System.out.println("Introduce el valor de b: ");
        b = teclado.nextByte();
        System.out.println("Introduce el valor de c: ");
        c = teclado.nextByte();

        // Calculos
        ecuacionX = (float) ((-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a));
        ecuacionX2 = (float) ((-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a));

        // Mostramos resultado por pantalla
        DecimalFormat formato1 = new DecimalFormat("0.00");
        System.out.println("El valor de la ecuacion es " + formato1.format(ecuacionX));
        System.out.print(" Y " + formato1.format(ecuacionX2));
    }
}
