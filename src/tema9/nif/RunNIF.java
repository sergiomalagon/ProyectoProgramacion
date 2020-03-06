/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.nif;

/**
 *
 * @author Vespertino
 */
public class RunNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF nif = new NIF();
       // NIF nif2 = new NIF();
       // nif2.setDni();
        nif.setDni(18076133);
        System.out.println("" + nif.toString());
       // System.out.println("" + nif2.equals(nif));
    }
    
}
