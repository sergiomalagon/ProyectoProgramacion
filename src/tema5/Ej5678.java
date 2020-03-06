/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

//import java.text.DecimalFormat;


/**
 *
 * @author Vespertino
 */

/*
5. Modificar el ejercicio 4 para que se reciban tres números y retorne el máximo de los 3
números
6. Crear una función que, mediante un booleano, indique si el carácter que se pasa como
parámetro de entrada corresponde a una vocal.
7. Diseñar una función que nos diga si un número es primo
8. Diseñar una función que reciba dos numeros a y b y retorne true o false indicando si b es un
divisor de a.
 */
public class Ej5678 {

    public static int numeromaximo3(int a, int b, int c) {
        int aux = 0;
        if (a > b) {
            if (a > c) {
                aux = a;
            } else {

                aux = c;
            }
        } else {
            if (b > c) {
                if (a > c) {

                    aux = b;
                }
            } else {

                aux = c;
            }
        }
        return aux;
    }

    public static boolean vocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';

    }

    public static boolean primo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;

        }
        return primo;
    }
    

    public static boolean divisor(int a, int b) {

        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int nummax = numeromaximo3(6, 8, 52);
        boolean vocales = vocal('a');
        boolean prim = primo(7);
        boolean divisores = divisor(10, 5);

        System.out.println("El numero maximo es: " + nummax);
        System.out.println("Vocales: " + vocales);
        System.out.println("Primos: " + prim);
        System.out.println("Divisores: " + divisores);

//        DecimalFormat formato;
//        formato = new DecimalFormat("0.00");
//        System.out.println("El area y el volumen son: " + formato.format(areavolumen));
    }
}
