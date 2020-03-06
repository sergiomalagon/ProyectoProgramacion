/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */

/*
Pedir un numero entero al usuaurio entre 0 y 99999(incluidos) y calcular y
mostrar por pantalla si el numero es capicu
 */
public class Ej11 {

    public static void main(String[] args) {

        int numero;
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        int resultado1;
        int resultado2;
        int resultado3;
        int resultado4;
        int resultado5;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre [0 y 99999]: ");
        numero = teclado.nextInt();

        numero1 = numero % 10;
        resultado1 = numero / 10;

        numero2 = resultado1 % 10;
        resultado2 = resultado1 / 10;

        numero3 = resultado2 % 10;
        resultado3 = resultado2 / 10;

        numero4 = resultado3 % 10;
        resultado4 = resultado3 / 10;

        numero5 = resultado4 % 10;
        resultado5 = resultado4 / 10;

if(numero>0 && numero<99999){
            if(numero1==numero5 && numero2==numero4){
                System.out.println("ES UN NUMERO CAPICUA");
            }
            else if(numero1==numero4 && numero2==numero3){
                System.out.println("ES UN NUMERO CAPICUA");
            }
            else if(numero1==numero3){
                System.out.println("ES UN NUMERO CAPICUA");
            }
            else if(numero1==numero2){
                System.out.println("ES UN NUMERO CAPICUA");
            }
            else if(numero1!=numero5 && numero2!=numero4){
                System.out.println("EL NUMERO NO ES CAPICUA");
            } 
}
        else{
            System.out.println("INTRODUCE UN NUMERO ENTRE 0 Y 99999");
        }
        
        
        
        
        
        
        
        
        
    }
}

/*
        55555
        n1 / 5 = 55555%10;
         r1/5555= 55555/10;
         
        n2/ 5= 5555%10;
         r2/555=5555/10;
         
        n3/ 5= 555%10;
         r3/55=555/10;
         
        n4/ 5= 55%10;
         r4/55= 55/10;
        
 */
//         System.out.println(numero);
//         System.out.println(numero1);
//         System.out.println(numero2);
//         System.out.println(numero3);
//         System.out.println(numero4);
//         System.out.println(numero5);
//        
//        if(numero<0 && numero>99999){
//            System.out.println("INTRODUCE UN NUMERO ENTRE 0 Y 99999");
//        }
//            else(numero1==numero5 && numero2==numero4){
//            System.out.println();
//    }
//     }

