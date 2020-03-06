/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Pedir al usuario una nota de 0 a 10 (si la nota no esta entre estas dos cifras mostraremos el
mensaje “Error: nota no válida”. Mostraremos por pantalla dicha nota con letras, por ejemplo
“Insuficiente”, “Suficiente”, … (realizar el ejercicios con switch e if-else)
 */
public class Ej13 {

    public static void main(String[] args) {
        byte nota;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una nota de [0 a 10]:");
        nota = teclado.nextByte();

        if (nota < 0 || nota > 10) {
            System.out.println("Error: nota no valida");
        } else if (nota > 0 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        }
    }
}
