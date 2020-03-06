/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Arrays;
import utilidades.Teclado;

/**
 *
 * @author Vespertino
 */

/*
Introduce un array de enteros y devuelve ese mismo array pero sin numero repetidos
 */
public class Ej9 {

    public static String[] pedirIntSplitString() {
        String string;
        String[] parts;
        System.out.println("Introduce los numeros separados por - entre ellos");
        string = Teclado.tecladoStringNextLine();
        parts = string.split("-");
        Arrays.toString(parts);
        return parts;
    }

    public static void copiarStringArrayAEntero(int[] numero) {
        String[] aux = pedirIntSplitString();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = Integer.parseInt(aux[i]);
        }
    }
//11234
//01234
    public static int[] sinRepetidos(int numero[]) {
        int[] aux;
        int h = 1;
        for (int j = 0; j < numero.length - j; j++) {
            if (numero[j] == numero[j + 1]) {
                numero[j + 1] = numero[j + 2];
                h++;
            }
        }
        aux = Arrays.copyOf(numero, h);
        return aux;

    }

    public static void main(String[] args) {
        int[] numero;
        int i;
        System.out.println("Introduce el cantidad de numeros que vas a introducir");
        i = Teclado.pedirInt();
        numero = new int[i];
        copiarStringArrayAEntero(numero);
        Arrays.sort(numero);
        System.out.println(Arrays.toString(sinRepetidos(numero)));

    }
}
