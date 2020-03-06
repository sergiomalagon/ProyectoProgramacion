/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ej6 {

    public static void main(String[] args) {
        float primeraevaluacion;
        float segundaevaluacion;
        float terceraevaluacion;

        Scanner tecladonotas = new Scanner(System.in);

        System.out.println("Por favor introduzca las notas de la primera evaluacion:");
        primeraevaluacion = tecladonotas.nextFloat();

        System.out.println("Por favor introduzca las notas de la segunda evaluacion:");
        segundaevaluacion = tecladonotas.nextFloat();

        System.out.println("Por favor introduzca las notas de la tercera evaluacion:");
        terceraevaluacion = tecladonotas.nextFloat();

        float notas;
        notas = (primeraevaluacion + segundaevaluacion + terceraevaluacion) / 3;
        System.out.println("Tu media es de " + (notas));

    }
}
