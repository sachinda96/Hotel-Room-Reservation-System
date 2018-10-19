/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.reservation.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import lk.ijse.reservation.controller.ManegeFasilites;
import lk.ijse.reservation.controller.ManegeGuest;
import lk.ijse.reservation.core.dto.FasilitesDTO;
import lk.ijse.reservation.core.dto.GuestDTO;

/**
 *
 * @author Sachinda Nipun
 */
public class Fasilites extends javax.swing.JPanel {

    /**
     * Creates new form RoomType
     */
    public Fasilites() {
        initComponents();
        loadAllGues();
        tablFasilites.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (tablFasilites.getSelectedRow() == -1) {
                    return;
                }

                String FasilitesTYpeId = tablFasilites.getValueAt(tablFasilites.getSelectedRow(), 0).toString();
                String FasilitesName = tablFasilites.getValueAt(tablFasilites.getSelectedRow(), 1).toString();
                String Fasilites = tablFasilites.getValueAt(tablFasilites.getSelectedRow(), 2).toString();
                String FasilitessPrice = tablFasilites.getValueAt(tablFasilites.getSelectedRow(), 3).toString();
                

                
                

                FasilitesIDtxt.setText(FasilitesTYpeId);
                FasilitesNametxt1.setText(FasilitesName);
                Fasilitestxt1.setText(Fasilites);
                Pricetxt.setText(FasilitessPrice);
              
                
            }
        });
    }
     private void loadAllGues() {
        
        try {
            ArrayList<FasilitesDTO> allFasilites = ManegeFasilites.getAllFalitites();

            DefaultTableModel dtm = (DefaultTableModel)tablFasilites.getModel();

            dtm.setRowCount(0);

            if (allFasilites != null) {

                for (FasilitesDTO fasilites : allFasilites) {

                    Object[] rowData = {
                        fasilites.getId(),
                        fasilites.getName(),
                        fasilites.getFasilites(),
                        fasilites.getPrice()
                    };

                    dtm.addRow(rowData);

                }

            }
        } catch (Exception ex) {
            Logger.getLogger(Fasilites.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        FasilitesIDtxt = new org.jdesktop.swingx.JXTextField();
        Pricetxt = new org.jdesktop.swingx.JXTextField();
        jLabel13 = new javax.swing.JLabel();
        btnFasilitesAdd = new javax.swing.JButton();
        FasilitesNametxt1 = new org.jdesktop.swingx.JXTextField();
        Fasilitestxt1 = new org.jdesktop.swingx.JXTextField();
        FasilitesDelBtn = new javax.swing.JButton();
        FasilitesUpdatebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablFasilites = new org.jdesktop.swingx.JXTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setText("Facilities Id");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setText("Facilities Name");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel4.setText("Price");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setText("Facilities");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAutoscrolls(true);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setNextFocusableComponent(this);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FasilitesIDtxt.setToolTipText("ID");
        FasilitesIDtxt.setPrompt("ID");
        FasilitesIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FasilitesIDtxtActionPerformed(evt);
            }
        });
        jPanel1.add(FasilitesIDtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 102, 34));

        Pricetxt.setPrompt("Fasilites");
        jPanel1.add(Pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 40));

        jLabel13.setBackground(new java.awt.Color(0, 0, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/reservation/image/saasa.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 30, 40));

        btnFasilitesAdd.setBackground(new java.awt.Color(0, 0, 153));
        btnFasilitesAdd.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnFasilitesAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnFasilitesAdd.setText("Add");
        btnFasilitesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFasilitesAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnFasilitesAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 100, 60));

        FasilitesNametxt1.setPrompt("Fasilites Name");
        jPanel1.add(FasilitesNametxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 293, 47));

        Fasilitestxt1.setPrompt("Fasilites");
        jPanel1.add(Fasilitestxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 440, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 570, 350));

        FasilitesDelBtn.setBackground(new java.awt.Color(0, 0, 204));
        FasilitesDelBtn.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        FasilitesDelBtn.setForeground(new java.awt.Color(255, 255, 255));
        FasilitesDelBtn.setText("Delet");
        FasilitesDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FasilitesDelBtnActionPerformed(evt);
            }
        });
        add(FasilitesDelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 90, 47));

        FasilitesUpdatebtn.setBackground(new java.awt.Color(0, 0, 204));
        FasilitesUpdatebtn.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        FasilitesUpdatebtn.setForeground(new java.awt.Color(255, 255, 255));
        FasilitesUpdatebtn.setText("Update");
        FasilitesUpdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FasilitesUpdatebtnActionPerformed(evt);
            }
        });
        add(FasilitesUpdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 90, 50));

        tablFasilites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Faslilites Name", "Fasilites", "price"
            }
        ));
        jScrollPane2.setViewportView(tablFasilites);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 790, 190));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Facilities Details");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 1140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void FasilitesIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FasilitesIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FasilitesIDtxtActionPerformed

    private void btnFasilitesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFasilitesAddActionPerformed
        try {
            FasilitesDTO Fasilites = new FasilitesDTO(
                    FasilitesIDtxt.getText(),
                    FasilitesNametxt1.getText(),
                    Fasilitestxt1.getText(),
                    Pricetxt.getText()
            );
            
            boolean result = ManegeFasilites.addFaslites(Fasilites);

            if (result) {
                JOptionPane.showMessageDialog(this, "Fasilites has been successfully added.");
                loadAllGues();
            } else {
                JOptionPane.showMessageDialog(this, "Fasilites hasn't been added due to some error");
            }
        } catch (Exception ex) {
            Logger.getLogger(Fasilites.class.getName()).log(Level.SEVERE, null, ex);
        }

        

    }//GEN-LAST:event_btnFasilitesAddActionPerformed

    private void FasilitesDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FasilitesDelBtnActionPerformed
       FasilitesDTO Fasilites = new FasilitesDTO(
                FasilitesIDtxt.getText(),
                    Pricetxt.getText(),
                    Pricetxt.getText(),
                    Pricetxt.getText()
                );
        try {
            boolean result = ManegeFasilites.deleteFaslites(Fasilites);

            if (result) {
                JOptionPane.showMessageDialog(this, "Fasilites has been successfully deleted.");
                loadAllGues();
            } else {
                JOptionPane.showMessageDialog(this, "Fasilites hasn't been deleted due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManegeGuest.class.getName()).log(Level.SEVERE, null, ex);
        }
                      
    }//GEN-LAST:event_FasilitesDelBtnActionPerformed

    private void FasilitesUpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FasilitesUpdatebtnActionPerformed
        FasilitesDTO Fasilites = new FasilitesDTO(
                FasilitesIDtxt.getText(),
                    Pricetxt.getText(),
                    Pricetxt.getText(),
                    Pricetxt.getText()
                );
        try {
            boolean result = ManegeFasilites.updateFaslites(Fasilites);

            if (result) {
                JOptionPane.showMessageDialog(this, "Fasilites has been successfully deleted.");
                loadAllGues();
            } else {
                JOptionPane.showMessageDialog(this, "Fasilites hasn't been deleted due to some error");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManegeGuest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FasilitesUpdatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FasilitesDelBtn;
    private org.jdesktop.swingx.JXTextField FasilitesIDtxt;
    private org.jdesktop.swingx.JXTextField FasilitesNametxt1;
    private javax.swing.JButton FasilitesUpdatebtn;
    private org.jdesktop.swingx.JXTextField Fasilitestxt1;
    private org.jdesktop.swingx.JXTextField Pricetxt;
    private javax.swing.JButton btnFasilitesAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXTable tablFasilites;
    // End of variables declaration//GEN-END:variables
}