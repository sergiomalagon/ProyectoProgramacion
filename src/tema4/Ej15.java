/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Se va a adquirir un prestamo para comprar una casa que tiene un valor de "h" y una
tasa de interse de "i" y debe de estar entre 0 y 100.A un plazo de "n" años. 
Calcula la cuota respectiva a partir de la siguiente formula

m=   h*r
    ----
    1-(1+r) pow(-12*n)

r = i/(100-12)

y muestre la salida con 2 decimales

Cuota es "m"

 */
public class Ej15 {

    public static void main(String[] args) {
        float h, i, n, r, m, d;
        String s1, s2, s3;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formato1;
                
        do {

            System.out.println("Introduce el valor de la casa");
            s1 = teclado.next();
        } while (!s1.matches("\\d{1,}"));

        h = Integer.parseInt(s1);

        do {
            System.out.println("Introduce la tasa de interes [0-100]");
            s2 = teclado.next();
        } while (!s2.matches("\\d{1,3}\\.\\d{1,2}|\\d{1,3}"));

        i = Float.parseFloat(s2);

        do {
            System.out.println("Introduce un plazo de años");
            s3 = teclado.next();
        } while (!s3.matches("[1-9]{1,}"));

        n = Integer.parseInt(s3);

        r = i / (100 * 12);

        d = (float) (1 - Math.pow((1 + r), (-12 * n)));

        if (d != 0) {
            m =  h * r / d;
            formato1 = new DecimalFormat("0.00");
            System.out.println("La cuota total es de: " + formato1.format(m) + " euros");
        } else {
            System.out.println("Imposible realizar el calculo");
        }

    }
}
