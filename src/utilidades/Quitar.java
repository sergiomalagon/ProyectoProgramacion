/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Vespertino
 */
public class Quitar {

    public static StringBuilder vocales(StringBuilder cadena) {
        char vocales;
        for (int i = 0; i < cadena.length(); i++) {
            vocales = cadena.charAt(i);
            if        (vocales == 'a' || vocales == 'A' || vocales == 'á' || vocales == 'Á'
                    || vocales == 'e' || vocales == 'E' || vocales == 'é' || vocales == 'É'
                    || vocales == 'i' || vocales == 'I' || vocales == 'í' || vocales == 'Í'
                    || vocales == 'o' || vocales == 'O' || vocales == 'ó' || vocales == 'Ó' 
                    || vocales == 'u' || vocales == 'U' || vocales == 'ú' || vocales == 'Ú'
                      ) {
                cadena.replace(i, i + 1, " ");
            }
        }
        return cadena;
    }
    public static StringBuilder consonantes (StringBuilder cadena) {
        char vocales;
        for (int i = 0; i < cadena.length(); i++) {
            vocales = cadena.charAt(i);
            if        (vocales != 'a' || vocales != 'A' || vocales != 'á' || vocales != 'Á'
                    || vocales != 'e' || vocales != 'E' || vocales != 'é' || vocales != 'É'
                    || vocales != 'i' || vocales != 'I' || vocales != 'í' || vocales != 'Í'
                    || vocales != 'o' || vocales != 'O' || vocales != 'ó' || vocales != 'Ó' 
                    || vocales != 'u' || vocales != 'U' || vocales != 'ú' || vocales != 'Ú'
                      ) {
                cadena.replace(i, i + 1, " ");
            }
        }
        return cadena;
    }
}
