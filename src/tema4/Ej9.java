/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Que pida al usuario 5 calificaciones seguidas, y calcula y muestra si hay algun
suspenso
 */
public class Ej9 {

    public static void main(String[] args) {
        byte calificacion1, calificacion2, calificacion3, calificacion4, calificacion5;
        Scanner teclado;
        teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce la calificacion 1");
            calificacion1 = teclado.nextByte();
        } while (calificacion1 < 1 || calificacion1 > 10);
        do {
            System.out.println("Introduce la calificacion 2");
            calificacion2 = teclado.nextByte();
        } while (calificacion2 < 1 || calificacion2 > 10);
        do {
            System.out.println("Introduce la calificacion 3");
            calificacion3 = teclado.nextByte();
        } while (calificacion3 < 1 || calificacion3 > 10);
        do {
            System.out.println("Introduce la calificacion 4");
            calificacion4 = teclado.nextByte();
        } while (calificacion4 < 1 || calificacion4 > 10);
        do {
            System.out.println("Introduce la calificacion 5");
            calificacion5 = teclado.nextByte();
        } while (calificacion5 < 1 || calificacion5 > 10);

        if (calificacion1 < 5) {
            System.out.println("Has suspendido la clasificacion 1");
        }
        if (calificacion2 < 5) {
            System.out.println("Has suspendido la clasificacion 2");
        }
        if (calificacion3 < 5) {
            System.out.println("Has suspendido la clasificacion 3");
        }
        if (calificacion4 < 5) {
            System.out.println("Has suspendido la clasificacion 4");
        }
        if (calificacion5 < 5) {
            System.out.println("Has suspendido la clasificacion 5");
        }
        
        if (calificacion1>4 && calificacion2>4 && calificacion3>4 && calificacion4>4 && calificacion5>4){
            System.out.println("FELICIDADES, NO HAS SUSPENDIDO NINGUNA");
    }

    }
}
