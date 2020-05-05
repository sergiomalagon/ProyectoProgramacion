/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.calculadorainterfaz.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tema11.calculadorainterfaz.modelo.MCalculadora;
import tema11.calculadorainterfaz.vista.VCalculadora;

/**
 *
 * @author Sergio
 */
public class CCalculadora implements ActionListener {

    private VCalculadora vista;
    private MCalculadora modelo;

    public CCalculadora(VCalculadora vista, MCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float a, b, result;
        a = vista.getDato1();
        b = vista.getDato2();
        switch (vista.getOperacion()) {
            case "+":
                modelo.setD1(a);
                modelo.setD2(b);
                result = modelo.suma();
                vista.setResultado(result);
                break;
            case "-":
                modelo.setD1(a);
                modelo.setD2(b);
                result = modelo.resta();
                vista.setResultado(result);
                break;
            case "*":
                modelo.setD1(a);
                modelo.setD2(b);
                result = modelo.multiplicacion();
                vista.setResultado(result);
                break;
            case "/":
                modelo.setD1(a);
                modelo.setD2(b);
                result = modelo.division();
                vista.setResultado(result);
                break;
            default:
                break;
        }
    }

}
