/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Realizar un programa en java que dado un numero b entero de entre 1 y 4 cifras(-9999,9999)
y dado un numero e entero (0,99). 
Calcule en un metodo de forma recursiva b^e
 */
public class Ej9 {

    public static int potencia(int b, int e) {
        int resultado;
        if (e == 0) {
            resultado = 1;

        } else {
            resultado = b * potencia(b, e - 1);
        }
        return resultado;
    }

    public static void main(String[] args) {

        int b, e;
        String s1, s2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero comprendido entre (-9999 y 9999)");
            s1 = teclado.next();
        } while (!s1.matches("^-?\\d{1,4}"));

        b = Integer.parseInt(s1);

        do {
            System.out.println("Introduce un numero comprendido entre (0 y 99)");
            s2 = teclado.next();
        } while (!s2.matches("\\d{1,2}"));

        e = Integer.parseInt(s2);
        int resultado = potencia(b, e);

        System.out.println("La potencia es: " + resultado);
    }
}
