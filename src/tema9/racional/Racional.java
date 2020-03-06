/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.racional;

/**
 *
 * @author Vespertino
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {

    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public Racional suma(Racional f) {
        Racional aux = new Racional();
        int numerador, denominador;
        numerador = f.getNumerador();
        denominador = f.getDenominador();
        if (denominador == this.denominador) {
            aux.setNumerador(numerador + this.numerador);
            aux.setDenominador(this.denominador);
        } else {
            aux.setNumerador((numerador * this.denominador) + (this.numerador * denominador));
            aux.setDenominador(denominador * this.denominador);
        }
        simplificar(f);
        return aux;
    }

    public Racional resta(Racional f) {
        Racional aux = new Racional();
        int numerador, denominador;
        numerador = f.getNumerador();
        denominador = f.getDenominador();
        if (denominador == this.denominador) {
            aux.setNumerador(numerador - this.numerador);
            aux.setDenominador(this.denominador);
        } else {
            aux.setNumerador((numerador * this.denominador) - (this.numerador * denominador));
            aux.setDenominador(denominador * this.denominador);
        }
        simplificar(f);
        return aux;
    }

    public Racional multiplicacion(Racional f) {
        Racional aux = new Racional();
        int numerador, denominador;
        numerador = f.getNumerador();
        denominador = f.getDenominador();
        aux.setNumerador(numerador * this.numerador);
        aux.setDenominador(denominador * this.denominador);
        return aux;
    }

    public Racional division(Racional f) {
        Racional aux = new Racional();
        int numerador, denominador;
        numerador = f.getNumerador();
        denominador = f.getDenominador();
        aux.setNumerador(numerador * this.denominador);
        aux.setDenominador(denominador * this.numerador);
        return aux;
    }

    public boolean comparacion(Racional f) {
        Racional aux = new Racional();
        boolean comparacion;
        int numerador, denominador;
        numerador = f.getNumerador();
        denominador = f.getDenominador();
        aux.setNumerador(numerador);
        aux.setDenominador(denominador);
        comparacion = f.equals(aux);
        return comparacion;
    }

    public Racional copia(Racional f) {
        Racional aux = new Racional();
        int numerador, denominador;
        numerador = f.getNumerador();
        denominador = f.getDenominador();
        aux.setNumerador(numerador);
        aux.setDenominador(denominador);

        return f;

    }

    public void setRacional(Racional f) {
        this.setNumerador(f.getNumerador());
        this.setDenominador(f.getDenominador());
    }

    public float calculaReal() {
        float aux;
        aux = numerador / denominador;
        System.out.println(aux);
        return aux;
    }

    public void mostarRacional() {
        System.out.println(getNumerador());
        System.out.println("--------");
        System.out.println(getDenominador());
    }

    private Racional simplificar(Racional f) {
        Racional aux = new Racional();
        int numerador, denominador, auxiliar = 0;
        numerador = f.getNumerador();
        denominador = f.getDenominador();
        while (denominador != 0) {
            auxiliar = denominador;
            denominador = numerador % denominador;
            auxiliar = numerador;
        }
        aux.setNumerador(numerador / auxiliar);
        aux.setDenominador(denominador / auxiliar);

        return aux;
    }
}
