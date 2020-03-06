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
Idem al anterior pero con 3 numeros (sin el operador ternario)
 */
public class Ej8 {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        numero1 = teclado.nextInt();
        System.out.println("Introduce otro numero:");
        numero2 = teclado.nextInt();
        System.out.println("Introduce un tercer numero");
        numero3 = teclado.nextInt();

if(numero1>numero2) {
            if(numero1>numero3) {
                if(numero2>numero3) {
                    
                    System.out.println("De mayor a menor es: " + numero1 + " " + numero2 + " " + numero3);                 
                }else {
                    
                    System.out.println("De mayor a menor es: " + numero1 + " " + numero3 + " " + numero2);
                }
            }else {
                
                System.out.println("De mayor a menos es: " + numero3 + " " + numero1 + " " + numero2);
            }
        }else {
            if(numero2>numero3) {
                if(numero1>numero3) {
                    
                    System.out.println("De mayor a menor es: " + numero2 + " " + numero1 + " " + numero3);
                }else {
                    
                    System.out.println("De mayor a menor es: " + numero2 + " " + numero3 + " " + numero1);
                }              
            }else {
                
                System.out.println("De mayor a menor es: " + numero3 + " " + numero2 + " " + numero1);
            }
        }
    }
}