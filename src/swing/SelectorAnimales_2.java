/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author Vespertino
 */
public class SelectorAnimales_2 extends javax.swing.JFrame {

    /**
     * Creates new form SelectorAnimales
     */
    public SelectorAnimales_2() {
        initComponents();
        animales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/Bird.gif")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        animales = new javax.swing.JLabel();
        pajaro = new javax.swing.JRadioButton();
        gato = new javax.swing.JRadioButton();
        perro = new javax.swing.JRadioButton();
        cerdo = new javax.swing.JRadioButton();
        conejo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ComboBoxDemo");
        setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(pajaro);
        pajaro.setText("Pajaro");
        pajaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pajaroActionPerformed(evt);
            }
        });

        buttonGroup1.add(gato);
        gato.setText("Gato");
        gato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatoActionPerformed(evt);
            }
        });

        buttonGroup1.add(perro);
        perro.setText("Perro");
        perro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perroActionPerformed(evt);
            }
        });

        buttonGroup1.add(cerdo);
        cerdo.setText("Cerdo");
        cerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerdoActionPerformed(evt);
            }
        });

        buttonGroup1.add(conejo);
        conejo.setText("Conejo");
        conejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conejoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pajaro)
                    .addComponent(perro)
                    .addComponent(conejo)
                    .addComponent(gato)
                    .addComponent(cerdo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(animales, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(pajaro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gato)
                        .addGap(3, 3, 3)
                        .addComponent(perro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cerdo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conejo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(animales, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pajaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pajaroActionPerformed
        // TODO add your handling code here:
        animales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/Bird.gif")));

    }//GEN-LAST:event_pajaroActionPerformed

    private void gatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoActionPerformed
        // TODO add your handling code here
        animales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/Cat.gif")));

    }//GEN-LAST:event_gatoActionPerformed

    private void perroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perroActionPerformed
        // TODO add your handling code here:
        animales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/Dog.gif")));

    }//GEN-LAST:event_perroActionPerformed

    private void cerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerdoActionPerformed
        // TODO add your handling code here:
        animales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/Pig.gif")));

    }//GEN-LAST:event_cerdoActionPerformed

    private void conejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conejoActionPerformed
        // TODO add your handling code here:
        animales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/Rabbit.gif")));

    }//GEN-LAST:event_conejoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectorAnimales_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectorAnimales_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectorAnimales_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectorAnimales_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectorAnimales_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animales;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cerdo;
    private javax.swing.JRadioButton conejo;
    private javax.swing.JRadioButton gato;
    private javax.swing.JRadioButton pajaro;
    private javax.swing.JRadioButton perro;
    // End of variables declaration//GEN-END:variables
}