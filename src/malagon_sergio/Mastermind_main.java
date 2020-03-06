/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malagon_sergio;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Mastermind_main {

//creo los colores
    /**
     *
     */
    public static final String ANSI_DEFECTO = "\u001B[0m";

    /**
     *
     */
    public static final String ANSI_ROJO = "\u001B[31m";

    /**
     *
     */
    public static final String ANSI_VERDE = "\u001B[32m";

    /**
     *
     */
    public static final String ANSI_AMARILLO = "\u001B[33m";

    /**
     *
     */
    public static final String ANSI_AZUL = "\u001B[34m";

    /**
     *
     */
    public static final String ANSI_MORADO = "\u001B[35m";

    /**
     *
     */
    public static final String ANSI_CYAN = "\u001B[36m";

//muestro las instrucciones del juego mas una pequeña leyenda 
    /**
     * muestra la introduccion del juego al principio de la partida
     */
    public static void introduccion() {
        String espacios = " ";
        String asteriscos = "***************************************************";
        System.out.println("Bienvenido a MasterMind");
        System.out.println(espacios);
        System.out.println(asteriscos);
        System.out.println("|                     REGLAS                      |");
        System.out.println(asteriscos);
        System.out.println("1. El juego consiste en adivinar los colores en las posiciones correctas. ");
        System.out.println("2. Por cada color hacertado y que ademas este en la posicion, se colocara un circulo negro.");
        System.out.println("3. Por cada color hacertado pero que no este en su posicion, se colocara un circulo blanco.");
        System.out.println("4. Por cada color fallado no se colocara nada. ");
        System.out.println("5. El juego acaba cuando haciertas los 4 colores en sus posiciones o has consumido 12 intentos.");
        System.out.println(espacios);
        System.out.println(asteriscos);
        System.out.println("|                     LEYENDA                     |");
        System.out.println(asteriscos);
        System.out.println("1 --> ROJO               |");
        System.out.println("2 --> AMARILLO           | ● --> COLOR HACERTADO Y EN LA POSICION");
        System.out.println("3 --> VERDE              | ◓ --> COLOR HACERTADO PERO NO EN LA POSICION");
        System.out.println("4 --> AZUL               | ○ --> COLOR FALLADO");
        System.out.println("5 --> CYAN               |");
        System.out.println("6 --> MORADO             |");
    }

    /**
     * genero 4 numeros aleatorios y los meto en un array de tipo int
     *
     * @return devuelve los colores generados en un array de tipo entero
     */
    public static int[] numerosAleatoriosArray() {

        int[] colores = new int[4];
        Random r = new Random();
        for (int i = 0; i < colores.length; i++) {
            colores[i] = r.nextInt(6) + 1;
        }
        return colores;
    }

    /**
     * compruebo que los datos de entrada del jugador esten bien
     *
     * @return devuelve un String con los colores del jugador
     */
    public static String pedirString() {
        String aux;
        Scanner teclado = new Scanner(System.in);
        do {
            aux = teclado.nextLine();
            if (aux.matches("([1-6])-([1-6])-([1-6])-([1-6])")) {
            } else {
                System.out.println("Error");
            }
        } while (!aux.matches("([1-6])-([1-6])-([1-6])-([1-6])"));

        return aux;
    }

    /**
     * pido los datos al jugador y los guardo en un array de tipo string
     *
     * @return devuleve un array de String con los colores del jugador
     */
    public static String[] pedirIntSplitString() {
        String string;
        String[] parts;
        System.out.print("Introduce los numeros separados por - entre ellos: ");
        string = pedirString();
        parts = string.split("-");
        Arrays.toString(parts);
        return parts;
    }

    /**
     * convierto el array de string a array de enteros
     *
     * @param coloresEntrada array de entero para llenarlo con los colores del
     * jugador una vez convertidos de array de String
     */
    public static void copiarStringArrayAEntero(int[] coloresEntrada) {
        String[] aux = pedirIntSplitString();
        for (int i = 0; i < coloresEntrada.length; i++) {
            coloresEntrada[i] = Integer.parseInt(aux[i]);
        }
    }

    /**
     * compruebo si los colores introducidos corresponden exactamente con los
     * aleatorios para poder salir del bucle y finalizar la partida
     *
     * @param coloresJugador array de enteros con los colores introducidos por el jugador
     * @param coloresAleatorio array de enteros con los colores aleatorios
     * @return devuelve un true si el jugador hacierta todos los colores en
     * todas las posiciones correctas
     */
    public static boolean todoBien(int[] coloresJugador, int[] coloresAleatorio) {
        return Arrays.equals(coloresJugador, coloresAleatorio);
    }

    /**
     * comprueba si cada color esta en el array aunque no este en el lugar
     *
     * @param colorJugador array de enteros con los colores introducidos por el jugador
     * @param colorAleatorio array de enteros con los colores aleatorios
     * @param i entero para indicar la posion en el array que estoy comprobando
     * @return devuelve verdadero si encuentra algun color aunque no este en su
     * posicion
     */
    public static boolean estaEnElArray(int[] colorJugador, int[] colorAleatorio, int i) {
        boolean test = false;
        int r;
        r = Arrays.binarySearch(colorAleatorio, colorJugador[i]);
        if (r >= 0) {
            test = true;
        }
        return test;
    }

    /**
     * compruebo si el color coincide exactamente con su posicion en el array
     * aleatorio
     *
     * @param coloresJugador array de enteros con los colores introducidos por el jugador
     * @param colorAleatorio array de enteros con los colores aleatorios
     * @param i entero para indcar la posicion en el array que estoy comprobando
     * @return devueleve verdadero si aciertas un color en su posicion
     */
    public static boolean posicionExacta(int[] coloresJugador, int[] colorAleatorio, int i) {
        return coloresJugador[i] == colorAleatorio[i];
    }

    /**
     * compruebo si cada color esta en el array y en la posicion, o esta en el
     * array pero no en la posicion o simplemente no esta.
     *
     * @param coloresJugador array de enteros con los colores del jugador
     * @param colorAleatorio array de enteros con los colores aleatorios
     * @return devuelve en un String todos los circulos de comprobacion
     */
    public static String busqueda(int[] coloresJugador, int[] colorAleatorio) {
        String circulosColores = "";
        boolean exacto;
        boolean index;
        int circuloBlanco = 0, noCirculo = 0, circuloNegro = 0;
        for (int i = 0; i < coloresJugador.length; i++) {
            exacto = posicionExacta(coloresJugador, colorAleatorio, i);
            index = estaEnElArray(coloresJugador, colorAleatorio, i);
            if (exacto) {
                circuloNegro++;
            } else if (index) {
                circuloBlanco++;
            } else {
                noCirculo++;
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int negro = 0; negro < circuloNegro; negro++) {
                circulosColores += "●";

            }
            for (int blanco = 0; blanco < circuloBlanco; blanco++) {
                circulosColores += "◓";
            }
            for (int nada = 0; nada < noCirculo; nada++) {
                circulosColores += "○";
            }
        }
        return circulosColores;
    }

    /**
     * convierto los numeros introducidos por el jugador a colores para
     * mostrarlos en un tablero
     *
     * @param colorJugador array de enteros con los colores introducidos por el jugador
     * @return devuelve un String con todos los circulos coloreados para
     * mostrarlos en una tabla
     */
    public static String numeroJugadorColores(int[] colorJugador) {
        String jugadorColores = "";
        for (int i = 0; i < 1; i++) {
            for (int h = 0; h < colorJugador.length; h++) {
                if (colorJugador[h] == 1) {
                    jugadorColores += ANSI_ROJO + "●" + ANSI_DEFECTO;
                    continue;
                }
                if (colorJugador[h] == 2) {
                    jugadorColores += ANSI_AMARILLO + "●" + ANSI_DEFECTO;
                    continue;
                }
                if (colorJugador[h] == 3) {
                    jugadorColores += ANSI_VERDE + "●" + ANSI_DEFECTO;
                    continue;
                }
                if (colorJugador[h] == 4) {
                    jugadorColores += ANSI_AZUL + "●" + ANSI_DEFECTO;
                    continue;
                }
                if (colorJugador[h] == 5) {
                    jugadorColores += ANSI_CYAN + "●" + ANSI_DEFECTO;
                    continue;
                }
                if (colorJugador[h] == 6) {
                    jugadorColores += ANSI_MORADO + "●" + ANSI_DEFECTO;

                }
            }

        }
        return jugadorColores;
    }

    /**
     * creo el tablero del juego donde muestro tanto los colores introducidos
     * por el jugador como los circulos de las comprobaciones
     *
     * @param colorJugador array de enteros con los colores introducidos por el jugador
     * @param colorComprobacion array de enteros con los circulos de comprobacion
     * @param contador entero que sirve de contador de fallos
     */
    public static void tableroJuego(int[] colorJugador, int[] colorComprobacion, int contador) {
        String aux = numeroJugadorColores(colorJugador);
        String aux2 = busqueda(colorJugador, colorComprobacion);
        String bordes = "--------------------------------";
        String espacios = "|                              |";
        String contenido = "|      " + aux + "   |   " + aux2 + "      |";
        if (contador == 0) {
            System.out.println(bordes);
            System.out.println(bordes);
            System.out.println(espacios);
            System.out.println(contenido);
            System.out.println(espacios);
        } else if (contador > 0 && contador < 11) {
            System.out.println(espacios);
            System.out.println(contenido);
            System.out.println(espacios);
        } else {
            System.out.println(espacios);
            System.out.println(contenido);
            System.out.println(espacios);
            System.out.println(bordes);
            System.out.println(bordes);
        }

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] aleatorio;
        int[] coloresEntrada = new int[4];
        int w = 0;
        boolean todoPiola;
        aleatorio = numerosAleatoriosArray();
        introduccion();
        todoPiola = todoBien(coloresEntrada, aleatorio);
        //System.out.println("Numero aleatorio generado " + Arrays.toString(aleatorio));
        do {
            copiarStringArrayAEntero(coloresEntrada);
            if (todoPiola) {
                break;
            } else {
                tableroJuego(coloresEntrada, aleatorio, w);
                w++;
            }
            if (w == 12) {
                break;
            }

        } while (!Arrays.equals(coloresEntrada, aleatorio));
        if (w == 12) {
            System.out.println("Has perdido");
        } else {
            System.out.println("Has ganado, felicidades");
        }
        {

        }
    }
}
