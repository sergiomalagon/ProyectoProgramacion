/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.nave;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
/*
allocation para poder mover la nave
 */
public class NaveEspacial extends JFrame {

    private JLabel nave, horizontalTexto, verticalTexto, tamañoTexto, colorTexto;
    private BorderLayout bl;
    private JSpinner tamaño, color;
    private ArrayList cl;
    private JSlider horizontal, vertical;
    private final JPanel zonaModificadores;
    private JPanel zonaNave;
    private int ancho, largo;

    public NaveEspacial() {
        bl = new BorderLayout();

        cl = new ArrayList<String>();
        cl.add("verde");
        cl.add("rojo");
        cl.add("amarillo");
        cl.add("azul");
        cl.add("morado");
        System.out.println("panel.getWidht");
        horizontalTexto = new JLabel("Horizontal");
        verticalTexto = new JLabel("Vertical");
        tamañoTexto = new JLabel("Tamaño");
        colorTexto = new JLabel("Color");

        horizontal = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        horizontal.setMajorTickSpacing(10);
        horizontal.setPaintLabels(true);
        horizontal.setPaintTicks(true);
        horizontal.setSnapToTicks(true);

        vertical = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        vertical.setMajorTickSpacing(10);
        vertical.setPaintLabels(true);
        vertical.setPaintTicks(true);
        vertical.setSnapToTicks(true);

        tamaño = new JSpinner();
        color = new JSpinner();
        tamaño.setModel(new SpinnerNumberModel(1, 1, 10, 1));
        color.setModel(new SpinnerListModel(cl));
        zonaModificadores = new JPanel();
        zonaModificadores.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        zonaNave = new JPanel();
        zonaNave.setLayout(null);
        nave = new JLabel("<==>");
        zonaNave.add(nave);
        Dimension size = nave.getPreferredSize();
        nave.setBounds(260, 170, size.width + 30, size.height);

        zonaModificadores.add(horizontalTexto);
        zonaModificadores.add(horizontal);
        zonaModificadores.add(verticalTexto);
        zonaModificadores.add(vertical);
        zonaModificadores.add(tamañoTexto);
        zonaModificadores.add(tamaño);
        zonaModificadores.add(colorTexto);
        zonaModificadores.add(color);
        
        getContentPane().setLayout(bl);
        getContentPane().add(zonaModificadores, BorderLayout.NORTH);
        getContentPane().add(zonaNave, BorderLayout.CENTER);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(WIDTH + 600, HEIGHT + 450);
        setLocationRelativeTo(null);
        nave.setLocation(260, 170);

        vertical.addChangeListener((e) -> {
            movimientoVertical();
        });
        horizontal.addChangeListener((e) -> {
            movimientoHorizontal();
        });
        color.addChangeListener((e) -> {
            color();
        });
        tamaño.addChangeListener((e) -> {
            tamaño();
        });
    }

    private void movimientoVertical() {
        int vert, hori;
        vert = (int) vertical.getValue();
        hori = (int) horizontal.getValue();
        nave.setLocation((int) (hori * 5.65), (int) (vert * 1.8));
    }

    private void movimientoHorizontal() {
        int vert, hori;
        vert = (int) vertical.getValue();
        hori = (int) horizontal.getValue();
        nave.setLocation((int) (hori * 5.65), (int) (vert * 1.8));
    }

    private void color() {
        String colo;
        colo = (String) color.getValue();
        switch (colo) {
            case "rojo":
                nave.setForeground(Color.red);
                break;
            case "verde":
                nave.setForeground(Color.green);
                break;
            case "amarillo":
                nave.setForeground(Color.yellow);
                break;
            case "azul":
                nave.setForeground(Color.blue);
                break;
            case "morado":
                nave.setForeground(Color.magenta);
                break;
            default:
                break;
        }
    }

    private void tamaño() {
        int tama;
        tama = (int) tamaño.getValue();
        nave.setFont(new Font("Serif", 0, 10 + tama));

    }

}
