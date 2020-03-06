/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Sergio
 */
public class Letras {

    public static int numeroCaracteres(String palabra) {
        int numerocaracteres;
        numerocaracteres = palabra.length();
        return numerocaracteres;
    }

    public static char ultimoCaracter(String palabra) {
        char ultimo;
        int index = palabra.length() - 1;
        ultimo = palabra.charAt(index);
        return ultimo;
    }

    public static String invertirCadenaString(StringBuilder frase) {
        StringBuilder sb = new StringBuilder();
        int i = frase.length() - 1;
        while (i > -1) {
            sb.append(frase.charAt(i));
            i--;
        }
        return sb.toString();
    }
}
