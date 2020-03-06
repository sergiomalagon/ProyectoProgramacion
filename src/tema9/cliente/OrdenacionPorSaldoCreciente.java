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
public class OrdenacionPorSaldoCreciente implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        int aux = 0;
        if (o1.getSaldo() > o2.getSaldo()) {
            return 1;
       } else if (o1.getSaldo() < o2.getSaldo()) {
            return -1;
        }
        return 0;
    }

}
