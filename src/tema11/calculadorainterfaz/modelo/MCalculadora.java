/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.calculadorainterfaz.modelo;

/**
 *
 * @author Sergio
 */
public class MCalculadora {

    private float d1, d2;

    public MCalculadora() {
        d1 = d2 = 0;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float suma() {
        return this.d1 + this.d2;
    }

    public float resta() {
        return this.d1 - this.d2;
    }

    public float multiplicacion() {
        return this.d1 * this.d2;
    }

    public float division() {
        return this.d1 / this.d2;
    }

}
