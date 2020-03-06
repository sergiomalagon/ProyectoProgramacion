package tema2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vespertino
 */
public class Ej12 {
    
    static final byte A = 33;
            
            
    public static void main(String[] args) {
        
boolean boolVar;       

            boolVar = !((A>10)&&(A<20));
            System.out.println("!((A>10)&&(A<20)) es " + boolVar);
            boolVar = !((A>10)|| !(A<20));
            System.out.println("!((A>10)|| !(A<20)) es " + boolVar);
       
    }
}
