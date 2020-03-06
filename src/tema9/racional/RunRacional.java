/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.racional;

/**
 *
 * @author Vespertino
 */
public class RunRacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Racional racional = new Racional(16, 10);
        Racional racional2 = new Racional();
        racional2.suma(racional);
        
    }

}
