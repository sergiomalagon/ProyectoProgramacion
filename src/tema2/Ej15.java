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

/*
Conversiones y factores de conversión. Realice los siguientes ejercicios, (para cada
uno de ellos comprobaremos la entrada):

 cc a litros
 cc / segundo a litros / hora
 Grados centígrados a grados Fahrenheit
 Kilómetros cuadrados a millas cuadradas
 Libras a kilogramos
 Días, horas, minutos y segundos a segundos. Por ejemplo cuantos segundos
    hay en 3 días, 4 horas y 20 minutos y 10 segundos.
 Milibares a Libras por pie cuadrado.
 */
public class Ej15 {

    public static void main(String[] args) {
        double a, b, c, d, e, f, g,h, i,j;
        String s1, s2, s3, s4, s5, s6, s7,s8,s9,s10;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduce los centimetro cubicos que quieras pasar a litros: ");
            s1 = teclado.next();
        } while (!s1.matches("\\d{1,}"));

        a = Double.parseDouble(s1);
        double finala = a / 1000;
        System.out.println(finala + " litros ");

        do {
            System.out.print("Introduce los centimetro cubicos que quieras pasar a litros: ");
            s2 = teclado.next();
            System.out.print("Introduce los segundos que quieras pasar a horas: ");
            s3 = teclado.next();
        } while ((!s2.matches("\\d{1,}") && (!s3.matches("\\d{1,}"))));

        b = Double.parseDouble(s2);
        c = Double.parseDouble(s3);

        double finalb = b / 1000;
        double finalc = c / 3600;
        System.out.println(finalb + " litros " + " / " + finalc + " horas ");
        do {
            System.out.print("Introduce los grados centigrados que quieras pasar a Fahrenheit: ");
            s4 = teclado.next();
        } while (!s4.matches("\\d{1,2}"));

        d = Double.parseDouble(s4);
        double finald = (d * 9 / 5) + 32;
        System.out.println(finald + " Fahrenheit ");
        do {
            System.out.print("Introduce los kilometros cuadrado que quieras pasara a millas cuadradas: ");
            s5 = teclado.next();
        } while (!s5.matches("\\d{1,2}\\.?\\d{0,2}"));

        e = Double.parseDouble(s5);
        double finale = e*2.59;
        System.out.println(finale + " millas cuadradas ");
        do {
            System.out.print("Introduce las libras que quieras pasar a kilogramos: ");
            s6 = teclado.next();
        } while (!s6.matches("\\d{1,2}\\.?\\d{0,2}"));

        f = Double.parseDouble(s6);
        double finalf = f*2.205;
        System.out.println(finalf + " kilogramos ");
        do {
            System.out.print("Introduce el numero de dias que quieras convertir a segundos: ");
            s7 = teclado.next();
            System.out.print("Introduce el numero de minutos que quieras convertir a segundos: ");
            s8 = teclado.next();
            System.out.print("Introduce los segundos: ");
            s9 = teclado.next();
        } while (!s7.matches("\\d{1,}") && (!s8.matches("\\d{1,}")) && (!s9.matches("\\d{1,}")));

        g = Double.parseDouble(s7);
        h = Double.parseDouble(s8);
        i = Double.parseDouble(s9);
        double finalg = g*3600;
        double finalh = h*60;
        double totalsegundos = finalg + finalh + i;
        System.out.println(totalsegundos + " segundos ");

        do {
            System.out.print("Introduce los milibares que quieras convertir a libras por pie cuadrado: ");
            s10 = teclado.next();
        } while (!s10.matches("\\d{1,2}\\.?\\d{0,2}"));

        j = Double.parseDouble(s10);
        double finalj = j * 2.0885;
        System.out.println(finalj + " libras por pie cuadrado ");

    }
}
