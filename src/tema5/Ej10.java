/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Sergio
 */
public class Ej10 {

    public static int divisor(int a) {
        int divi = 0;

        while (divi < 100) {
            divi++;
            if (a % divi == 0) {
                System.out.print("El numero " + a + " tiene como divisor el numero: ");
                System.out.println(divi);
            }

        }

        return divi;

    }

    public static void main(String[] args) {
        int divisores = divisor(90);
    }
    
}
