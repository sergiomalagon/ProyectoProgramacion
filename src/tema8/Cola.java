/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Cola {

    public static void main(String[] args) {
        ArrayDeque cola = new ArrayDeque();
        cola.add(10);
        cola.add(20);
        cola.add(30);
        System.out.println(cola);
        cola.poll();
        System.out.println(cola);
        System.out.println("Tamaño cola: "+ cola.size());
        System.out.println("Peek cola: " + cola.peek());
    }
}
