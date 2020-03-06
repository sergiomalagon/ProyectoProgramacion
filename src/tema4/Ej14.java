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
Se desea implementar una aplicación que pida al usuario que introduzca un número
comprendido entre 1 y 10. Debemos mostrar la tabla de multiplicar de dicho número. El programa
debe comprobar la entrada del usuario.
 */
public class Ej14 {

    public static void main(String[] args) {
        int contador, numero, numero2;
        String s1;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero comprendido entre 1 y 10");
            s1 = teclado.next();
        } while (!s1.matches("[1-9]{1}"));

        numero = Integer.parseInt(s1);
        contador = 0;

        while (contador < 10) {
            contador++;
            numero2 = numero * contador;
            System.out.println(numero + "*" + contador + "=" + numero2);

        }

    }
}
