/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ahorcado;

import java.util.HashSet;

/**
 *
 * @author Vespertino
 */
public class Fallos {

    private HashSet listaFallos;

    public Fallos() {
        this.listaFallos = new HashSet<Character>();
    }

    public String mostrarFallos() {
        return this.listaFallos.toString();
    }

    public void añadirLetra(char y) {
        this.listaFallos.add(y);
    }

    public HashSet getListaFallos() {
        return listaFallos;
    }

    public void setListaFallos(HashSet listaFallos) {
        this.listaFallos = listaFallos;
    }


}
