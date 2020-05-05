/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.listalumnos.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import tema11.listalumnos.controlador.CAlumno;
import tema11.listalumnos.modelo.Alumno;

/**
 *
 * @author Sergio
 */
public class VAlumno extends JFrame implements IAlumno {
    
    private JPanel panelSuperior, panelCentro;
    private JButton jPrimero, jUltimo, jSiguiente, jAnterior, jAñadir, jQuitar;
    private JLabel lId, lEdad, lNombre, lApellido;
    private JTextField tID, tEdad, tNombre, tApellido;
    private GridLayout gl;
    
    private CAlumno controlador;
    
    public VAlumno() throws HeadlessException {
        panelSuperior = new JPanel();
        panelCentro = new JPanel();
        jPrimero = new JButton("|<");
        jPrimero.setActionCommand("primero");
        jUltimo = new JButton(">|");
        jUltimo.setActionCommand("ultimo");
        jSiguiente = new JButton(">");
        jSiguiente.setActionCommand("siguiente");
        jAnterior = new JButton("<");
        jAnterior.setActionCommand("anterior");
        jAñadir = new JButton("Añadir");
        jAñadir.setActionCommand("añadir");
        jQuitar = new JButton("Quitar");
        jQuitar.setActionCommand("quitar");
        lId = new JLabel("Id");
        lEdad = new JLabel("Edad");
        lNombre = new JLabel("Nombre");
        lApellido = new JLabel("Apellido");
        tID = new JTextField(10);
        tEdad = new JTextField(10);
        tNombre = new JTextField(10);
        tApellido = new JTextField(10);
        
        panelSuperior.add(jPrimero);
        panelSuperior.add(jAnterior);
        panelSuperior.add(jSiguiente);
        panelSuperior.add(jUltimo);
        panelSuperior.add(jAñadir);
        panelSuperior.add(jQuitar);
        
        panelCentro.setLayout(new GridLayout(4, 0));
        panelCentro.add(lId);
        panelCentro.add(tID);
        panelCentro.add(lEdad);
        panelCentro.add(tEdad);
        panelCentro.add(lNombre);
        panelCentro.add(tNombre);
        panelCentro.add(lApellido);
        panelCentro.add(tApellido);
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelSuperior, BorderLayout.NORTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);    
        pack();
        
    }
    
    @Override
    public void setControlador(CAlumno ca) {
        this.controlador = ca;
        jPrimero.addActionListener(this.controlador);
        jUltimo.addActionListener(this.controlador);
        jAnterior.addActionListener(this.controlador);
        jSiguiente.addActionListener(this.controlador);
    }
    
    @Override
    public void mostrar() {
        setVisible(true);
    }
    
    @Override
    public void setAlumno(Alumno al) {
        tID.setText(Integer.toString(al.getId()));
        tEdad.setText(Integer.toString(al.getEdad()));
        tNombre.setText(al.getNombre());
        tApellido.setText(al.getApellido());
    }
    
}
