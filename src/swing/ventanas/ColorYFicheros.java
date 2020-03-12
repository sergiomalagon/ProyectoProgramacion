/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
public class ColorYFicheros extends JFrame {
    
    private JPanel panel, panel2;
    private JColorChooser selector;
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton color, ficheros;
    private BorderLayout bl;
    
    public ColorYFicheros() {
        bl = new BorderLayout();
        etiqueta = new JLabel();
        panel = new JPanel();
        panel2 = new JPanel();
        campoTexto = new JTextField(34);
        selector = new JColorChooser(Color.GREEN);
        color = new JButton("Color");
        ficheros = new JButton("Ficheros");
        
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel2.add(ficheros);
        panel2.add(color);
        panel2.add(selector);
        selector.setVisible(false);
        getContentPane().setLayout(bl);
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(panel2, BorderLayout.CENTER);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(WIDTH + 1000, HEIGHT + 500);
        color.addActionListener((ActionEvent e) -> {
            color();
        });
        ficheros.addActionListener((ActionEvent e) -> {
            ficheros();
        });
    }
    
    private void color() {
        selector.setVisible(true);
        etiqueta.setForeground(selector.getColor());
    }
    
    private void ficheros() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                new ExtensionFilter("All Files", "*.*"));
       // File selectedFile = fileChooser.showOpenDialog(mainStage);
      //  if (selectedFile != null) {
      //      mainStage.display(selectedFile);
        }
    }
    
//}
