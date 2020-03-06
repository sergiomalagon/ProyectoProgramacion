/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.garaje;

/**
 *
 * @author Vespertino
 */
public class Taller {

    private Coche coche;
    private String averiaAsociada;
    private int numeroCoches;
    private boolean aceptarCoche;

    

    public String getAveriaAsociada() {
        return averiaAsociada;
    }

    public boolean aceptarCoche(Coche coche, String averiaAsociada) {
        int aux;
        if (this.aceptarCoche = true) {
            aceptarCoche = false;
            this.coche = coche;
            this.coche.acumularAveria(Math.random() * 1000);
            if (averiaAsociada.equals("aceite")) {
                aux = this.coche.getMotor().getAceite() + 10;
                coche.getMotor().setAceite(aux);
            }
            return true;
        } else {
            return false;
        }

    }

    public boolean devolverCoche(Coche coche) {
        if (this.aceptarCoche = false) {
            aceptarCoche = true;
            return true;
        } else {
            return false;
        }

    }
}
