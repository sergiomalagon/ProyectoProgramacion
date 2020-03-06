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
public class Ej7 {

    public static void main(String[] args) {
        int producto = 1;
        int numero = 1;
        int contador = 0;

        while (contador != 10) {
            if (numero % 2 != 0) {
                producto = producto * numero;
                contador++;
                numero = numero + 2;
            }
            

        }
        System.out.println(producto);

    }
}
