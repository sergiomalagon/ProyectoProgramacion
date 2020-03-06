/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Vespertino
 */

/*
Realizar un programa en Java que muestre los números entre 1 y 100
salvo los múltiplos de 7.
 */
public class Ej12 {

    public static void main(String[] args) {
        int numero = 1;

        while (numero < 100) {
            numero++;
            if (numero % 7 == 0) {
                continue;
            }

            System.out.println(numero);
        }
    }

}
