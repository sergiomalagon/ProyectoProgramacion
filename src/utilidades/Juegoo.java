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
public class Juegoo {

    public static int mostrarHorca(int intentos) {

        switch (intentos) {
            case 0:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 1:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 2:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|        |");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 3:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 4:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|--");
                System.out.println("|");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 5:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|--");
                System.out.println("|       /");
                System.out.println("--------------");
                System.out.println(" ");
                break;
            case 6:
                System.out.println(" ");
                System.out.println("----------");
                System.out.println("|        |");
                System.out.println("|        o");
                System.out.println("|      --|--");
                System.out.println("|       / \\");
                System.out.println("--------------");
                System.out.println(" ");
                break;
        }
        return intentos;
    }

    public static boolean comprobarLetra(char letra, String palabra) {
        int aux = palabra.indexOf(letra);
        return aux != -1;
    }

    public static boolean comprobarLetraYaPuesta(char letra, StringBuilder palabra) {
        String letre;
        letre = Character.toString(letra);
        int aux = palabra.indexOf(letre);
        return aux != -1;
    }

    public static boolean comprobarLetraYaPuestaFallos(char letra, StringBuilder palabra) {
        String letre;
        letre = Character.toString(letra);
        int aux = palabra.indexOf(letre);
        return aux != -1;
    }

    public static StringBuilder letrasAGuiones(String cadena) {
        StringBuilder zero = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            zero.append("-");
        }
        return zero;
    }

    public static StringBuilder sustituirLetra(String cadena, StringBuilder guiones, char y) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == y) {
                guiones.setCharAt(i, y);
            }
        }
        return guiones;
    }

    public static StringBuilder fallos(char y, StringBuilder aux, StringBuilder guiones) {
        String guion = guiones.toString();
        int aux2 = guion.indexOf(y);
        if (aux2 == -1) {
            if (comprobarLetraYaPuestaFallos(y, aux)) {
            } else {
                aux.append(y);
            }
        } else {

        }
        return aux;
    }

    public static void limpiarZona () {
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
      
    }

}
