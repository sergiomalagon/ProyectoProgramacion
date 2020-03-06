/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import utilidades.Teclado;
import utilidades.Juegoo;

/**
 *
 * @author Vespertino
 */
public class Juego {

    public static void main(String[] args) {
        //declaramos todas las variables
        String cadena, letra, cadenaSinEspacios, cadenaBuena;
        StringBuilder fallos = new StringBuilder();
        StringBuilder letrasGuiones;
        StringBuilder sustituir;
        StringBuilder fallo;
        char charLetra;
        int i = 0;
        boolean comprobarLetra;
        boolean comprobarLetraYaPuesta;
        boolean comprobarLetraYaPuestaFallos;
        //pedimos al usuario que introduzca la palabra clave o frase clave
        do {
            System.out.println("Introduce una palabra secreta (minimo 4 letras)");
            System.out.println("o");
            System.out.println("Introduce una frase secreta (maximo dos palabras)");
            cadena = Teclado.tecladoStringNextLine();
        } while (!cadena.matches("\\w{2,}?\\s?\\w{2,}?"));
        //elimino los espacios innecesarios a los lados
        cadenaSinEspacios = cadena.trim();
        // convertimos los espacios a guiones
        cadenaBuena = cadenaSinEspacios.replace(' ', '_');
        letrasGuiones = Juegoo.letrasAGuiones(cadenaBuena);
        //limpiamos la zona para que el otro jugador no vea la palabra clave que se ha introducido
        Juegoo.limpiarZona();
        do {
        //mostramos la horca
            Juegoo.mostrarHorca(i);

            if (i == 6) {
                break;
            }
        //pedimos al jugador que introduzca una letra o un guion si cree que se ha introducido una frase y no una palabra
            do {
                System.out.println("Introduce una letra (utiliza _ para indicar un espacio)");
                letra = Teclado.tecladoString();
            } while (!letra.matches("\\D||_"));
            charLetra = letra.charAt(0);
            //inicializamos todas las variables
            comprobarLetra = Juegoo.comprobarLetra(charLetra, cadenaBuena);
            comprobarLetraYaPuesta = Juegoo.comprobarLetraYaPuesta(charLetra, letrasGuiones);
            comprobarLetraYaPuestaFallos = Juegoo.comprobarLetraYaPuestaFallos(charLetra, fallos);
            sustituir = Juegoo.sustituirLetra(cadenaBuena, letrasGuiones, charLetra);
            fallo = Juegoo.fallos(charLetra, fallos, letrasGuiones);
            //comprobamos si la letra introducida esta dentro de la palabra y si ademas no la hemos introducido antes
            if (comprobarLetra) {
                if (comprobarLetraYaPuesta) {
                    System.out.println("Ya has introducido esa letra");
                } else if (!comprobarLetraYaPuesta) {
                    System.out.println(sustituir);
                }
                if (i == 6) {
                    break;
                }
            //si la letra no se hacierta se suma 1 al contador para mostrar la siguiente posicion de la horca
            //adema de eso añadimos la letra fallada a una lista para que el jugador las tenga en cuenta
            //si el jugador intenta introducir una letra que esta en dicha lista, el juego le avisara
            } else {
                i++;
                if (comprobarLetraYaPuestaFallos) {
                    System.out.println("Ya has introducido esa letra");
                } else {
                    System.out.println("FALLO");
                    System.out.println("Letras ya introducidas que no sirven: " + fallo);
                }
            }
        //condicion para salir del bucle    
        } while (!letrasGuiones.toString().equals(cadenaBuena) || i == 6);
        if (i == 6) {
            System.out.println("HAS MUERTO");
        } else {
            System.out.println("HAS SOBREVIVIDO");
        }
    }
}
