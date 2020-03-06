/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */

/*
Pedir al usuario una nota de 0 a 10 (si la nota no esta entre estas dos cifras mostraremos el
mensaje “Error: nota no válida”. Mostraremos por pantalla dicha nota con letras, por ejemplo
“Insuficiente”, “Suficiente”, … (realizar el ejercicios con switch e if-else)
 */
public class Ej13_2 {

    public static void main(String[] args) {
        byte nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una nota de [0 a 10]:");
        nota = teclado.nextByte();
        
        switch (nota) {
            case 1:
                System.out.println("Insuficiente");
                break;
            case 2:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Insuficiente");
                break;
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;

            default:
                System.out.println("Error: nota no valida");
        }
    }
}
