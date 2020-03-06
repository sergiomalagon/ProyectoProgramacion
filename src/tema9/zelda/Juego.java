/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.zelda;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Juego {

    private Transformar transformar;
    private Habitacion habitacionActual;
    private Enemigo enemigo;
    private Espada espada;
    private Inventario inventario;
    private Llave llave;
    private Link link;

    public Juego() {
        transformar = new Transformar();
        enemigo = new Enemigo();
        espada = new Espada();
        inventario = new Inventario();
        llave = new Llave();
        link = new Link();
        habitacionActual = new Habitacion("Recibidor");
        crearHabitaciones();
    }

    public void crearHabitaciones() {
        Habitacion pasillo = new Habitacion("Pasillo");
        Habitacion baño = new Habitacion("Baño");
        Habitacion habitacionPrincipal = new Habitacion("Habitacion Principal");
        Habitacion habitacionInvitados = new Habitacion("Habitacion Inivitados");
        Habitacion cocina = new Habitacion("Cocina");
        Habitacion comerdor = new Habitacion("Comedor");

        habitacionActual.setSalida("este", pasillo);

        pasillo.setSalida("norte", baño);
        pasillo.setSalida("este", habitacionInvitados);
        pasillo.setSalida("sur", cocina);

        baño.setSalida("sur", pasillo);
        baño.setSalida("este", habitacionPrincipal);

        habitacionPrincipal.setSalida("oeste", baño);
        habitacionPrincipal.setSalida("sur", habitacionInvitados);
        habitacionPrincipal.setSalida("este", comerdor);

        habitacionInvitados.setSalida("oeste", pasillo);
        habitacionInvitados.setSalida("norte", habitacionPrincipal);
        habitacionInvitados.setSalida("sur", cocina);

        cocina.setSalida("norte", habitacionInvitados);
        cocina.setSalida("este", comerdor);
        cocina.setSalida("sur", pasillo);

        comerdor.setSalida("oeste", habitacionPrincipal);
        comerdor.setSalida("sur", cocina);

    }

    public void jugar() {
        bienvenido();
        while (true) {
            if (habitacionActual.getEnemigo() != null) {
                recibirDaño();
            }
            Comando c = transformar.getCommand();
            procesarComando(c);

        }
    }

    public void bienvenido() {
        System.out.println();
        System.out.println("Bienvenido a The legend of Zelda!");
        System.out.println("Eres Link y tu mision sera encontrar el tesoro del Castillo de Hyrule para rescatar a la Princesa Zelda.");
        System.out.println("Si necesitas ayuda escribe 'ayuda'.");
        System.out.println();
        System.out.println(habitacionActual.getDescripcionLarga());
    }

    public boolean procesarComando(Comando c) {
        switch (c.getComando()) {
            case "ayuda":
                ayuda();
                return true;
            case "ir":
                irA(c);
                return true;
            case "fin":
                fin();
                return true;
            case "atacar":
                atacar();
                return true;
            case "coger":
                coger();
                return true;
            case "inventario":
                inventario();
                return true;
            default:
                break;
        }

        return false;
    }

    public void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void recibirDaño() {
        link.setVida(link.getVida() - enemigo.getDaño());
        System.out.println("Has sido atacado por un " + enemigo.getTipo() + " tu vida actual es: " + link.getVida());
    }

    public void inventario() {
        System.out.println(inventario.mostrarInventario());
    }

    public void coger() {
        if (habitacionActual.getLlave() == null && habitacionActual.getEspada() == null) {
            System.out.println("No hay nada en esta habitacion");
        } else {
            if (habitacionActual.getEspada() != null) {
                inventario.insertEspada();
            }
            if (habitacionActual.getLlave() != null) {
                inventario.insertLlave();
            }
        }

    }

    public void atacar() {
        if (espada.getCalidad() == 0) {
            espada = null;
            System.out.println("La espada se ha roto");
        } else {

            if (habitacionActual.getEnemigo() != null) {
                if (inventario.getEspada() != null) {
                    enemigo = null;
                    System.out.println("Has matado al enemigo");
                } else if (inventario.getEspada() == null) {
                    System.out.println("Golpear al enemigo con tus manos no ha sido tu mejor idea");
                    link.setVida(link.getVida() - 5);
                    System.out.println("Vida actual: " + link.getVida());
                }

            } else if (habitacionActual.getEnemigo() == null) {
                espada.setCalidad(espada.getCalidad() - 1);
                System.out.println("Deja de golpear el aire o acabaras rompiendo tu espada");
            }
        }

    }

    public void ayuda() {
        System.out.println(habitacionActual.getDescripcionLarga());
    }

    public void irA(Comando c) {
        String aux = c.getSegundaPalabra();
        if (c.hayComando() && c.haySegundaPalabra()) {
            if (habitacionActual.getSalida(aux) != null) {
                habitacionActual = habitacionActual.getSalida(c.getSegundaPalabra());
                habitacionActual.tieneEnemigo().tieneLlave().tieneEspada();
                System.out.println(habitacionActual.getDescripcionLarga());
            }
        }
    }

    public void fin() {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Estas seguro que quieres salir? ");
            respuesta = sc.next().toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("Gracias por Jugar");
                return;
            } else if (respuesta.equals("no")) {
                break;
            }
            System.out.println("???");
        } while (!respuesta.equals("si") || !respuesta.equals("no"));

    }

}
