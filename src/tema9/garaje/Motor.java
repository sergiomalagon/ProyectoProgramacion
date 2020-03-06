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
public class Motor {

    private int aceite, cv;

    public Motor(int cv) {
        this.cv = cv;
        this.aceite = 0;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    public int getCv() {
        return cv;
    }

    @Override
    public String toString() {
        return '[' + "aceite=" + aceite + ", cv=" + cv + ']';
    }


}
