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
/*

 */
public class PalabrasComando {

    private StringBuilder comandos;

    public PalabrasComando() {
        comandos = new StringBuilder();
        this.comandos.append("ir");
        this.comandos.append("fin");
        this.comandos.append("ayuda");
        this.comandos.append("atacar");
        this.comandos.append("coger");
        this.comandos.append("inventario");
    }

    public boolean esComando(String comando) {
        return this.comandos.toString().contains(comando);
    }

    @Override
    public String toString() {
        return "PalabrasComando{" + "comandos=" + comandos + '}';
    }

}
