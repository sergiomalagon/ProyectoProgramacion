/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.cliente;

import java.util.Arrays;

/**
 *
 * @author Vespertino
 */
public class RunCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("18076132", "Sergio", 19, (float) 456.78);
        Cliente cliente2 = new Cliente("53454353", "Sergio", 89, (float) 879.08);
        Cliente cliente3 = new Cliente("54674757", "Sergio", 78, (float) 25453.45);
        Cliente cliente4 = new Cliente("98769789", "Sergio", 14, (float) 453.98);
        Cliente cliente5 = new Cliente("97896797", "Sergio", 12, (float) 6655166565.5654);
        Cliente cliente6 = new Cliente("23443534", "Sergio", 52, (float) 0.0);
        Cliente cliente7 = new Cliente("23543534", "Sergio", 67, (float) 741.852);
        Cliente cliente8 = new Cliente("98009808", "Sergio", 8, (float) 963.78789);
        Cliente cliente9 = new Cliente("56456564", "Sergio", 1, (float) 78523.951);
        Cliente cliente10 = new Cliente("78978978", "Sergio", 99, (float) 456.79);
        
        Cliente[] aux = {cliente1,cliente2,cliente3,cliente4,cliente5,cliente6,cliente7,cliente8,cliente9,cliente10};
        Arrays.sort(aux);
        System.out.println("Ordenacion por DNI: ");
        for (int i = 0; i < aux.length; i++) {
            System.out.println("" + aux[i]);
        }
        
        System.out.println(" ");
        OrdenacionPorEdadDeMayorAMenor cc = new OrdenacionPorEdadDeMayorAMenor();
        Arrays.sort(aux, cc);
        System.out.println("Ordenacion por edad: ");
        for (int i = 0; i < aux.length; i++) {
            System.out.println("" + aux[i]);
        }
        
        System.out.println(" ");
        
        OrdenacionPorSaldoCreciente os = new OrdenacionPorSaldoCreciente();
        Arrays.sort(aux, os);
        System.out.println("Ordenacion por saldo: ");
        for (int i = 0; i < aux.length; i++) {
            System.out.println("" + aux[i]);
        }
        
        
    }

}
