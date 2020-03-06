/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.cuentacorriente;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class RunCuentaCorriente {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        CuentaCorriente es = new CuentaCorriente();
        es.putDinero(60);
        es.getDinero(5);
        es.toString();
    }
}
