/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */

/*
Idem al ejercicio 14 pero mostrando el día siguiente. Se deben tener en cuenta años bisiestos y
meses de 30 o 31 días.
 */
public class Ej14 {

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
            
            System.out.println("Introduce un año");
            año = teclado.nextInt();
        } while (año < 1 || año > 9999);

        //CALCULAMOS
        if ((dia > 28 && mes == 2) && ((año % 4 != 0) && ((año % 100 == 0) || (año % 400 != 0)))) {
            System.out.println("LA FECHA NO ES CORRECTA");
            return;
        }

        if ((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (año > 0 && año < 9999)) {
            System.out.println("LA FECHA ES CORRECTA");

            if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
                System.out.println("Y EL AÑO ES ADEMAS BISIESTO");
                System.out.println("El dia siguiente es: " + (dia + 1) + " / " + mes + " / " + año);

            } else {
                System.out.println("PERO EL AÑO NO ES BISIESTO");
                System.out.println("El dia siguiente es: " + (dia + 1) + " / " + mes + " / " + año);

            }
        } else {
            System.out.println("LA FECHA NO ES CORRECTA ");
        }

    }
}
