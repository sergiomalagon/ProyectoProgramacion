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
Realizar un programa en Java que muestre por pantalla cuantas cifras tiene un
numero entero introducido por teclado. Dicho numero estara comprendido entre
0 y 99999
*/
public class Ej10 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 99999:");
        numero = teclado.nextInt();
        
        if(numero>0 && numero<99999){
            if(numero>0 && numero<10){
                System.out.println("EL NUMERO TIENE UNA CIFRA");
            }
            else if(numero>9 && numero<100){
                System.out.println("EL NUMERO TIENE DOS CIFRAS");
            }
            else if(numero>99 && numero<1000){
                System.out.println("EL NUMERO TIENE TRES CIFRAS");
            }
            else if(numero>999 && numero<10000){
                System.out.println("EL NUMERO TIENE CUATRO CIFRAS");
            }
            else if(numero>9999 && numero<99999){
                System.out.println("EL NUMERO TIENE CINCO CIFRAS");
            } 
        }
        else{
            System.out.println("INTRODUCE UN NUMERO ENTRE 0 Y 99999");
        }
    }
}
