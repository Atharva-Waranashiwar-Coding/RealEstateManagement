/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Viewer;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Ecosystem.Business;
import model.Property.Offer;
import model.Property.Property;
import model.Property.PropertyDirectory;
import model.UserAccount.UserAccount;
import model.Viewer.Viewer;

/**
 *
 * @author sakshi
 */
public class ViewPropertiesJPanel extends javax.swing.JPanel {
    JPanel ViewWorkArea;
    Business business;
    Viewer viewer;

    /**
     * Creates new form ViewPropertiesJPanel
     */
    public ViewPropertiesJPanel(JPanel ViewWorkArea, Business business, Viewer viewer) {
        initComponents();
        this.ViewWorkArea=ViewWorkArea;
        this.business=business;
        this.viewer=viewer;
        refreshTable();
    }
    
    private void refreshTable(){
        DefaultTableModel model = (DefaultTableModel)tblViewAllProperties.getModel();
        model.setRowCount(0);
        PropertyDirectory pd=this.business.getPropertyDirectory();
        for(Property property:pd.getPropertyList()) {
            Object row[] = new Object[5];
            
            row[0] = property;
            row[1] = property.getRate();
            row[2] = property.getListingType();
            row[3] = property.getPropertyOffers().size();
           
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewAllProperties = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOffer = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tblViewAllProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Property", "Rate", "Listing Type", "Offers"
            }
        ));
        jScrollPane1.setViewportView(tblViewAllProperties);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View All Properties");

        jLabel2.setText("Make An Offer : ");

        txtOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOfferActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSubmit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addGap(159, 159, 159))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOfferActionPerformed
        // TODO add your handling code here:
        
        String priceOffered = txtOffer.getText();
        
        
    }//GEN-LAST:event_txtOfferActionPerformed


    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        // In ViewPropertiesJPanel, inside btnSubmitActionPerformed
        int selectedRow = tblViewAllProperties.getSelectedRow();
        if (selectedRow >= 0) {
            // Get the selected property from the table model
            Property selectedProperty = (Property) tblViewAllProperties.getValueAt(selectedRow, 0);
            business.setLastOfferedProperty(selectedProperty);
            if (selectedProperty != null) {
                try {
                    double offerPrice = Double.parseDouble(txtOffer.getText());
                    Offer newOffer = new Offer(selectedProperty, offerPrice, viewer);
                    viewer.addNewOffer(newOffer);
                    refreshTable();
                    JOptionPane.showMessageDialog(this, "Offer submitted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    txtOffer.setText("");

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid number for the offer.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No property selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewAllProperties;
    private javax.swing.JTextField txtOffer;
    // End of variables declaration//GEN-END:variables
    }
