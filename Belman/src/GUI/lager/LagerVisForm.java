/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.lager;

import BE.BELager;
import BLL.BLLLagerManager;
import GUI.GUIMain;
import GUI.produktion.ProduktionForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Groggy
 */
public class LagerVisForm extends javax.swing.JDialog {

    private BLLLagerManager lagmgr;
    private LagerTableModel lagmodel;
    private BELager lager = null;

    /**
     * Creates new form GUILagerDialog
     */
    public LagerVisForm(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);


        // Reference for the BLL layer.
        lagmgr = new BLLLagerManager();

        // Set the table model for the JTable
        lagmodel = new LagerTableModel(lagmgr.visLager());
        tblLager.setModel(lagmodel);
    }

    public LagerVisForm(ProduktionForm aThis, boolean b) throws Exception {
        super(aThis, b);
        initComponents();
        setLocationRelativeTo(this);


        // Reference for the BLL layer.
        lagmgr = new BLLLagerManager();

        // Set the table model for the JTable
        lagmodel = new LagerTableModel(lagmgr.visLager());
        tblLager.setModel(lagmodel);
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
        btnAfbryd = new javax.swing.JToggleButton();
        pnlSortBy = new javax.swing.JPanel();
        rbtnWidth = new javax.swing.JRadioButton();
        rbtnLength = new javax.swing.JRadioButton();
        rbtnMaterialeID = new javax.swing.JRadioButton();
        rbtnDensity = new javax.swing.JRadioButton();
        rbtnStockQuantity = new javax.swing.JRadioButton();
        rbtnThickness = new javax.swing.JRadioButton();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLager = new javax.swing.JTable();
        btnProduction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Belman Lageroversigt");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        btnAfbryd.setText("Cancel");
        btnAfbryd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfbrydActionPerformed(evt);
            }
        });

        pnlSortBy.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sort by"));

        buttonGroup1.add(rbtnWidth);
        rbtnWidth.setText("Width");
        rbtnWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWidthActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnLength);
        rbtnLength.setText("Length");
        rbtnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLengthActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnMaterialeID);
        rbtnMaterialeID.setText("Materiale ID");
        rbtnMaterialeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaterialeIDActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnDensity);
        rbtnDensity.setText("Material Density");
        rbtnDensity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDensityActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnStockQuantity);
        rbtnStockQuantity.setText("Stock Quantity");
        rbtnStockQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnStockQuantityActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnThickness);
        rbtnThickness.setText("Thickness");
        rbtnThickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnThicknessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSortByLayout = new javax.swing.GroupLayout(pnlSortBy);
        pnlSortBy.setLayout(pnlSortByLayout);
        pnlSortByLayout.setHorizontalGroup(
            pnlSortByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSortByLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSortByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnDensity)
                    .addComponent(rbtnMaterialeID)
                    .addComponent(rbtnLength)
                    .addComponent(rbtnWidth)
                    .addComponent(rbtnStockQuantity)
                    .addComponent(rbtnThickness))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSortByLayout.setVerticalGroup(
            pnlSortByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSortByLayout.createSequentialGroup()
                .addComponent(rbtnThickness)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnWidth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnMaterialeID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnDensity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnStockQuantity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search ID"));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch)
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(tblLager);

        btnProduction.setText("Production");
        btnProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlSortBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProduction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAfbryd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAfbryd, btnProduction});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAfbryd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduction))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAfbryd, btnProduction});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfbrydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfbrydActionPerformed
        dispose();
    }//GEN-LAST:event_btnAfbrydActionPerformed

    private void btnProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductionActionPerformed
        dispose();
        try
            {
                ProduktionForm prodForm = new ProduktionForm(this, true);
                prodForm.pack();
                prodForm.setVisible(true);
            }
        catch (Exception ex)
        {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProductionActionPerformed

    private void rbtnWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWidthActionPerformed
        if (rbtnWidth.isSelected() == true) {
            lagmodel.clear();
            try {

                lagmodel = new LagerTableModel(lagmgr.orderByWidth());
                tblLager.setModel(lagmodel);
            } catch (Exception ex) {
                Logger.getLogger(LagerVisForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rbtnWidthActionPerformed

    private void rbtnThicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnThicknessActionPerformed
        if (rbtnThickness.isSelected() == true) {
            lagmodel.clear();
            try {
                lagmodel = new LagerTableModel(lagmgr.orderByThickness());
                tblLager.setModel(lagmodel);
            } catch (Exception ex) {
                Logger.getLogger(LagerVisForm.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }//GEN-LAST:event_rbtnThicknessActionPerformed

    private void rbtnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLengthActionPerformed
        if (rbtnLength.isSelected() == true) {
            lagmodel.clear();
            try {

                lagmodel = new LagerTableModel(lagmgr.orderByLength());
                tblLager.setModel(lagmodel);
            } catch (Exception ex) {
                Logger.getLogger(LagerVisForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rbtnLengthActionPerformed

    private void rbtnMaterialeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaterialeIDActionPerformed
        if (rbtnMaterialeID.isSelected() == true) {
            lagmodel.clear();
            try {

                lagmodel = new LagerTableModel(lagmgr.orderByMaterialID());
                tblLager.setModel(lagmodel);
            } catch (Exception ex) {
                Logger.getLogger(LagerVisForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rbtnMaterialeIDActionPerformed

    private void rbtnDensityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDensityActionPerformed
        if (rbtnDensity.isSelected() == true) {
            lagmodel.clear();
            try {

                lagmodel = new LagerTableModel(lagmgr.orderByDensity());
                tblLager.setModel(lagmodel);
            } catch (Exception ex) {
                Logger.getLogger(LagerVisForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rbtnDensityActionPerformed

    private void rbtnStockQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnStockQuantityActionPerformed
        if (rbtnStockQuantity.isSelected() == true) {
            lagmodel.clear();
            try {

                lagmodel = new LagerTableModel(lagmgr.orderByStockQuantity());
                tblLager.setModel(lagmodel);
            } catch (Exception ex) {
                Logger.getLogger(LagerVisForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rbtnStockQuantityActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

         try
        {
            int id = Integer.parseInt(txtSearch.getText());
            lagmodel = new LagerTableModel(lagmgr.searchById(id));
                tblLager.setModel(lagmodel);
            JOptionPane.showMessageDialog(this, "Medlem fjernet");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR - " + ex.getMessage());
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAfbryd;
    private javax.swing.JButton btnProduction;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSortBy;
    private javax.swing.JRadioButton rbtnDensity;
    private javax.swing.JRadioButton rbtnLength;
    private javax.swing.JRadioButton rbtnMaterialeID;
    private javax.swing.JRadioButton rbtnStockQuantity;
    private javax.swing.JRadioButton rbtnThickness;
    private javax.swing.JRadioButton rbtnWidth;
    private javax.swing.JTable tblLager;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
