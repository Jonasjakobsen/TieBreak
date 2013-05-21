/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.medlem;

import BE.BEMedlem;
import BLL.BLLMedlemManager;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Stoffer
 */
public class MedlemVisForm extends javax.swing.JDialog
{
    private BLLMedlemManager medmgr;
    private MedlemTableModel medmodel;
    private BEMedlem medlem = null;

    /**
     * Creates new form GUIMedlemDialog
     */
    public MedlemVisForm(java.awt.Frame parent, boolean modal) throws Exception
    {
        super(parent, modal);
        initComponents();

        
        // disable update and remove buttons
        btnOpdater.setEnabled(false);
        btnFjern.setEnabled(false);
        
        // Reference for the BLL layer.
        medmgr = new BLLMedlemManager();
        
        // Set the table model for the JTable
        medmodel = new MedlemTableModel(medmgr.visMedlemmer());
        tblMedlem.setModel(medmodel);
        
        // ADD A LISTSELECTIONLISTENER TO THE SELECTIONMODEL OF THE JTABLE HERRE
        tblMedlem.getSelectionModel().addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent evt)
            {
               if (!evt.getValueIsAdjusting())
                {
                    visMedlemDetaljer();
                }
            }

            private void visMedlemDetaljer()
                {
                // Does the selection work correctly here?
                BEMedlem e = medmodel.getMedlemByRow(tblMedlem.getSelectedRow());

                txtMedlemsNr.setText("" + e.getId());
                txtNavn.setText(e.getNavn());
                txtEfternavn.setText(e.getEfternavn());
                chkKontingent.setSelected(e.harBetalt());                

                btnOpdater.setEnabled(true);
                btnFjern.setEnabled(true);
                }
            });
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedlem = new javax.swing.JTable();
        btnAfbryd = new javax.swing.JButton();
        btnOpdater = new javax.swing.JButton();
        chkKontingent = new javax.swing.JCheckBox();
        lblEfternavn = new javax.swing.JLabel();
        lblNavn = new javax.swing.JLabel();
        lblMedlemsNr = new javax.swing.JLabel();
        txtEfternavn = new javax.swing.JTextField();
        txtMedlemsNr = new javax.swing.JTextField();
        txtNavn = new javax.swing.JTextField();
        btnFjern = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jScrollPane2.setViewportView(tblMedlem);

        jScrollPane2.setBounds(10, 10, 820, 325);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnAfbryd.setText("Afbryd");
        btnAfbryd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAfbrydActionPerformed(evt);
            }
        });
        btnAfbryd.setBounds(760, 530, 65, 23);
        jLayeredPane1.add(btnAfbryd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnOpdater.setText("Opdater medlem");
        btnOpdater.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOpdaterActionPerformed(evt);
            }
        });
        btnOpdater.setBounds(110, 520, 111, 23);
        jLayeredPane1.add(btnOpdater, javax.swing.JLayeredPane.DEFAULT_LAYER);

        chkKontingent.setText("Har betalt kontingent");
        chkKontingent.setBounds(120, 470, 160, 23);
        jLayeredPane1.add(chkKontingent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblEfternavn.setText("Efternavn:");
        lblEfternavn.setBounds(40, 440, 70, 14);
        jLayeredPane1.add(lblEfternavn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblNavn.setText("Navn:");
        lblNavn.setBounds(40, 410, 50, 14);
        jLayeredPane1.add(lblNavn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblMedlemsNr.setText("MedlemsNr:");
        lblMedlemsNr.setBounds(40, 370, 70, 14);
        jLayeredPane1.add(lblMedlemsNr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtEfternavn.setBounds(110, 430, 300, 30);
        jLayeredPane1.add(txtEfternavn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtMedlemsNr.setEditable(false);
        txtMedlemsNr.setBounds(110, 360, 50, 30);
        jLayeredPane1.add(txtMedlemsNr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtNavn.setBounds(110, 400, 300, 30);
        jLayeredPane1.add(txtNavn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnFjern.setText("Fjern medlem");
        btnFjern.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFjernActionPerformed(evt);
            }
        });
        btnFjern.setBounds(240, 520, 110, 23);
        jLayeredPane1.add(btnFjern, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 0, 850, 570);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfbrydActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAfbrydActionPerformed
    {//GEN-HEADEREND:event_btnAfbrydActionPerformed
        dispose();
    }//GEN-LAST:event_btnAfbrydActionPerformed

    private void btnFjernActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFjernActionPerformed
    {//GEN-HEADEREND:event_btnFjernActionPerformed
        try
        {
            int id = Integer.parseInt(txtMedlemsNr.getText());
            BLLMedlemManager.getInstance().deleteMember(id);
            JOptionPane.showMessageDialog(this, "Medlem fjernet");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR - " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnFjernActionPerformed

    private void btnOpdaterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOpdaterActionPerformed
    {//GEN-HEADEREND:event_btnOpdaterActionPerformed
        try
        {
            int id = Integer.parseInt(txtMedlemsNr.getText());
            String navn = txtNavn.getText();
            String efternavn = txtEfternavn.getText();
            Boolean kontingent = chkKontingent.isSelected();
            
            BEMedlem m = new BEMedlem(id, navn, efternavn, kontingent);
            BLLMedlemManager.getInstance().updateMember(m);
            JOptionPane.showMessageDialog(this, "Medlem opdateret");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR - " + ex.getMessage());
        }
    }//GEN-LAST:event_btnOpdaterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfbryd;
    private javax.swing.JButton btnFjern;
    private javax.swing.JButton btnOpdater;
    private javax.swing.JCheckBox chkKontingent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEfternavn;
    private javax.swing.JLabel lblMedlemsNr;
    private javax.swing.JLabel lblNavn;
    private javax.swing.JTable tblMedlem;
    private javax.swing.JTextField txtEfternavn;
    private javax.swing.JTextField txtMedlemsNr;
    private javax.swing.JTextField txtNavn;
    // End of variables declaration//GEN-END:variables
}