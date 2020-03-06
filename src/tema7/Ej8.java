/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
/*
Lee 6 enteros , los ordene y los muestre.
Leeremos otros 6 enteros, los ordenamos y los mostramos(sort)
A continuacion(a mano), fusionar los dos arrays en un tercer vector de tamaño 12,
de forma que sigan ordenados
 */
public class Ej8 {

    public static int pedirInt() {
        int numero = 0;
        String aux;

        do {
            Scanner teclado = new Scanner(System.in);
            aux = teclado.nextLine();
            if (aux.matches("-?\\d{1,}")) {
                numero = Integer.parseInt(aux);
            } else {
                System.out.println("Error");
            }
        } while (!aux.matches("-?\\d{1,}"));

        return numero;
    }

    public static void introduceNumeroYMostrarOrdenado(int[] numero) {
        int aux;
        for (aux = 0; aux < numero.length; aux++) {
            System.out.println("Introduce un numero");
            numero[aux] = pedirInt();
        }
        Arrays.sort(numero);
    }

    public static int[] fusionarArraysYOrdenar(int[] array1, int[] array2, int[] arrayRellenar) {
        System.arraycopy(array1, 0, arrayRellenar, 0, array1.length);
        System.arraycopy(array2, 0, arrayRellenar, array1.length, array2.length);
        return arrayRellenar;
    }

    public static void main(String[] args) {
        int[] numero1 = new int[6];
        int[] numero2 = new int[6];
        int[] numero3 = new int[12];
        introduceNumeroYMostrarOrdenado(numero1);
        introduceNumeroYMostrarOrdenado(numero2);
        int[] finals = fusionarArraysYOrdenar(numero1, numero2, numero3);
        System.out.println(Arrays.toString(finals));

    }
}
