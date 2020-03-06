/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.pruebas;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Sergio
 * 
 */
public class Tabbed extends JFrame {

    private JPanel pes1, pes2;
    private JTabbedPane tb;
    private JButton bt1, bt2;
    private BorderLayout bl1;

    public Tabbed() throws HeadlessException {
        bl1 = new BorderLayout();
        tb = new JTabbedPane();
        pes1 = new JPanel();
        pes2 = new JPanel();

        bt1 = new JButton("Boton de la zona1");
        bt2 = new JButton("Boton de la zona2");

        tb.addTab("pesta1", pes1);
        tb.addTab("pesta2", pes2);

        pes1.add(bt1);
        pes2.add(bt2);

        getContentPane().add(tb, BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH + 1600, HEIGHT + 900);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
