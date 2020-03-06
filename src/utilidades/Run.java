/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sergio
 */
public class Run {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("hola");
        lista.add("amigos de lo desconocido");
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
