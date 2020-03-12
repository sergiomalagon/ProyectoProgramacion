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

    public Guiones() {
        this.guiones = new StringBuilder();
        this.fallos =new Fallos();
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
        String[] selector = new String[]{"platano", "perro", "casa", "coche", "gato", "avion"};
        String palabraSecreta = selector[aux];
        this.palabraSecreta = palabraSecreta;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public StringBuilder getGuiones() {
        return guiones;
    }

    public void setGuiones(StringBuilder guiones) {
        this.guiones = guiones;
    }

    public Fallos getFallos() {
        return fallos;
    }

    public void setFallos(Fallos fallos) {
        this.fallos = fallos;
    }

    public Horca getHorca() {
        return horca;
    }

    public void setHorca(Horca horca) {
        this.horca = horca;
    }
    

}
