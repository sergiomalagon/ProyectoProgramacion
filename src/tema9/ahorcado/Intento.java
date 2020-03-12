/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ahorcado;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Intento {

    private char letra;

    public Intento() {
        this.letra=' ';
    }

    public void pedirLetra() {
        String aux;
        System.out.println("Introduce una letra");
        Scanner sc = new Scanner(System.in);
        aux = sc.next().toLowerCase();
        this.letra = aux.charAt(0);
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}
