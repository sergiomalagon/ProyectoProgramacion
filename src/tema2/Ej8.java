/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Diseñar una aplicacion que calcule la longitud y el area de una circunferencia.
Para ello, el usuario introducira por teclado el radio de dicha circunferencia
 */
public class Ej8 {

    static final double PI = 3.14159265358979323846;

    public static void main(String[] args) {

        float radio;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia:");
        radio = teclado.nextFloat();
        
        float longitud = (float) PI * 2 * radio;
        float area = (float) PI * radio * radio;
    
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("La longitud de la circunferencia es " + longitud);
        System.out.println("El area de la circunferencia es " + area);
    }
}
