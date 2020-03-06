/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Ej6 {

    public static void main(String[] args) {
        String cadena, cadenainvertida = "";
        Scanner t = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Introduce una cadena");
        cadena = t.nextLine();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenainvertida = cadenainvertida + cadena.charAt(i);
        }
        System.out.println(cadenainvertida);
    }
}
