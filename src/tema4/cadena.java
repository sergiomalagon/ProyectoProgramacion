/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Vespertino
 */
public class cadena {

    public static void main(String[] args) {
        String s1 = "paxxpa";
        System.out.println("s1: " + s1.matches("(pa){2}"));

        String s2 = "Hola";
        System.out.println("s2: " + s2.matches("[Hh]ola"));
        /*
crear una expresion que compruebe que introducimos dos digitos
         */

        String s3 = "ho";
        System.out.println("s3: " + s3.matches(".{2}"));

        /*
Crear una expresion regular que compruebe que dentro de una cadena se contiene la 
cadena Pepe
         */
        String s4 = "Hola Pepe";
        System.out.println("s4: " + s4.matches(".*(pepe).*"));
        /*
Comrprobar que el usurio introduce in dominio de internet
         */

        String s5 = "Hola";
        System.out.println("s5: " + s5.matches("(www)\\.\\w*\\.\\w{1,}\\D"));
    }
}
