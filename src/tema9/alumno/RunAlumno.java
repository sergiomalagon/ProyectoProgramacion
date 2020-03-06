/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.alumno;

import tema9.cuentacorriente.CuentaCorriente;
import tema9.nif.NIF;

/**
 *
 * @author Vespertino
 */
public class RunAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF nif = new NIF(0);
        CuentaCorriente cuenta = new CuentaCorriente(300.78, 0, nif);
        Alumno alum = new Alumno(1, 18, "Sergio", "Malagon", cuenta, nif, "Hombre");        
        Alumno alum2 = new Alumno(1, 18, "Ana", "Malagon", cuenta, nif, "Hombre");        
        Alumno alum3 = new Alumno(1, 18, "Carla", "Malagon", cuenta, nif, "Hombre");        
        Alumno alum4 = new Alumno(1, 18, "Jaime", "Malagon", cuenta, nif, "Hombre");        
        Alumno alum5 = new Alumno(1, 18, "Pepe", "Malagon", cuenta, nif, "Hombre");        
        Alumno alum6 = new Alumno(1, 18, "Jose", "Malagon", cuenta, nif, "Hombre");        
        
        nif.setDni(18076132);
        System.out.println("" + alum.toString());
        System.out.println("" + alum2.toString());
        System.out.println("" + alum3.toString());
        System.out.println("" + alum4.toString());
        System.out.println("" + alum5.toString());
        System.out.println("" + alum6.toString());
    }
    
}
