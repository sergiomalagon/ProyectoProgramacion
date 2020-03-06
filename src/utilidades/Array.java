/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Arrays;

/**
 *
 * @author Vespertino
 */
public class Array {

    public static void muestraArrayEnOrdenDouble(double[] numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

    public static void muestraArrayEnOrdenInt(int[] numero) {
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }

    public static void muestraArrayInversoInt(int[] numero) {
        for (int a = numero.length - 1; a >= 0; a--) {
            System.out.println(numero[a]);
        }
    }

    public static void muestraArrayInversoDouble(double[] numero) {
        for (int a = numero.length - 1; a >= 0; a--) {
            System.out.println(numero[a]);
        }
    }

    public static void eliminarElementoArray(int[] array, int index) {
        int i;
        int[] aux = new int[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] == index) {
                for (int j = i; j < array.length-j; j++) {
                    array[j] = array[j + 1];
                    aux = Arrays.copyOf(array, array.length - 1);
                }
                break;
            }
        }
        for (i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
    }

    public static void copiarArrayPar(int[] array, int n) {
        int[] par;
        int[] impar;
        int[] parAux = new int[n];
        int[] imparAux = new int[n];
        int contPares = 0, contImpares = 0;

        for (int i : array) {
            if (Numeros.parOImpar(i)) {
                parAux[contPares] = i;
                contPares++;
            } else {
                imparAux[contImpares] = i;
                contImpares++;
            }
        }
        impar = Arrays.copyOf(imparAux, n - contPares);
        par = Arrays.copyOf(parAux, n - contImpares);
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(impar));
    }

   
}
