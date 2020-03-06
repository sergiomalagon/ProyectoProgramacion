/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.asistente;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author Vespertino
 */
public class Asistente extends JInternalFrame {

    private JButton siguente, finalizar, atras;
    private CardLayout cl;
    private BorderLayout bl;
    private FlowLayout fl;
    private JPanel zonaCentral, zonaBotones, pantalla1, pantalla2, pantalla3, pantalla4, pantalla5;
    private JTextField localizacion;
    private JLabel textoPlanoPantalla1, textoPlanoPantalla3, textoPlanoPantalla4, textoPantallaFinal;

    public Asistente() {
        declarar();
        añadir();
        ventana();
        acciones();
    }

    private void declarar() {
        siguente = new JButton("Siguiente");
        finalizar = new JButton("Finalizar");

        localizacion = new JTextField(System.getProperty("user.home") + "\\calculadora");

        textoPlanoPantalla1 = new JLabel("Bienvenido al asistente de instalacion de la calculadora");
        textoPlanoPantalla3 = new JLabel("test");
        textoPlanoPantalla4 = new JLabel("test2");
        textoPantallaFinal = new JLabel("Adios y gracias por confiar en nosotros");

        textoPlanoPantalla1.setBackground(Color.WHITE);
        textoPlanoPantalla3.setBackground(Color.WHITE);
        textoPlanoPantalla4.setBackground(Color.WHITE);
        textoPantallaFinal.setBackground(Color.WHITE);

        cl = new CardLayout();
        bl = new BorderLayout();
        fl = new FlowLayout((int) RIGHT_ALIGNMENT);

        zonaCentral = new JPanel();
        zonaBotones = new JPanel();
        pantalla1 = new JPanel();
        pantalla2 = new JPanel();
        pantalla3 = new JPanel();
        pantalla4 = new JPanel();
        pantalla5 = new JPanel();
    }

    private void añadir() {
        pantalla1.add(textoPlanoPantalla1);
        pantalla2.add(localizacion);
        pantalla3.add(textoPlanoPantalla3);
        pantalla4.add(textoPlanoPantalla4);
        pantalla5.add(textoPantallaFinal);

        zonaCentral.setLayout(cl);

        zonaCentral.add(pantalla1, "pantalla1");
        zonaCentral.add(pantalla2, "pantalla2");
        zonaCentral.add(pantalla3, "pantalla3");
        zonaCentral.add(pantalla4, "pantalla4");
        zonaCentral.add(pantalla5, "pantalla5");

        zonaBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        zonaBotones.add(finalizar);
        zonaBotones.add(siguente);

    }

    private void ventana() {

        getContentPane().setLayout(bl);
        getContentPane().add(zonaCentral, BorderLayout.CENTER);
        getContentPane().add(zonaBotones, BorderLayout.SOUTH);
        setResizable(false);
        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(WIDTH + 600, HEIGHT + 500);
        //setLocationRelativeTo(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
    }

    private void acciones() {
        siguente.addActionListener((ActionEvent e) -> {
            siguiente();
        });
        finalizar.addActionListener((e) -> {
            exit();
        });

    }

    private void siguiente() {
        //pantalla2
        if (pantalla1.isVisible()) {
            cl.next(zonaCentral);
            return;
        }
        if (pantalla2.isVisible()) {
            String aux = localizacion.getText();
            new File(aux).mkdir();
            cl.next(zonaCentral);
            return;
        }
        if (pantalla3.isVisible()) {
            cl.next(zonaCentral);
            return;
        }
        if (pantalla4.isVisible()) {
            cl.next(zonaCentral);
            siguente.setVisible(false);
            return;
        }
    }

    private void exit() {
        System.exit(0);
    }

}
