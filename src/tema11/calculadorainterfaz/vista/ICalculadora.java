/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.calculadorainterfaz.vista;

import tema11.calculadorainterfaz.controlador.CCalculadora;

/**
 *
 * @author Sergio
 */
public interface ICalculadora {
    public float getDato1();
    public float getDato2();
    public String getOperacion();
    public void setResultado(float f);
    
    public abstract  void setControlador(CCalculadora cc);
    public abstract void mostrar();
}
