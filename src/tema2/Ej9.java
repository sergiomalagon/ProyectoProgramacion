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
Un econmista nos ha encargado un programa para realizar calculos con el IVA.
La aplicacion debe solicitar la base imposible y el IVA a aplicar. 
Debemos mostratr en pantalla el
importe correspondinte al IVA y al total.
 */
public class Ej9 {

    public static void main(String[] args) {

        float base;
        byte iva;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la base imponible:");
        base = teclado.nextFloat();

        System.out.println("Introduce el IVA a aplicar:");
        iva = teclado.nextByte();

        float ivacorrespondiente = (iva * base) / 100;
        float total = ivacorrespondiente + base;

        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("El importe correspondiente al IVA es de " + ivacorrespondiente + " euros");
        System.out.println("El importe total es de " + total + " euros");

    }

}
