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
        this.letra = ' ';
    }

    public char pedirLetra() {
        Scanner sc = new Scanner(System.in);
        String s;

        do {
            System.out.print("Introduce una letra: ");
            s = sc.next();
            if (!s.matches("[A-Za-z]")) {
                System.out.println("Error ,necesito una letra");
            } else {
                this.letra = s.charAt(0);
            }
        } while (!s.matches("[A-Za-z]"));
        return this.letra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}
