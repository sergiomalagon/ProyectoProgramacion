/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.gestiondepersonal;

import java.util.GregorianCalendar;

/**
 *
 * @author Sergio
 */
public class Run {

    public static void main(String[] args) {
        GregorianCalendar fechaInicio = new GregorianCalendar(2020, 3, 21);
        GregorianCalendar fechaFinal = new GregorianCalendar(2020, 4, 5);
        EmpleadoFijo emf = new EmpleadoFijo(0, 2010, "1234567", "Sergio", 20);
        System.out.println("" + emf.calculaSueldo());

    }
}
