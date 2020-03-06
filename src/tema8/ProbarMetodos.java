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
public class ProbarMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List al = new ArrayList();
        List al2 = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            al.add(i);

        }
        for (int i = 11; i <= 20; i++) {
            al2.add(i);

        }
        int[] intAux = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado;
        Integer r, r2;
        Collections.reverse(al);
        System.out.println("reverse: " + al);
        Collections.reverse(al);
        System.out.println("replace?: " + Collections.replaceAll(al, 4, "Patatas"));
        System.out.println("replaceAll: " + al);
        Collections.replaceAll(al, "Patatas", 4);
        System.out.println("binartySearch: " + Arrays.binarySearch(intAux, 6));
        System.out.println("frecuency: " + Collections.frequency(al, 10));
        System.out.println("indexOSubList: " + Collections.indexOfSubList(al, al2));
        System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(al, al2));
        System.out.println("max: " + Collections.max(al));
        System.out.println("min: " + Collections.min(al2));
        Collections.shuffle(al);
        System.out.println("suffle: " + al);
        Collections.rotate(al2, 5);
        System.out.println("rotate: " + al2);
        System.out.println("disjoint: " + Collections.disjoint(al, al2));
    }

}
