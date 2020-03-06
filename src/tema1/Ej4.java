/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ej4 extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ej4 frame = new Ej4();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Ej4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 1000, 600);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(200, 200, 130, 120);
        g.drawRect(245, 270, 40, 50);
        int[] vx1 = {265, 330, 200};
        int[] vy1 = {100, 200, 200};
        g.drawPolygon(vx1, vy1, 3);
        g.drawOval(360, 70, 70, 70);
        g.drawOval(250, 155, 40, 40);
        g.drawRect(600, 200, 30, 120);
        g.drawOval(580, 135, 70, 70);

        g.setColor(Color.BLUE);
        g.fillRect(245, 270, 40, 50);
        g.setColor(Color.YELLOW);
        g.fillOval(360, 70, 70, 70);
        g.setColor(Color.ORANGE);
        g.fillRect(600, 200, 30, 120);
        g.setColor(Color.GREEN);
        g.fillOval(580, 135, 70, 70);

    }
}
