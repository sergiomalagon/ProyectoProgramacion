/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Teclado {

    Scanner teclado = new Scanner(System.in, "ISO-8859-1");

    public static String tecladoString() {
        String string;
        Scanner teclado = new Scanner(System.in);
        string = teclado.next();
        return string;

    }

    public static StringBuilder tecladoStringBuilderNext() {
        StringBuilder string = new StringBuilder();
        Scanner teclado = new Scanner(System.in);
        string.append(teclado.next());
        return string;

    }

    public static StringBuilder tecladoStringBuilderNextLine() {
        StringBuilder string = new StringBuilder();
        Scanner teclado = new Scanner(System.in);
        string.append(teclado.nextLine());
        return string;

    }

    public static String tecladoStringNextLine() {
        String cadena;
        Scanner teclado = new Scanner(System.in);
        cadena = teclado.nextLine();
        return cadena;

    }

    public static int pedirIntNextLine() {
        int numero = 0;
        String aux;
        Scanner teclado = new Scanner(System.in);

        do {
            aux = teclado.nextLine();
            if (aux.matches("-?\\d{1,}")) {
                numero = Integer.parseInt(aux);
            } else {
                System.out.println("Error");
            }
        } while (!aux.matches("-?\\d{1,}"));

        return numero;
    }

    public static int pedirInt() {
        int numero = 0;
        String aux;
        Scanner teclado = new Scanner(System.in);
        do {

            aux = teclado.next();
            if (aux.matches("-?\\d{1,}")) {
                numero = Integer.parseInt(aux);
            } else {
                System.out.println("Error");
            }
        } while (!aux.matches("-?\\d{1,}"));

        return numero;
    }

}
