/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.calculadorainterfaz.main;

import tema11.calculadorainterfaz.controlador.CCalculadora;
import tema11.calculadorainterfaz.modelo.MCalculadora;
import tema11.calculadorainterfaz.vista.VCalculadora;

/**
 *
 * @author Sergio
 */
public class Run {

    public static void main(String[] args) {
        MCalculadora modelo = new MCalculadora();
        VCalculadora vista = new VCalculadora();
        CCalculadora controlador = new CCalculadora(vista, modelo);
        vista.setControlador(controlador);
        vista.mostrar();
    }
}
