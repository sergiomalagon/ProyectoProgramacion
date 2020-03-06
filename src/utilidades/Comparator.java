/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Sergio
 */
public class Comparator {

    public static void main(String[] args) {
        HashMap hm = new HashMap();
        TreeSet ts = new TreeSet();
        hm.put(1, "ana");
        hm.put(2, "jaime");
        hm.put(3, "sergio");
        hm.put(4, "jose");

        for (int i = 1; i <= hm.size(); i++) {
            ts.add(hm.get(i));
        }
        System.out.println(ts);

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        
        
        
        
        
        
    }
}
