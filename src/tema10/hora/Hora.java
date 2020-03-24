/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.hora;

/**
 *
 * @author Sergio
 */
public class Hora {

    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void inc() {
        if (this.minutos < 59) {
            this.minutos++;
        } else if (this.minutos == 59) {
            this.hora++;
            this.minutos = 0;
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Introduce una hora entre 0 y 23");
        }

    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;

        } else {
            System.out.println("Introduce un minuto entre 0 y 59");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    @Override
    public String toString() {
        return hora + ":" + minutos;
    }

}
