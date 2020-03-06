/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.cliente;

import java.util.Comparator;

/**
 *
 * @author Vespertino
 */
public class OrdenacionPorEdadDeMayorAMenor implements  Comparator<Cliente>{


    @Override
    public int compare(Cliente o1, Cliente o2) {
        int aux;
        return aux= o1.getEdad() - o2.getEdad();
    }


}
