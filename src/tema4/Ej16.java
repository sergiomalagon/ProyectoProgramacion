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

/*
Realizar el juego de “número secreto”. El ordenador generará un número aleatorio entre
[1,100], y pedirá al usuario que lo adivine. El ordenador debe dar al usuario pistas del tipo
“mayor” o “menor” por pantalla. El proceso termina cuando el usuario acierta o se rinde
(introduce un número negativo).
 */
public class Ej16 {

    public static void main(String[] args) throws InterruptedException {
        int numeroelegir;
        int numeroaleatorio;
        Scanner teclado = new Scanner(System.in);
        String s1;
        Random r = new Random();
        numeroaleatorio = r.nextInt(101) + 1;

        do {
            System.out.println("¿Que numero crees que he elegido? ");
            System.out.print("has elegido el: ");
            s1 = teclado.next();

        } while (!s1.matches("\\d{1,2}"));

//        do {
//            System.out.println("¿Que numero crees que he elegido? ");
//            System.out.print("has elegido el: ");
//            s1 = teclado.next();
//        } while (!s1.matches("\\d{1,2}"));
//        numeroelegir = Integer.parseInt(s1);
//
//        while (numeroelegir != numeroaleatorio) {
//
//            do {
//                if (numeroelegir < numeroaleatorio) {
//                    System.out.println("Has fallado, el numero que estas buscando esta mas arriba");
//                    do {
//                        do {
//                            System.out.println("¿Que numero crees que he elegido? ");
//                            System.out.print("has elegido el: ");
//                            s1 = teclado.next();
//                        } while (!s1.matches("\\d{1,}"));
//                        numeroelegir = Integer.parseInt(s1);
//                    } while (numeroelegir < 1);
//                }
//            } while ((numeroelegir < numeroaleatorio) && (numeroelegir > 1));
//            System.out.println("SE ACABO!");
//            return;
//
//            do {
//
//                if (numeroelegir > numeroaleatorio) {
//                    System.out.println("Has fallado, el numero que estas buscando esta mas abajo");
//                    do {
//                        do {
//                            System.out.println("¿Que numero crees que he elegido? ");
//                            System.out.print("has elegido el: ");
//                            s1 = teclado.next();
//                        } while (!s1.matches("\\d{1,}"));
//                        numeroelegir = Integer.parseInt(s1);
//                    } while (numeroelegir < 1);
//
//                }
//            } while ((numeroelegir > numeroaleatorio) && (numeroelegir > 1));
//        }
//        System.out.println("SE ACABO!!!");
    }
}
