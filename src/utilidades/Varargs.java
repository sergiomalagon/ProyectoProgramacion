/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Arrays;

/**
 *
 * @author Sergio
 */
public class Varargs {
    
    public static int[] sumaTest(int...param){
        
        
        
        return param;
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println(Arrays.toString(sumaTest(1,2,3,4,5,6)));
        
        
       
    }
}
