/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Sergio
 */

/*
Programar las siguientes expresiones regulares:
1) Coincida con “Hola” o “hola”
2) Contenga “pepe” dentro de una cadena
3) Coincida con un dominio tipo “caracteres.caracteres.caracteres”
4) Coincida con un dominio tipo “caracteres.caracteres.xxx”. Donde xxx sean únicamente tres
caracteres
5) Introduzca una cifra de dos dígitos
6) Que la cadena introducida contenga una @
7) Introduzca tres números de dos dígitos separados por espacios. Ejem “99 99 99”
8) Coincida con una fecha tipo “99/99/9999”
*/
public class Ej13 {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = "Hola pepe que tal";
        String s3 = "www.youtube.com";
        String s4 = "www.youtube.com";
        String s5 = "34";
        String s6 = "@sergio";
        String s7 = "77 77 77";
        String s8 = "21/04/2019";
        
        System.out.println("S1: " + s1.matches("[Hh]ola{1}"));
        System.out.println("S2: " + s2.matches(".*(pepe).*"));
        System.out.println("S3: " + s3.matches("\\w*\\.\\w*\\.\\w{1,}\\D"));
        System.out.println("S4: " + s4.matches("\\w*\\.\\w*\\.\\w{3}"));//mejor el . para que no pinche al poner @ por ejemplo
        System.out.println("S5: " + s5.matches("\\d{2}"));
        System.out.println("S6: " + s6.matches(".*(@).*"));
        System.out.println("S7: " + s7.matches("\\d{2}\\s\\d{2}\\s\\d{2}"));
        System.out.println("S8: " + s8.matches("\\d{1,2}/\\d{1,2}/\\d{2,4}"));
        
        
    }
}
