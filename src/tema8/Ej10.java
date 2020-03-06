/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.*;

/**
 *
 * @author Vespertino
 */
/*
Realiza un programa en Java donde vamos a ir analizando un String para verificar si es
equilibrada o no en símbolos de paréntesis, recorriendo todos sus caracteres desde el inicio
hasta el final. Para ello crea un método que recoja un String y devuelva un lógico.
*/
public class Ej10 {

    public static boolean esEsquilibrada(String formula) {
        Stack pila = new Stack();
        boolean respuesta;
        int cerrarP = 0, abrirP = 0;
        String[] dividir;
        dividir = formula.split("");

        for (String dividir1 : dividir) {
            pila.push(dividir1);
            if (pila.peek().equals("(")) {
                abrirP++;
            }
            if (pila.peek().equals(")")) {
                cerrarP++;
            }
        }
        respuesta = abrirP == cerrarP;
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String formula;
        System.out.println("Introduce la formula");
        formula = t.nextLine();
        boolean respuesta = esEsquilibrada(formula);
        System.out.println(respuesta);
    }
}
