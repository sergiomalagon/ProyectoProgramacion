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
Implementar el metodo de union de dos conjuntos, que devuelva un Nuevo conjunto con todos
los elementos que pertenezcan al menos a uno de los conuntos
Unir dos conjuntos es poner en el conjunto A, todos los elementos del cojunto B que no esten en A
Interseccion: los elementos de A y B que sea Iguales
Diferencia conjuntos: Quitar los elementos de A que estan en B
 */
public class Ej6_Union {

    public static Set union(Set conjunto1, Set conjunto2) {
        conjunto1.addAll(conjunto2);
        return conjunto1;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int conjuntoA, conjuntoB;
        HashSet conjunto1 = new HashSet();
        HashSet conjunto2 = new HashSet();
        System.out.println("Introduce elementos en el conjunto1 (Introduce -1 para cerrar el conjunto)");
        conjuntoA = t.nextInt();
        while (conjuntoA != -1) {
            conjunto1.add(conjuntoA);
            conjuntoA = t.nextInt();
        }
        System.out.println("Introduce elementos en el conjunto2 (Introduce -1 para cerrar el conjunto)");
        conjuntoB = t.nextInt();
        while (conjuntoB != -1) {
            conjunto2.add(conjuntoB);
            conjuntoB = t.nextInt();
        }
        Set aux = union(conjunto1, conjunto2);

        System.out.println(aux);
    }
}
