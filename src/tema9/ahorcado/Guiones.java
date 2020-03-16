/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ahorcado;

import java.util.Random;

/**
 *
 * @author Vespertino
 */
public class Guiones {

    private String palabraSecreta;
    private StringBuilder guiones;
    private Fallos fallos;
    private Horca horca;
    private Intento intento;

    public Guiones() {
        this.intento = new Intento();
        this.guiones = new StringBuilder();
        this.fallos = new Fallos();
        this.horca = new Horca();
        damePalabraAleatoria();
        generarGuiones();
    }

    public StringBuilder generarGuiones() {
        for (int i = 0; i < this.palabraSecreta.length(); i++) {
            this.guiones.append('-');
        }
        return this.guiones;
    }

    public void damePalabraAleatoria() {
        Random rd = new Random();
        int aux = rd.nextInt(6);
        String[] selector = new String[]{"platano", "moto", "casa", "coche", "gato", "avion"};
        String palabraSecreta = selector[aux];
        this.palabraSecreta = palabraSecreta;
    }

    public boolean comprobarLetra(char letra) {
        int aux = this.palabraSecreta.indexOf(letra);
        return aux != -1;
    }

    public StringBuilder sustituirLetra(char y) {
        for (int i = 0; i < this.guiones.length(); i++) {
            if (this.palabraSecreta.charAt(i) == y) {
                this.guiones.setCharAt(i, y);
            }
        }
        return this.guiones;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public String mostrar() {
        return guiones.toString();
    }

    public StringBuilder getGuiones() {
        return guiones;
    }

}
