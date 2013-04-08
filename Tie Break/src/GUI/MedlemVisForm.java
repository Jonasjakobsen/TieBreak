/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.BEMedlem;
import BLL.BLLMedlemManager;

/**
 *
 * @author Stoffer
 */
public class MedlemVisForm extends javax.swing.JDialog
{
    private BLLMedlemManager empMgr;
    private MedlemTableModel empModel;
    private BEMedlem medlem = null;

    /**
     * Creates new form GUIMedlemDialog
     */
    public MedlemVisForm(java.awt.Frame parent, boolean modal) throws Exception
    {
        super(parent, modal);
        initComponents();
                // Reference for the BLL layer.
        empMgr = new BLLMedlemManager();
        
        // Set the table model for the JTable
        empModel = new MedlemTableModel(empMgr.visMedlemmer());
        tblMedlem.setModel(empModel);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAfbryd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedlem = new javax.swing.JTable();

        jLabel3.setText("Efternavn:");

        jLabel2.setText("Navn:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vis medlem");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(288, 279));
        setModal(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        btnAfbryd.setText("Afbryd");
        btnAfbryd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAfbrydActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tblMedlem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAfbryd)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnAfbryd)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfbrydActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAfbrydActionPerformed
    {//GEN-HEADEREND:event_btnAfbrydActionPerformed
        dispose();
    }//GEN-LAST:event_btnAfbrydActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfbryd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMedlem;
    // End of variables declaration//GEN-END:variables
}
