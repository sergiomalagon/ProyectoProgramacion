/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.zelda;

import java.util.HashSet;

/**
 *
 * @author Sergio
 */
public class Inventario {

    private final HashSet objetosInventario, auxInventario;
    private Llave llave;
    private Espada espada;

    public Llave getLlave() {
        return llave;
    }

    public void setLlave(Llave llave) {
        this.llave = llave;
    }

    public Espada getEspada() {
        return espada;
    }

    public void setEspada(Espada espada) {
        this.espada = espada;
    }

    public Inventario() {
        this.auxInventario = new HashSet<String>();
        this.objetosInventario = new HashSet<>();
    }

    public void insertEspada() {
        this.objetosInventario.add(this.espada);
        this.auxInventario.add("Espada");
    }

    public void insertLlave() {
        this.objetosInventario.add(this.llave);
        this.auxInventario.add("Llave");
    }

    public String mostrarInventario() {
        return "Inventario: " + auxInventario.toString();

    }

}
