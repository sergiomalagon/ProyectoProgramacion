/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import utilidades.Teclado;

/**
 *
 * @author Vespertino
 */
/*
Escribir un programa que solicite los elementos de una matriz de tamaño 4x4.
La aplicación debe decidir si la matriz introducida corresponde a un matriz
mágica, que es aquella donde la suma de los elementos de cualquier fila
o de cualquier columna valen lo mismo.
 */
public class Matriz_Magica {

    public static void matrizMagica(int[][] matriz) {
        int[][] resultado = new int[matriz.length][2];
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int g : matriz[i]) {
                resultado[i][0] += g;
            }
            System.out.println("[" + i + "]" + "suma: " + resultado[i][0]);
        }

        for (int h = 0; h < matriz.length; h++) {
            for (int i = 0; i < matriz.length; i++) {
                resultado[h][1] += matriz[i][h];
            }
            System.out.println("[" + h + "]" + "suma: " + resultado[h][1]);
        }
        if (resultado[aux][0] == resultado[aux][1]) {
            System.out.println("Es una matriz magica");
        } else {
            System.out.println("No es una matriz magica");
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce 4 colores");
                matriz[i][j] = Teclado.pedirInt();
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");
        }

        matrizMagica(matriz);

    }
}
