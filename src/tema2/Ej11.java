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
public class Ej11 {

    public static void main(String[] args) {
        short edad;
        short frep;
        short fMax;
        short fCObjetivo;
        short pulsacionesobjetivo70;
        short pulsacionesobjetivo80;
        short pulsacionesobjetivo90;
        short pulsacionesobjetivo100;
 
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        edad = teclado.nextShort();        
       
        System.out.println("Introduce tu frecuencia cardiaca de reposo:");
        frep = teclado.nextShort();
        
        fMax = (short) (208 - (0.7*edad)) ;
        
        pulsacionesobjetivo70 = (short) ((fMax-frep)*0.70 + frep);
        pulsacionesobjetivo80 = (short) ((fMax-frep)*0.80 + frep);
        pulsacionesobjetivo90 = (short) ((fMax-frep)*0.90 + frep);
        pulsacionesobjetivo100 = (short) ((fMax-frep)*1 + frep);
        
        System.out.println("Tus pulsaciones objetivo al 70% son: " + pulsacionesobjetivo70);
        System.out.println("Tus pulsaciones objetivo al 80% son: " + pulsacionesobjetivo80);
        System.out.println("Tus pulsaciones objetivo al 90% son: " + pulsacionesobjetivo90);
        System.out.println("Tus pulsaciones objetivo al 100% son: " + pulsacionesobjetivo100);
    }

}
