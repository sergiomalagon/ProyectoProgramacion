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
public class Ej14 {

    static final byte A = 10;
    static final byte B = 12;
    static final byte C = 15;
    static final byte D = 10;

    public static void main(String[] args) {

        boolean numeros;

        numeros = ((A > B) || (A < C) && ((A == C) || (A >= B)));
        System.out.println("((A>B)||(A<C)&&((A==C)||(A>=B))) es " + numeros);
        numeros = ((A >= B) || (A < D)) && ((A >= D) && (C > D));
        System.out.println("((A>=B)||(A<D))&&((A>=D)&&(C>D)) es " + numeros);
        numeros = !(A == C) && (C > B);
        System.out.println("!(A==C)&&(C>B) es " + numeros);
        numeros = A>B || A<C && A==C || A>=B;
        System.out.println("A>B || A<C && A==C || A>=B es " + numeros);

        
//        F || V && F || F      F || F || F        F
    }
}
