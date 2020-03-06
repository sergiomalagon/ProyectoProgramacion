/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej5 {
     public static void main(String[] args) {
        byte primeraevaluacion;
        byte segundaevaluacion;

        Scanner tecladonotas = new Scanner(System.in);
        
        System.out.println("Por favor introduzca las notas de la primera evaluacion:");
        primeraevaluacion = tecladonotas.nextByte();
        
        System.out.println("Por favor introduzca las notas de la segunda evaluacion:");
        segundaevaluacion = tecladonotas.nextByte();

        byte notas = (byte) ((primeraevaluacion + segundaevaluacion) / 2);
        System.out.println("Tu media es de " + (notas));

    }
}
