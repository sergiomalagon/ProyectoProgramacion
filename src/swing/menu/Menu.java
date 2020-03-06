/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.menu;

import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Vespertino
 */
public class Menu extends JFrame {

    private JMenuBar barraMenu;
    private JMenu menu1, menu2;
    private JMenuItem nuevo, abrir, guardar, salir, imporLista, imporBook, imporMail;
    private BorderLayout bl;
    private ImageIcon nuevoI, abrirI, guardarI, salirI;

    public Menu() throws IOException {
        barraMenu = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Import");
        bl = new BorderLayout();
        nuevoI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/add.png")));
        abrirI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/book.png")));
        guardarI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/Save-icon.png")));
        salirI = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/gfx/menus/Button-Close-icon.png")));
        nuevo = new JMenuItem("New", nuevoI);
        abrir = new JMenuItem("Open", abrirI);
        guardar = new JMenuItem("Save", guardarI);
        salir = new JMenuItem("Exit", salirI);
        imporLista = new JMenuItem("Import newsfeed list...");
        imporBook = new JMenuItem("Import bookmarks...");
        imporMail = new JMenuItem("Import mail...");

        barraMenu.add(menu1);
        menu1.add(nuevo);
        menu1.add(abrir);
        menu1.add(guardar);
        menu1.add(menu2);
        menu1.add(salir);
        menu2.add(imporLista);
        menu2.add(imporBook);
        menu2.add(imporMail);
        
        getContentPane().setLayout(bl);
        getContentPane().add(barraMenu, BorderLayout.NORTH);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(WIDTH + 600, HEIGHT + 500);
        setLocationRelativeTo(null);
    }

}
