/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import utilidades.Teclado;

/**
 *
 * @author Vespertino
 */

/*
Diseñar una apkicacion en java que pida al usuario una frase e indique cuantos 
espacios tiene
 */
public class Ej4 {

    public static void main(String[] args) {
        String frase;
        int contador = 0;
        char espacio;
        System.out.println("Introduce una frase");
        frase = Teclado.tecladoString();
        for (int i = 0; i < frase.length(); i++) {
            espacio = frase.charAt(i);
            if (espacio == ' ') {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("Solo has introducido una palabra");
        } else {
            System.out.println("La frase tiene " + contador + " espacios.");

        }

    }
}
