/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Vespertino
 */
public class test_void {
    public static void met(int x, StringBuilder s){
        x=10;
        s.append("Hola");
    }
    
    public static void main(String[] args) {
        int aux=15;
        StringBuilder p = new StringBuilder();
        p.append("Pepe");
        met(aux,p);
        System.out.println(aux);
        System.out.println(p);
    }
}
