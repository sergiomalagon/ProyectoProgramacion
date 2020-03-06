/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej3_2 {

    public static void main(String[] args) {
        String palabras = "null";
        Scanner teclado = new Scanner(System.in);

//        System.out.println("Introduce una frase");
//        palabras = teclado.nextLine();
        while (!"FIN".equalsIgnoreCase(palabras)) {
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
