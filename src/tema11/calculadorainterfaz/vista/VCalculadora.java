/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.calculadorainterfaz.vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import tema11.calculadorainterfaz.controlador.CCalculadora;

/**
 *
 * @author Sergio
 */
public class VCalculadora extends JFrame implements ICalculadora {
    
    private JTextField jtxtDato1, jtxtDato2;
    private JComboBox jOperacion;
    private JLabel jlbResultado;
    private JButton jbCalcular;
    private CCalculadora controlador;
    
    public VCalculadora() {
        jtxtDato1 = new JTextField();
        jtxtDato2 = new JTextField();
        String[] op = {"+", "-", "*", "/"};
        jOperacion = new JComboBox(op);
        jlbResultado = new JLabel("0");
        jbCalcular = new JButton("Calcular");
        getContentPane().setLayout(new GridLayout(5, 2));
        getContentPane().add(jtxtDato1);
        getContentPane().add(jOperacion);
        getContentPane().add(jtxtDato2);
        getContentPane().add(jlbResultado);
        getContentPane().add(jbCalcular);
        jbCalcular.addActionListener(controlador);
        pack();
    }
    
    @Override
    public float getDato1() {
        return Float.parseFloat(jtxtDato1.getText());
    }
    
    @Override
    public float getDato2() {
        return Float.parseFloat(jtxtDato2.getText());
    }
    
    @Override
    public String getOperacion() {
        return jOperacion.getSelectedItem().toString();
    }
    
    @Override
    public void setResultado(float resultado) {
        jlbResultado.setText(resultado + "");
    }
    
    @Override
    public void setControlador(CCalculadora cc) {
        this.controlador = cc;
    }
    
    @Override
    public void mostrar() {
        setVisible(true);
    }
    
}
