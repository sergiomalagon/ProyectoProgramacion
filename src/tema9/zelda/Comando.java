/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.zelda;

/**
 *
 * @author Vespertino
 */
public class Comando {

    private String comando, segundaPalabra;

    public Comando(String comando, String segundaPalabra) {
        this.comando = comando;
        this.segundaPalabra = segundaPalabra;
    }

    public String getComando() {
        return comando;
    }

    public String getSegundaPalabra() {
        return segundaPalabra;
    }

    public boolean hayComando() {
        if (this.comando == null) {
            return false;
        }
        return true;
    }

    public boolean haySegundaPalabra() {
        if (this.segundaPalabra == null) {
            return false;
        }
        return true;
    }

}
