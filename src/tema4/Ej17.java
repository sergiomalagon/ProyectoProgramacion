/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ej17 {

    public static void main(String[] args) {
        int arbol = 0, aux = 0, codigo = 1, codigomaximo = 0;
        String s1;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce la altura del arbol en centimetros");
            s1 = teclado.next();
            if (s1.matches("\\d+")) {
                arbol = Integer.parseInt(s1);
                if (arbol > aux) {
                    codigomaximo = codigo;
                    aux = arbol;
                }
                codigo++;

            }

        } while (!s1.matches("-1"));

        if (aux == 0) {
            System.out.println("No se han introducido numero validos");
        } else {
            System.out.println("El arbol mas alto tiene el codigo " + codigomaximo + " y una altura de " + aux + " cm ");
        }

    }

}
