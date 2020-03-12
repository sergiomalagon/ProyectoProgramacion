/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.zelda;

import java.util.Random;

/**
 *
 * @author Sergio
 */
public class Enemigo {

    private int daño;
    private String tipo;
    private int vida;

    public Enemigo() {
        generarEnemigo();
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void generarEnemigo() {
        Random rd = new Random();
        int cucaracha = rd.nextInt(100);
        int muercielago = rd.nextInt(100);
        int necrofago = rd.nextInt(100);
        if (cucaracha < 80) {
            this.tipo = "Cucaracha";
            this.daño = 10;
            this.vida = 15;
        } else if (muercielago < 60) {
            this.tipo = "Murcielago";
            this.daño = 20;
            this.vida = 25;
        } else if (necrofago < 30) {
            this.tipo = "Necrofago";
            this.daño = 30;
            this.vida = 35;
        }
    }
}
