/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Vespertino
 */
public class Ej7_relllenar_y_mostrar_matriz {
    // Rellena una tabla con los valores fila+columna
    public static void rellenaNMasM(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }
    }
    // Muestra todos los elementos de una tabla
    public static void muestraMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        
        rellenaNMasM(matriz);
        muestraMatriz(matriz);
        
    }
}
