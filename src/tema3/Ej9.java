/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Modificar el ejercicio del tema anterior sobre la resolucion de la ecuacion de 
segundo grado de modo que compruebe antes de realizar la raiza cuadrada que en
su interior hay un valor negativo. En ese caso mostraremos el mensaje "No
exixten solucuones reales".tambien comprobaremos que denominador no es cero.
 */
public class Ej9 {

    public static void main(String[] args) {
        // Zona de declaracion de variables
        float a, b, c;
        float ecuacionX, ecuacionX2;
        float raizcuadrada;
        Scanner teclado = new Scanner(System.in);

        // Pedir datos
        System.out.println("Introduce el valor de a: ");
        a = teclado.nextFloat();
        System.out.println("Introduce el valor de b: ");
        b = teclado.nextFloat();
        System.out.println("Introduce el valor de c: ");
        c = teclado.nextFloat();
        
        // Calculos
        raizcuadrada =  (b * b) - 4 * a * c;

        ecuacionX = (float) ((-b + Math.sqrt(raizcuadrada)) / (2 * a));
        ecuacionX2 = (float) ((-b - Math.sqrt(raizcuadrada)) / (2 * a));

        //Condicion
        if (raizcuadrada < 0) {
            System.out.println("NO EXISTEN SOLUCIONES REALES");
        }
        else if(a == 0){
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
        }
        else{
        DecimalFormat formato1 = new DecimalFormat("0.00");
        System.out.println("El valor de la ecuacion es " + formato1.format(ecuacionX) + "\n");
        System.out.print(" Y " + formato1.format(ecuacionX2) + "\n"); 
        }
    }
}
