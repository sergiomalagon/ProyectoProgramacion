/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.cuentacorriente;

import tema9.nif.NIF;

/**
 *
 * @author Vespertino
 */
/*Crear cuenta nombre,DNI titular. Saldo inicial sera 0 y el limite de descubierto sera -50
Sacar dinero, solo hasta -50
Ingresar dinero
Mostrar informacion
 */
public class CuentaCorriente {
//Atributos

    private String nombre;
    private NIF nif;
    private double saldo;
    private int descubierto;
//Constructores

    /**
     * Crea una cuenta con saldo=0 y limite descubierto=50
     */
    public CuentaCorriente() {
        saldo = 0;
        descubierto = -50;
    }

    /**
     *
     * @param saldo Saldo inicial en la cuenta
     */
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        descubierto = 0;
    }

    /**
     *
     * @param saldo Saldo inicial en la cuenta
     * @param descubierto Limite descubiero de la cuenta
     * @param nif
     */
    public CuentaCorriente(double saldo, int descubierto, NIF nif) {
        this.descubierto = descubierto;
        this.saldo = saldo;
        this.nif = nif;
    }
//Metodos

    /**
     *
     * @param dineroSacar Dinero que queremos sacar
     */
    public void getDinero(double dineroSacar) {
        if ((saldo - dineroSacar) > descubierto) {
            saldo = saldo - dineroSacar;
        }
    }

    /**
     *
     * @param dineroIngresar Dinero que queremos ingresar
     */
    public void putDinero(double dineroIngresar) {
        saldo = saldo + dineroIngresar;
    }

    @Override
    public String toString() {
        return "CuentaCorriente[" + " dni=" + nif + ", saldo=" + saldo + ']';
    }


}
