/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Ej3_3 {

    public static void main(String[] args) {
        String palabras;
        Scanner teclado = new Scanner(System.in);

        for(palabras = "null" ;!"FIN".equalsIgnoreCase(palabras);) {

            System.out.println("Introduce una frase");
            palabras = teclado.nextLine();
            if ("FIN".equalsIgnoreCase(palabras)) {

                return;
            }
            for (int i = 0; i < palabras.length(); i++) {
                System.out.print(palabras.charAt(i) + " ");

            }
            System.out.println("");
        }

    }
}
