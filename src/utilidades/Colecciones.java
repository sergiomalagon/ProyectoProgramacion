/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Colecciones {
    private static void mostrarColeccion(LinkedList numeros) {
        Iterator it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void listaIterator(ArrayList lista) {
        lista.add("hola");
        lista.add("amigos de lo desconocido");
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
