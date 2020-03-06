/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.escritorio;

import swing.asistente.Asistente;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
public class Escritorio extends JFrame {

    private JMenuBar barraMenu;
    private JMenuItem file, edit;
    private BorderLayout bl;
    private JDesktopPane dp;
    private JToolBar tb;
    private JButton nueva, cerrar;
    private ImageIcon nuevoI, salirI;
    private Image img, icono;

    public Escritorio() throws HeadlessException, IOException {
        barraMenu = new JMenuBar();
        img = ImageIO.read(getClass().getResourceAsStream("/gfx/menus/wallpaper-engine.png"));
        icono = ImageIO.read(getClass().getResourceAsStream("/gfx/menus/apple.png"));
        barraMenu.setLayout(new FlowLayout(FlowLayout.LEFT));
        bl = new BorderLayout();
        dp = new JDesktopPane() {
            //@Override
            protected void paintComponent(Graphics grphcs) {
           //     super.paintComponent(grphcs);
                grphcs.drawImage(img, 0, 0, dp.getWidth(), dp.getHeight(), null);
            }
        };

        tb = new JToolBar();
        tb.setRollover(true);

        nuevoI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/add.png")));
        salirI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/Button-Close-icon.png")));

        file = new JMenuItem("File");
        edit = new JMenuItem("Edit");

        nueva = new JButton(nuevoI);
        cerrar = new JButton(salirI);

        nueva.setToolTipText("nueva");
        cerrar.setToolTipText("cerrar");

        barraMenu.add(file);
        barraMenu.add(edit);

        tb.add(nueva);
        tb.add(cerrar);

        getContentPane().setLayout(bl);
        getContentPane().add(tb, BorderLayout.NORTH);
        getContentPane().add(dp, BorderLayout.CENTER);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(WIDTH + 1600, HEIGHT + 900);
        setLocationRelativeTo(null);
        setJMenuBar(barraMenu);
        
        setIconImage(icono);
        setTitle("Windows_Sergio");

        nueva.addActionListener((e) -> {
            nuevaVentana();
        });
        cerrar.addActionListener((e) -> {
            cerrarVentana();
        });
    }

    private void nuevaVentana() {
        Asistente asistente = new Asistente();
        setLocationRelativeTo(null);
        asistente.setVisible(true);
        dp.add(asistente);
    }

    private void cerrarVentana() {
        Asistente asistente = new Asistente();
        asistente.setVisible(false);
    }

}
