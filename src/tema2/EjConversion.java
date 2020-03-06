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
public class EjConversion {
    public static void main(String[] args) {
     double q = 1.0/3.0;
//     System.out.printf ("1.0/3.0 = %.3f %n", q);
//     System.out.printf ("1.0/3.0 = %7.5f %n", q);
//     q = 1.0/2.0;
//     System.out.printf ("1.0/2.0 = %09.3f %n", q);
//     q = 1000.0/3.0;
//     System.out.printf ("1000/3.0 = %7.1e h%n", q);
//     q = 3.0/4567.0;
     System.out.printf ("3.0/4567.0 = %7.3e %n", q);
     q = -1.0/0.0;
     System.out.printf ("-1.0/0.0 = %7.2e %n", q);
     q = 0.0/0.0;
     System.out.printf ("0.0/0.0 = %5.2e %n", q);
     System.out.printf ("pi = %5.3f, e = %10.4f %n", Math.PI, Math.E);
     double r = 1.1;
     System.out.printf
            ("C = 2 * %1$5.5f * %2$4.1f, "+"A = %2$4.1f * %2$4.1f * %1$5.5f %n",Math.PI, r);
}

    
}
