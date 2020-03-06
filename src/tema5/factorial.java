/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Vespertino
 */
public class factorial {
    public static int factorial(int num){
        int resultado;
        if(num==0){
            resultado = 1;
        }else{
            resultado = num * factorial(num-1);
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        int resultado;
        
        resultado = factorial(2);
        System.out.println("Resultado: " + resultado);
    }
}
