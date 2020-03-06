
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.text.DecimalFormat;



/**
 *
 * @author Vespertino
 */

/*
1. Realizar un programa en Java con una función que reciba un número n y muestre por pantalla
n veces el mensaje “Eco...”
2. Escribir una función a la que se le pasen dos enteros y muestre todos los números
comprendidos entre ellos.
3. Diseñar una función que reciba como parámetros dos números enteros y que devuelva el
máximo (el mayor de los dos)
4. Realizar una función que calcule y muestre el área o el volúmen de un cilintro, según se
especifique en un menú. Para distinguir un caso de otro se le pasará un número 1 (para el
área) y un 2 (para el volumen).
Las fórmulas a utilizar son:
área = 2PI * radio * (altura+radio)
volumen =PI * radio * radio * altura
*/
public class Ej1234 {

    public static void eco(int n) {
        int aux=0;
        for (; n > aux; aux++) {
            System.out.println(n);
        }

    }

    public static void todoslosnumeros(int a, int b) {
        
        do{
            System.out.println(a);
            a++;
        }while(a<=b);
    }

    
    public static int numeromaximo(int a, int b){
        int aux;
        
        if(a>b){
            aux = a;
        }else{
            aux = b;
        }
        return aux;
    }


    public static double areavolumen(int aux,double radio, double altura) {
        double area;
        double volumen;
        area =  ((2*3.14)*(radio*(altura+radio)));
        volumen =  3.14*(radio*radio)*altura;
        
        if(aux==1){
          return  volumen;  
            
        }else{
            return area;
        }
        
        
    }


    public static void main(String[] args) {
        int sergio;
        double areavolumen;
        DecimalFormat formato;
        
        sergio = numeromaximo(5, 19);
        System.out.println("El mayor es el: " + sergio);
        
        eco(8);
        todoslosnumeros(1, 10);
        areavolumen = areavolumen(1, 5, 9);
        formato = new DecimalFormat("0.00");
        System.out.println("El area y el volumen son: " + formato.format(areavolumen));
    }

}
