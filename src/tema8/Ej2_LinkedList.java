/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Random;
import java.util.*;

/**
 *
 * @author Vespertino
 */
/*
Crea una coleccion de 20 numeros enteros aleatorios, permitiendo que hayn repetidos
recorrela y muestra aquellos que sean menores de 10. Numeros del 1 al 25
 */
public class Ej2_LinkedList {

    public static int numerosAleatorios() {
        int colores;
        Random r = new Random();
        colores = r.nextInt(25) + 1;
        return colores;
    }

    private static void mostrarColeccionNumeros(LinkedList numeros, int numeroMaximo) {
        Iterator numero = numeros.iterator();
        int aux;

        while (numero.hasNext()) {
            //convierto el objeto a entero para poder hacer una comparacion
            aux = ((Integer)numero.next());
            if (aux < numeroMaximo) {
                System.out.println(aux);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList numeros = new LinkedList();
        for (int h = 0; h <= 20; h++) {
            numeros.add(numerosAleatorios());
        }
        mostrarColeccionNumeros(numeros, 10);

    }

}
