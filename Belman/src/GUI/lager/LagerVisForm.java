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

/**
 *
 * @author Groggy
 */
public class LagerVisForm extends javax.swing.JDialog
{
    private BLLLagerManager lagmgr;
    private LagerTableModel lagmodel;
    private ProduktionForm prodForm;
    private BELager lager = null;

    /**
     * Creates new form GUILagerDialog
     */
    public LagerVisForm(java.awt.Frame parent, boolean modal) throws Exception
    {
        super(parent, modal);
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
        btnProduktion = new javax.swing.JToggleButton();
        btnAfbryd = new javax.swing.JToggleButton();
        pnlSortBy = new javax.swing.JPanel();
        rbtnThickness = new javax.swing.JRadioButton();
        rbtnWidth = new javax.swing.JRadioButton();
        rbtnLength = new javax.swing.JRadioButton();
        rbtnMaterialeID = new javax.swing.JRadioButton();
        rbtnNone = new javax.swing.JRadioButton();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLager = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Belman Lageroversigt");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        btnProduktion.setText("Produktion");
        btnProduktion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduktionActionPerformed(evt);
            }
        });

        btnAfbryd.setText("Afbryd");
        btnAfbryd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfbrydActionPerformed(evt);
            }
        });

        pnlSortBy.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sort by"));

        buttonGroup1.add(rbtnThickness);
        rbtnThickness.setText("Thickness");
        rbtnThickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnThicknessActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnWidth);
        rbtnWidth.setText("Width");

        buttonGroup1.add(rbtnLength);
        rbtnLength.setText("Length");

        buttonGroup1.add(rbtnMaterialeID);
        rbtnMaterialeID.setText("Materiale ID");

        buttonGroup1.add(rbtnNone);
        rbtnNone.setText("None");

        javax.swing.GroupLayout pnlSortByLayout = new javax.swing.GroupLayout(pnlSortBy);
        pnlSortBy.setLayout(pnlSortByLayout);
        pnlSortByLayout.setHorizontalGroup(
            pnlSortByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSortByLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSortByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNone)
                    .addComponent(rbtnMaterialeID)
                    .addComponent(rbtnLength)
                    .addComponent(rbtnWidth)
                    .addComponent(rbtnThickness))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        pnlSortByLayout.setVerticalGroup(
            pnlSortByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSortByLayout.createSequentialGroup()
                .addComponent(rbtnThickness)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnWidth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnMaterialeID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnNone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search"));

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
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

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlSortBy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProduktion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAfbryd)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAfbryd, btnProduktion});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduktion)
                    .addComponent(btnAfbryd))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAfbryd, btnProduktion});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfbrydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfbrydActionPerformed
        dispose();
    }//GEN-LAST:event_btnAfbrydActionPerformed

    private void rbtnThicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnThicknessActionPerformed
        
//        if (rbtnThickness.isSelected() == true)
//            {
//               try
//                {
//                    for 
//                }
//                catch (Exception ex)
//                {
//                    Logger.getLogger(LagerVisForm.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
        
        
        
    }//GEN-LAST:event_rbtnThicknessActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tblLager.setModel(new LagerTableModel());       
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnProduktionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduktionActionPerformed
//        try
//            {
//                ProduktionForm prodForm = new ProduktionForm(this, true);
//                prodForm.pack();
//                prodForm.setVisible(true);
//             }
//        catch (Exception ex)
//        {
//            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnProduktionActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAfbryd;
    private javax.swing.JButton btnClear;
    private javax.swing.JToggleButton btnProduktion;
    private javax.swing.JToggleButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSortBy;
    private javax.swing.JRadioButton rbtnLength;
    private javax.swing.JRadioButton rbtnMaterialeID;
    private javax.swing.JRadioButton rbtnNone;
    private javax.swing.JRadioButton rbtnThickness;
    private javax.swing.JRadioButton rbtnWidth;
    private javax.swing.JTable tblLager;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
