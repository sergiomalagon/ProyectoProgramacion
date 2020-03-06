/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import utilidades.Teclado;

/**
 *
 * @author Vespertino
 */
public class Ej3_media_array {

    public static void main(String[] args) {
        int contadorn = 0, contadorp = 0, contadorc = 0;
        int n, negativos = 0, positivos = 0;
        int[] numeros;
        System.out.println("Introduce un numero maximo");
        n = Teclado.pedirInt();
        numeros = new int[n];
        for (int a = 0; a < numeros.length; a++) {
            System.out.println("Introduce los numeros");
            numeros[a] = Teclado.pedirInt();
            if (numeros[a] < 1) {
                negativos += numeros[a];
                contadorn++;
            }
            if (numeros[a] > 1) {
                positivos += numeros[a];
                contadorp++;
            }

            if (numeros[a] == 0) {
                contadorc++;
            }
        }
        System.out.println("la media de los negativos es de: " + negativos / contadorn);
        System.out.println("la media de los positivos es de: " + positivos / contadorp);
        System.out.println("el numero de los ceros es de: " + contadorc);
    }
}
