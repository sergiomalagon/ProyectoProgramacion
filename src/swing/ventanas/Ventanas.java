/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import swing.asistente.Asistente;

/**
 *
 * @author Vespertino
 */
/*
Probar los 4 tipos de ventanas del JOptionPanel
Utilizando el color chooser poner un label de ese color
Dado un file chooser,poner todas las turas en un textarea
 */
public class Ventanas extends JFrame {

    private JMenuBar barraMenu;
    private JMenuItem file, edit;
    private BorderLayout bl;
    private JDesktopPane dp;
    private JToolBar tb;
    private JButton panel1, panel2, panel3, panel4, panel5;
    private ImageIcon nuevoI, salirI;
    private Image img, icono;

    public Ventanas() throws HeadlessException, IOException {

        barraMenu = new JMenuBar();
        img = ImageIO.read(getClass().getResourceAsStream("/gfx/menus/wallpaper-engine.png"));
        icono = ImageIO.read(getClass().getResourceAsStream("/gfx/menus/apple.png"));
        barraMenu.setLayout(new FlowLayout(FlowLayout.LEFT));
        bl = new BorderLayout();
        dp = new JDesktopPane() {
            protected void paintComponent(Graphics grphcs) {
                grphcs.drawImage(img, 0, 0, dp.getWidth(), dp.getHeight(), null);
            }
        };
        tb = new JToolBar();
        tb.setRollover(true);
        nuevoI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/add.png")));
        salirI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/Button-Close-icon.png")));

        file = new JMenuItem("File");
        edit = new JMenuItem("Edit");

        panel1 = new JButton(nuevoI);
        panel2 = new JButton(nuevoI);
        panel3 = new JButton(nuevoI);
        panel4 = new JButton(nuevoI);
        panel5 = new JButton(nuevoI);

        barraMenu.add(file);
        barraMenu.add(edit);

        tb.add(panel1);
        tb.add(panel2);
        tb.add(panel3);
        tb.add(panel4);
        tb.add(panel5);

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

        panel1.addActionListener((e) -> {
            panel1();
        });
        panel2.addActionListener((e) -> {
            panel2();
        });
        panel3.addActionListener((e) -> {
            panel3();
        });
        panel4.addActionListener((e) -> {
            panel4();
        });
        panel5.addActionListener((e) -> {
            panel5();
        });
    }

    private void panel1() {
        JOptionPane.showConfirmDialog(null, "Titulo", "Panel1", JOptionPane.OK_OPTION);
    }

    private void panel2() {
        JOptionPane.showInputDialog(null, "Titulo2", "Prueba2", JOptionPane.PLAIN_MESSAGE);
    }

    private void panel3() {
        JOptionPane.showMessageDialog(null, "Titulo3", "Prueba3", JOptionPane.WARNING_MESSAGE);
    }

    private void panel4() {

    }

    private void panel5() {
        ColorYFicheros color = new ColorYFicheros();
        color.setVisible(true);
        dp.add(color);
    }

}
