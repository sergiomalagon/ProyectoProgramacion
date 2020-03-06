/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.*;
import utilidades.Teclado;

/**
 *
 * @author Vespertino
 */
/*
Introducir por teclado hasta que se introdzca la palabra fin una serie de nombres
que se insertaran en una coleccion de forma que se conserve el orden de inserccion y que no
puedan repetirse
 */
public class Ej3 {

    public static void main(String[] args) {
        String nombre;
        LinkedHashSet nombres = new LinkedHashSet();
        System.out.println("Inserta un nombre");
        nombre = Teclado.tecladoString();
        while (!nombre.contains("fin")) {
            nombres.add(nombre);
            System.out.println("Inserta un nombre");
            nombre = Teclado.tecladoString();
        }
        Iterator aux = nombres.iterator();
        System.out.println("Orden de introduccion");
        while (aux.hasNext()) {
            System.out.println(aux.next());
        }
    }
}
