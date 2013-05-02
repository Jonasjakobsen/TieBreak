/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.lager.LagerVisForm;
import GUI.produktion.ProduktionForm;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Groggy
 */
public class GUIMain extends javax.swing.JFrame {
    
     boolean isLoggedIn = false;

    /**
     * Creates new form Main
     */
    public GUIMain() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLagerOversigt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Belman");

        btnLagerOversigt.setText("Stock");
        btnLagerOversigt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagerOversigtActionPerformed(evt);
            }
        });

        jButton1.setText("Production");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLagerOversigt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLagerOversigt, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLagerOversigt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLagerOversigt, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLagerOversigtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagerOversigtActionPerformed
        if(isLoggedIn == false)
        {
            try
                {
                    LogIndLager lagForm = new LogIndLager(this, true);
                    lagForm.pack();
                    lagForm.setVisible(true);
                    isLoggedIn = true;
                }
            catch (Exception ex)
            {
                Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try
                {
                    LagerVisForm lagForm = new LagerVisForm(this, true);
                    lagForm.pack();
                    lagForm.setVisible(true);
                }
            catch (Exception ex)
            {
                Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLagerOversigtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(isLoggedIn == false)
        {
            try
                {
                    LogIndProduktion proForm = new LogIndProduktion(this, true);
                    proForm.pack();
                    proForm.setVisible(true);
                    isLoggedIn = true;
                }
            catch (Exception ex)
            {
                Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try
                {
                    ProduktionForm proForm = new ProduktionForm(this, true);
                    proForm.pack();
                    proForm.setVisible(true);
                }
            catch (Exception ex)
            {
                Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            
            public void run() {
            new GUIMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLagerOversigt;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables


}
