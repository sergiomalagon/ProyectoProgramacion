/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.*;
import java.lang.*;

/**
 *
 * @author Vespertino
 */
/*
Implementar un programa que inicialice un array con nuestros números favoritos. A
continuación, pedir al usuario el índice de un elemento que sera eliminado de la tabla.
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que
no existan más elementos que borrar. Es imprescindible controlar que el índice corresponde a
un dato válido. Mostraremos los números que no han sido borrados al final.
 */
public class Ej4_eliminar_elemento_array {

    public static int[] eliminarElementoArray(int[] numeros, int index) {

        // If the array is empty 
        // or the index is not in array range 
        // return the original array 
        if (numeros == null
                || index < 0
                || index >= numeros.length) {

            return numeros;
        }

        // Create another array of size one less 
        int[] anotherArray = new int[numeros.length - 1];

        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < numeros.length; i++) {

            // if the index is 
            // the removal element index 
            if (i == index) {
                continue;
            }

            // if the index is not 
            // the removal element index 
            anotherArray[k++] = numeros[i];
        }

        // return the resultant array 
        return anotherArray;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int index;
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numeros));
        do {
            System.out.println("Introduce el index que quieres que sea eliminado");
            index = t.nextInt();
            if ((numeros.length == 0) || (index < 0)) {
                System.out.println(Arrays.toString(numeros));
                System.out.println("FIN");
                return;
            } else {
                numeros = eliminarElementoArray(numeros, index);
                System.out.println("Numero eliminado");
            }

        } while (true);
    }
}
