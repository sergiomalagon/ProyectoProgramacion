/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.zelda;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Vespertino
 */
public class Habitacion {

    private String descripcion;
    private Habitacion salidaNorte, salidaSur, salidaEste, salidaOeste;
    private HashSet aux;
    private Llave llave;
    private Enemigo enemigo;
    private Espada espada;

    public Habitacion(String descripcion) {
        aux = new HashSet<String>();
        this.descripcion = descripcion;
    }

    public void setSalida(String direccion, Habitacion habitacion) {
        switch (direccion.toLowerCase()) {
            case "norte":
                this.salidaNorte = habitacion;
                break;
            case "sur":
                this.salidaSur = habitacion;
                break;
            case "este":
                this.salidaEste = habitacion;
                break;
            case "oeste":
                this.salidaOeste = habitacion;
                break;
            default:
                break;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Habitacion tieneLlave() {
        Random rd = new Random();
        int aux = rd.nextInt(100);
        if (aux < 30) {
            Habitacion hb = new Habitacion(descripcion);
            llave = new Llave();
            return hb;
        } else {
            Habitacion hb = new Habitacion(descripcion);
            llave = null;
            return hb;
        }

    }

    public Habitacion tieneEnemigo() {
        Random rd = new Random();
        int aux = rd.nextInt(100);
        if (aux < 50) {
            Habitacion hb = new Habitacion(descripcion);
            enemigo = new Enemigo();
            return hb;
        } else {
            Habitacion hb = new Habitacion(descripcion);
            enemigo = null;
            return hb;
        }
    }

    public Habitacion tieneEspada() {
        Random rd = new Random();
        int aux = rd.nextInt(100);
        if (aux <= 100) {
            Habitacion hb = new Habitacion(descripcion);
            espada = new Espada();
            return hb;
        } else {
            Habitacion hb = new Habitacion(descripcion);
            espada = null;
            return hb;
        }
    }

    public Espada getEspada() {
        return espada;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }

    public Llave getLlave() {
        return llave;
    }

    public void setLlave(Llave llave) {
        this.llave = llave;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public String getStringSalidas() {
        if (this.salidaNorte != null) {
            aux.add("Norte");
        }
        if (this.salidaEste != null) {
            aux.add("Este");
        }
        if (this.salidaSur != null) {
            aux.add("Sur");
        }
        if (this.salidaOeste != null) {
            aux.add("Oeste");
        }
        return aux.toString();
    }

    public String getDescripcionLarga() {
        String habitacionDecripcion;
        return habitacionDecripcion = "Estas en " + "<" + this.descripcion + ">" + " y las salidas posibles son: " + getStringSalidas();

    }

    public Habitacion getSalida(String direccion) {
        Habitacion aux = new Habitacion(descripcion);
        if (direccion.toLowerCase().equals("norte") && this.salidaNorte != null) {
            return this.salidaNorte;
        }
        if (direccion.toLowerCase().equals("este") && this.salidaEste != null) {
            return this.salidaEste;
        }
        if (direccion.toLowerCase().equals("sur") && this.salidaSur != null) {
            return this.salidaSur;
        }
        if (direccion.toLowerCase().equals("oeste") && this.salidaOeste != null) {
            return this.salidaOeste;
        }
        return null;
    }

}
