/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.clubnautico;

import java.util.GregorianCalendar;

/**
 *
 * @author Sergio
 */
public class Alquiler {

    private String nombre;
    private String DNI;
    private GregorianCalendar fechaInicial;
    private GregorianCalendar fechaFinal;
    private String posicionAmarre;

    public Alquiler(String nombre, String DNI, GregorianCalendar fechaInicial, GregorianCalendar fechaFinal, String posicionAmarre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "Desconocido";
        }
        if (DNI != null) {
            this.DNI = DNI;
        } else {
            this.DNI = "no DNI";
        }
        if (fechaInicial != null) {
            this.fechaInicial = fechaInicial;
        } else {
            this.fechaInicial = new GregorianCalendar();
        }
        if (fechaFinal != null) {
            this.fechaFinal = fechaFinal;
        } else {
            this.fechaFinal = new GregorianCalendar();
        }
        if (posicionAmarre != null) {
            this.posicionAmarre = posicionAmarre;

        } else {
            this.posicionAmarre = "no tiene posicion";
        }
    }

    public GregorianCalendar getFechaInicial() {
        return fechaInicial;
    }

    public GregorianCalendar getFechaFinal() {
        return fechaFinal;
    }

}
