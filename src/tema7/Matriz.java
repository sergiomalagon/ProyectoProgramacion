/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Sergio
 */
public class Matriz {

    /**
     * Minijuego "Busca el tesoro"
     *
     * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
     * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
     * está el tesoro.
     *
     * @author Luis José Sánchez
     */
// se definen constantes para representar el
// contenido de las celdas
    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;

    public static void main(String[] args) {

        int x;
        int y;
        int[][] cuadrante = new int[5][4];
// inicializa el array
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
// coloca la mina
        int minaX = (int) (Math.random() * 4);
        int minaY = (int) (Math.random() * 3);
        cuadrante[minaX][minaY] = MINA;
// coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int) (Math.random() * 4);
            tesoroY = (int) (Math.random() * 3);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;
// juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
// pinta el cuadrante
            for (y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for (x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");
// pide las coordenadas
            System.out.print("Coordenada x: ");
            x = Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            y = Integer.parseInt(System.console().readLine());
// mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
                    break;
                default:
            }
        } while (!salir);
// pinta el cuadrante
        for (y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for (x = 0; x < 5; x++) {
                switch (cuadrante[x][y]) {
                    case VACIO:
                        c = " ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "x ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n 0 1 2 3 4\n");
    }
}
/*
    public static void main(String[] args) {
        int[][] prueba = new int[3][2]; //array de 3 filas por 2 columnas
        prueba[0][0] = 20;
        prueba[0][1] = 21;
        prueba[1][0] = 67;
        prueba[1][1] = 33;
        prueba[2][0] = 12;
        prueba[2][1] = 7;

        int[][] prueba2 = {{20, 21}, {67, 33}, {12, 7}};

        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba[i].length; j++) {
                System.out.print(prueba[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int i = 0; i < prueba2.length; i++) {
            for (int j = 0; j < prueba2[i].length; j++) {
                System.out.print(prueba2[i][j] + " ");
            }
            System.out.println(" ");
        }
 */
