/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.clubnautico;

import java.util.GregorianCalendar;

/**
 *
 * @author Sergio
 */
public class Run {

    public static void main(String[] args) {
        GregorianCalendar inicial = new GregorianCalendar(2020, 4, 1);
        GregorianCalendar ffinal = new GregorianCalendar(2020, 4, 5);
        Alquiler a = new Alquiler("sergio", "1234567", inicial, ffinal, "si");
        Yate v = new Yate(10,3000, "1234ABV", 5, 1978, a);
        System.out.println("" + v.calcularAlquiler() + "$");
    }
}
