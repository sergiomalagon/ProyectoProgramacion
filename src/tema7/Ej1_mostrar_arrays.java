/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Scanner;
import utilidades.Array;

/**
 *
 * @author Vespertino
 */

/*
 * Pedir al usuario 5 numeros decimales y mostratrmos los numeros en el mimo
 * orden que fueron introducidos
 */
public class Ej1_mostrar_arrays {

    public static void main(String[] args) {
        double[] numeros = new double[5];
        Scanner t = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce 5 numero decimales");
            numeros[i] = t.nextDouble();
        }

        Array.muestraArrayEnOrdenDouble(numeros);

    }
}
