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

/*
HashSet, LinkedHashSet, TreeSet
Cree una colenccion de 20 numeros enteros aleatorios menores de 100, guardarlos en el orden de generacion,
y mostrar dicha lista una vez creada. Posteriormente ordenarla en sentido creciente y volverla a mostrar por pantalla
 */
public class Ej1_LinkedHashSet_TreeSet {

    //genero 20 numeros aleatorios menores que 100
    public static int numerosAleatorios() {

        int colores = 0;
        Random r = new Random();
        colores = r.nextInt(99) + 1;
        return colores;
    }

    public static void main(String[] args) {
        //declaro las colecciones
        LinkedHashSet numeros = new LinkedHashSet(); //index segun su orden de llegada
        TreeSet numeros2 = new TreeSet(); //index segun orden logico(alfabeticamente, menor a mayor)
        //bucle que rellena las colecciones, con numeros.size me aseguro que se esten introducciendo numero hasta que llegue a 20(porque los numeros duplicados no los cuenta)
        for (int h = 0; h <= 20 && numeros.size() != 20; h++) {
            //añado todos los numeros aleatorios a numeros
            numeros.add(numerosAleatorios());
            //añado todos los numeros de numeros a numeros2
            numeros2.addAll(numeros);
        }

        Iterator aux = numeros.iterator();
        Iterator aux2 = numeros2.iterator();
        //bucle para mostrar todos los numero aleatorios segun su orden de llegada
        System.out.println("Orden de introduccion");
        System.out.println("" + numeros.toString());
 //       while (aux.hasNext()) {
  //          System.out.println(aux.next());
 //       }
        //bucle para mostrar los mismos numeros aleatorios en orden logico
        System.out.println("Numeros ordenados");
        System.out.println("" + numeros2.toString());
       // while (aux2.hasNext()) {
         //   System.out.println(aux2.next());
       // }
    }
}
