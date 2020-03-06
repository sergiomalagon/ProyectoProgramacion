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
Que pida la hora, minutos y segundos y mostrara por pantalla la hora un segundo
mas tarde
*/
public class Ej10 {
    public static void main(String[] args) {
        byte segundo, minuto, hora;
        Scanner teclado;
        teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce la hora");
            hora = teclado.nextByte();
        } while (hora < 1 || hora > 24);
        do {
            System.out.println("Introduce los minutos");
            minuto = teclado.nextByte();
        } while (minuto < 0 || minuto > 60);
        do {
            System.out.println("Introduce los segundos");
            segundo = teclado.nextByte();
        } while (segundo < 0 || segundo > 60);
        
        System.out.print((hora) + " horas " + (minuto) + " minutos " + (segundo + 1 ) + " segundos " + "\n");
    }
}
