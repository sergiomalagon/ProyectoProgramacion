/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

//import java.util.Scanner;
import utilidades.Teclado;

/**
 *
 * @author sergi
 */
public class Ej1 {

    public static void main(String[] args) {
        String palabra1, palabra2;

        System.out.println("Introduce una palabra");
        palabra1 = Teclado.tecladoString();
        System.out.println("Introduce otra palabra");
        palabra2 = Teclado.tecladoString();

        if (palabra1.length() > palabra2.length()) {
            System.out.println("La palabra mas corta es " + palabra2);
        } else {
            System.out.println("La palabra mas corta es " + palabra1);

        }

    }
}
