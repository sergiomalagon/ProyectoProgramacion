/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Scanner;
import utilidades.Quitar;

/**
 *
 * @author Vespertino
 */

/*
Pedir el nombre y apellidos de una persona y  mostraremos dicha informacion sin
ninguna vocal(esten acentuadas o no) stringbuilder
 */
public class Ej5 {

    public static void main(String[] args) {
        StringBuilder nombre = new StringBuilder();
        Scanner teclado = new Scanner(System.in,  "ISO-8859-1");
        System.out.println("Introduce tu nombre y apellido");
        nombre.append(teclado.nextLine());
        System.out.println(Quitar.vocales(nombre));
    }
}

