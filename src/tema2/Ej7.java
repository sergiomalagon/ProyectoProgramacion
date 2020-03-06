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
Un frutero necesita calcular los beneficios actuales que obtiene de la venta de manzanas y peras.Por este motivo, es necesario diseñar una aplicacion que solicite las ventas
(en kilos) de cada trimestre para cada fruta. La aplicacion mostrara el importre total sabiendo que el precio del kilo de manzanas esta fijado a 2.35 euros y el kilo de peras 
esta fijado a 1.95 euros.
 */
public class Ej7 {

    static final float MANZANAS = (float) 2.35;
    static final float PERAS = (float) 1.95;

    public static void main(String[] args) {

        float kilosmanzanas1;
        float kilosperas1;
        
        float kilosmanzanas2;
        float kilosperas2;
        
        float kilosmanzanas3;
        float kilosperas3;
        
        float kilosmanzanas4;
        float kilosperas4;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------PRIMER TRIMESTRE-----------------------------");
        
        System.out.println("Introduce la ventas(en kilos) de manzanas del primer trimestre: ");
        kilosmanzanas1 = teclado.nextFloat();
        System.out.println("Introduce la ventas(en kilos) de peras del primer trimestre: ");
        kilosperas1 = teclado.nextFloat();

        System.out.println("-----------------SEGUNDO TRIMESTRE-----------------------------");

        System.out.println("Introduce la ventas(en kilos) de manzanas del segundo trimestre: ");
        kilosmanzanas2 = teclado.nextFloat();
        System.out.println("Introduce la ventas(en kilos) de peras del segundo trimestre: ");
        kilosperas2 = teclado.nextFloat();

        System.out.println("-----------------TERCER TRIMESTRE------------------------------");

        System.out.println("Introduce la ventas(en kilos) de manzanas del tercer trimestre: ");
        kilosmanzanas3 = teclado.nextFloat();
        System.out.println("Introduce la ventas(en kilos) de peras del tercer trimestre: ");
        kilosperas3 = teclado.nextFloat();

        System.out.println("-----------------CUARTO TRIMESTRE------------------------------");

        System.out.println("Introduce la ventas(en kilos) de manzanas del cuarto trimestre: ");
        kilosmanzanas4 = teclado.nextFloat();
        System.out.println("Introduce la ventas(en kilos) de peras del cuarto trimestre: ");
        kilosperas4 = teclado.nextFloat();

        float totalmanzanas = (kilosmanzanas1 + kilosmanzanas2 + kilosmanzanas3 + kilosmanzanas4) * MANZANAS;
        float totalperas = (kilosperas1 + kilosperas2 + kilosperas3 + kilosperas4) * PERAS;

        float totalfrutas = totalmanzanas + totalperas;
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println("El beneficio toal es de " + totalfrutas + " euros");
    }

}