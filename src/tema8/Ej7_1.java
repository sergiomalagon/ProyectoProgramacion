/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Sergio
 */
public class Ej7_1 {

    public static void main(String[] args) {
        HashMap hm = new HashMap<Integer, String>();
        hm.put(1, "patatas");
        hm.put(2, "platano");
        hm.put(3, "uva");
        System.out.println(hm.keySet());
        System.out.println(hm.get(2));
        System.out.println(hm.values());

        Set aux = hm.keySet();
        Iterator it = aux.iterator();
        while (it.hasNext()) {
            Integer auxX = (Integer) it.next();
            System.out.println(auxX + " " + hm.get(auxX));
        }
    }
}
