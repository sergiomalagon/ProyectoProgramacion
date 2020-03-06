/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.*;

/**
 *
 * @author Vespertino
 */
/*
Para ir a ver la película Dolor y Gloria hay dos filas de espectadores.
Un acomodador es el encargado de dejar entrar a la gente. Sus instrucciones son simples:
Tiene que dejar entrar siempre al espectador que es mayor de entre las dos colas,
si tienen la misma edad, las personas de la fila 1 tiene preferencia.
Almacena previamente en las dos colas 5 enteros en cada una que representen las
edades de dichos espectadores.
 */
public class Ej11 {

    public static int edad() {
        int edad = 0;
        Random aleatorio = new Random();
        edad = aleatorio.nextInt(90) + 1;
        return edad;
    }

    public static int rellenarFilas(ArrayDeque fila1, ArrayDeque fila2) {
        int filas1 = 0, filas2 = 0, devolver = 0;
        int edad1 = 0, edad2 = 0;
        edad1 = edad();
        fila1.add(edad1);
        edad2 = edad();
        fila2.add(edad2);

        filas1 = (Integer) fila1.peekLast();
        filas2 = (Integer) fila2.peekLast();
        if (filas1 > filas2) {
            devolver = filas1;
        } else if (Objects.equals(filas1, filas2)) {
            devolver = filas1;
        } else if (filas1 < filas2) {
            devolver = filas2;
        }
        return devolver;
    }

    public static void main(String[] args) {
        ArrayDeque fila1 = new ArrayDeque();
        ArrayDeque fila2 = new ArrayDeque();
        Integer resultado;
        for (int i = 0; i < 5; i++) {
            resultado = rellenarFilas(fila1, fila2);
            System.out.print(resultado + " ");
        }
        System.out.println(" ");
        System.out.println("Fila 1: " + fila1);
        System.out.println("Fila 2: " + fila2);

    }

}
