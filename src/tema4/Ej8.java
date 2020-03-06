/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Pedir al usuario que introducza el dia, el mes y el aÃ±o de una fecha e inicar si
esa fecha es o no es correcta
 */
public class Ej8 {

    public static void main(String[] args) {
        int dia;
        int mes;
        int año;
        Scanner teclado;
        teclado = new Scanner(System.in);

        //PEDIMOS LOS DATOS
        do {
            System.out.println("Introduce un dia");
            dia = teclado.nextInt();
        } while (dia < 1 || dia > 31);

        do {
            System.out.println("Introduce un mes");
            mes = teclado.nextInt();
        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Introduce un aÃ±o");
            año = teclado.nextInt();
        } while (año < 1 || año > 9999);

        //CALCULAMOS
        if ((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (año > 0 && año < 9999)) {
            System.out.println("LA FECHA ES CORRECTA");
            if (dia > 28 && mes == 2 && año % 4 == 0 && año % 400 == 0) {
            System.out.println("LA FECHA ES CORRECTA");

        } else {
            System.out.println("LA FEHCA NO ES CORRECTA");

        }
        }
        else {
            System.out.println("");
        }
//        if (dia > 28 && mes == 2 && aÃ±o % 4 == 0 && aÃ±o % 400 == 0) {
//            System.out.println("LA FECHA ES CORRECTA");
//
//        } else {
//            System.out.println("LA FEHCA NO ES CORRECTA");
//
//        }

    }
}
