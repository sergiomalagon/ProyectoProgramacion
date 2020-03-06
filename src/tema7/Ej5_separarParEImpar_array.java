/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Arrays;
import utilidades.Teclado;
import utilidades.Array;

/**
 *
 * @author Vespertino
 */
/*
Pida al usuario n numeros enteros de un array, y a partir de ese array, se contruiran
dos nuevos arrays con los elementos pares e impares repectivamente.Mostrarlo 
por pantalla
Para recorrer lo usamos en nuevo for y lo mostramos con el toString
 */
public class Ej5_separarParEImpar_array {

    public static void main(String[] args) {
        int n;
        int[] numeros;
        //introducimos el numero maximo del array
        System.out.println("Introduce el cantidad de numeros que vas a introducir");
        n = Teclado.pedirInt();
        numeros = new int[n];

        //pedimos los numeros
        for (int a = 0; a < numeros.length; a++) {
            System.out.println("Introduce los numeros");
            numeros[a] = Teclado.pedirInt();
        }
        Array.copiarArrayPar(numeros, n);
    }
}
