/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class RuletaBucles {

    public static void main(String[] args) {

        int bala;
        int apuesta;
        int numeroapuesta;
        int apuestafinal = 0;
        String pregunta = "¿QUIERES JUGAR OTRA RONDA? [Si o No]";
        String respuesta = " ";
        String aceptar = "Si";
        String aceptar2 = "si";
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce cuanto quieres apostar: ");
            apuesta = teclado.nextInt();
        } while (apuesta <= 1);
        do {
            System.out.println("Introduce un numero entre [1 y 6]");
            numeroapuesta = teclado.nextInt();
        } while (numeroapuesta <= 0 || numeroapuesta >= 7);

        Random r = new Random();
        bala = r.nextInt(7) + 1;

        do {
            if (numeroapuesta == bala) {
                System.out.println("HAS MUERTO");
                return;
            } else {
                apuestafinal = apuesta * 2;
                apuesta = apuesta * 2;
                System.out.println("SALES VIVO, TIENES: " + apuesta + "$");
                System.out.println("\n");
                System.out.println(pregunta);
                respuesta = teclado.next();

                if (respuesta.equals(aceptar) || respuesta.equals(aceptar2)) {
                    System.out.println("Introduce un numero entre [1 y 6]");
                    numeroapuesta = teclado.nextInt();
                }

            }
        } while (respuesta.equals(aceptar) || respuesta.equals(aceptar2));
        System.out.println("SE ACABO, HAS GANADO: " + (apuestafinal) + "$");
    }

}
