/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.hora;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Sergio
 */
public class RunHora {

    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>();
        HoraExacta he1 = new HoraExacta(16, 36, 24);
        HoraExacta he2 = new HoraExacta(17, 19, 9);
        HoraExacta he3 = new HoraExacta(14, 45, 32);
        HoraExacta he4 = new HoraExacta(23, 12, 39);
        ts.add(he1);
        ts.add(he2);
        ts.add(he3);
        ts.add(he4);
        Iterator it = ts.iterator();
        System.out.println("Ordenacion por TreeSet");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Ordenacion por array");
        HoraExacta[] he = {he1, he2, he3, he4};
        Arrays.sort(he);
        for (int i = 0; i < he.length; i++) {
            System.out.println("" + he[i]);
        }
    }

}
