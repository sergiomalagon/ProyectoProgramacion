/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.zelda;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Transformar {

    private Comando comando;
    private StringBuilder lugares;
    private PalabrasComando pc;

    public Transformar() {
        pc = new PalabrasComando();
        comando = null;
        lugares = new StringBuilder();
        lugares.append("norte");
        lugares.append("sur");
        lugares.append("este");
        lugares.append("oeste");
    }

    public Comando getCommand() {
        Scanner sc = new Scanner(System.in);
        String lugar, comando;
        do {
            System.out.print("Introduce el comando [Ayuda, Fin, Ir, Atacar, Coger, Inventario]: ");
            comando = sc.next().toLowerCase();
            if (comando.equals("ir")) {
                do {
                    System.out.print("Introduce una direccion: ");
                    lugar = sc.next().toLowerCase();
                    if (!this.lugares.toString().contains(lugar)) {
                        System.out.println("Esa direccion no existe");
                    }
                } while (!this.lugares.toString().contains(lugar));
                PalabrasComando palabras = new PalabrasComando();
                if (lugares.toString().contains(lugar) && palabras.esComando(comando)) {
                    Comando aux = new Comando(comando, lugar);
                    this.comando = aux;
                    return aux;
                }
            } else if (comando.equals("ayuda")) {
                Comando aux = new Comando(comando, null);
                this.comando = aux;
                return aux;
            } else if (comando.equals("fin")) {
                Comando aux = new Comando(comando, null);
                this.comando = aux;
                return aux;
            } else if (comando.equals("atacar")) {
                Comando aux = new Comando(comando, null);
                this.comando = aux;
                return aux;
            } else if (comando.equals("coger")) {
                Comando aux = new Comando(comando, null);
                this.comando = aux;
                return aux;
            } else if (comando.equals("inventario")) {
                Comando aux = new Comando(comando, null);
                this.comando = aux;
                return aux;
            } else {
                System.out.println("Este comando no esta disponible");
            }
        } while (!lugares.toString().contains(comando) && !pc.esComando(comando));
        return null;

    }
}
