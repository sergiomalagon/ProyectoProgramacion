/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Arrays;

/**
 *
 * @author Vespertino
 */
public class Arrays_multideimensionales_cubo {

    public static void main(String[] args) {
        int[][][] num = new int[3][][];
        int aux = 0;
        num[0] = new int[3][];
        num[1] = new int[2][];
        num[2] = new int[1][];
        
        num[0][0] = new int[5];
        num[0][1] = new int[4];
        num[0][2] = new int[2];
        
        num[1][0] = new int[4];
        num[1][1] = new int[4];
        
        num[2][0] = new int[4];

        //rellenar 
        for (int f = 0; f < num.length; f++) {
            for (int c = 0; c < num[f].length; c++) {
                for (int p = 0; p < num[f][c].length; p++) {
                    num[f][c][p] = aux++;
                }
            }
        }
        //mostrar
        for (int f = 0; f < num.length; f++) {
            for (int c = 0; c < num[f].length; c++) {
                for (int p = 0; p < num[f][c].length; p++) {
                    System.out.println(num[f][c][p]);
                }
            }
        }

    }
}
