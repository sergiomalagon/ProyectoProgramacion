/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Diseñar el juego de "acierta la contraseña"
Un usuario introduce una cadena y otro debe adivinarla.
Cuando realize mas 3 intentos le daremos el numero de caracteres, cuando lleve 6 le diremos los 2 ultimos
caracteres de la contraseña a partir del 9 intento le mostraremos mayor o menos alfabeticamente
 */
public class Ej2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrase�a, contrase�acompa�ero;
        int intentos = 0, numerocaracteres;

        System.out.println("Introduce la contraseña");
        contrase�a = teclado.next();

        do {
            System.out.println("Intenta adivinar la contraseña que ha puesto tu compañero");
            contrase�acompa�ero = teclado.next();
            intentos++;
            if (contrase�a.equals(contrase�acompa�ero)) {
                System.out.println("FELICIDADES!!");
                System.out.println("FIN DEL JUEGO");
            } else {
                if (intentos <= 3) {
                    System.out.println("Error");
                } else if (intentos > 3 && intentos <= 6) {
                    System.out.println("Error2");
                    numerocaracteres = contrase�a.length();
                    System.out.println("Te voy a ayudar un poco");
                    System.out.println("La contraseña que estas buscando tiene " + numerocaracteres + " caracteres ");

                } else if (intentos > 6 && intentos <= 9) {
                    System.out.println("Error3");
                    System.out.println("Te voy ayudar un poco mas");
                    numerocaracteres = contrase�a.length();
                    //seleccionamos los ultimos dos caracteres
                    char ultimo1 = contrase�a.charAt(contrase�a.length() - 1);
                    char ultimo2 = contrase�a.charAt(contrase�a.length() - 2);
                    System.out.println("Los dos ultimos catacteres de la contraseña son: " + ultimo2 + ultimo1);
                    System.out.println("Te recuerdo que la contraseña tiene " + numerocaracteres + " caracteres ");
                } else if (intentos > 9) {
                    System.out.println("Error4");
                    System.out.println("Esta es la ultima vez que te ayudo");
                    if (contrase�a.compareTo(contrase�acompa�ero) < 0) {
                        System.out.println("La contraseña que buscas es menor");
                    } else if (contrase�a.compareTo(contrase�acompa�ero) > 0) {
                        System.out.println("La contraseña que buscas es mayor");
                    }

                }

                System.out.println("Numero de intentos actuales: " + intentos);
            }

        } while (!contrase�a.equals(contrase�acompa�ero));

    }
}
