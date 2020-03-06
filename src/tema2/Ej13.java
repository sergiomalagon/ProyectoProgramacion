/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author Vespertino
 */
public class Ej13 {

    static final byte A = 20;
    static final byte B = 20;
    static final byte C = 15;
    static final byte D = 10;

    

    public static void main(String[] args) {

        boolean boolVar;

        boolVar = ((A==B)||(B>C))||(C<D);
        System.out.println("((A==B)||(B>C))||(C<D) es " + boolVar);
        
    }

}
