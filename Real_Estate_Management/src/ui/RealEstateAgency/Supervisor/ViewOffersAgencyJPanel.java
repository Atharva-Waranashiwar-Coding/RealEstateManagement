/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.RealEstateAgency.Supervisor;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Ecosystem.Business;
import model.Employee.Broker;
import model.Employee.Employee;
import model.Employee.Supervisor;
import model.Enterprise.Enterprise;
import model.Enterprise.EnterpriseDirectory;
import model.Enterprise.RealEstateAgencyEnterprise;
import model.Organisation.Organisation;
import model.Organisation.PropertyManagementOrganisation;
import model.Organisation.SupervisorOrganisation;
import model.Property.Offer;
import model.Property.Property;
import model.UserAccount.UserAccount;

/**
 *
 * @author payaljadhav
 */
public class ViewOffersAgencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOffersJPanel
     */
    JPanel supervisorWorkArea;
    Supervisor supervisor;
    Business business;

    public ViewOffersAgencyJPanel(JPanel supervisorWorkArea, Supervisor supervisor, Business business) {
        this.supervisorWorkArea = supervisorWorkArea;
        this.supervisor = supervisor;
        this.business = business;
        initComponents();
        populateOffersAgencyTable();
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
        tblOffersAgency = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        tblOffersAgency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Viewer Detail", "Property", "Offer Rate", "Offer Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOffersAgency);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Offered Rate For Properties");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOffersAgency;
    // End of variables declaration//GEN-END:variables

    private void populateOffersAgencyTable() {
        DefaultTableModel model = (DefaultTableModel) tblOffersAgency.getModel();
        model.setRowCount(0);

        ArrayList<Property> allProperties = new ArrayList<>();
        for (Enterprise e : business.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof RealEstateAgencyEnterprise realEstateEnterprise) {
                for (Organisation org : realEstateEnterprise.getOrganisationDirectory().getOrganisationList()) {
                    if (org instanceof SupervisorOrganisation so) {
                        if (so.getEmployeeDirectory().getEmployeeList().contains(supervisor)) {
                            for (Broker b : realEstateEnterprise.getAllBrokers()) {
                                allProperties.addAll(b.getPropertyList());
                            }
                        }
                    }
                }
            }
        }
        ArrayList<Offer> allOffers = new ArrayList<>();
        for (Property p : allProperties) {
            allOffers.addAll(p.getPropertyOffers());
        }
        for (Offer brokerOffer : allOffers) {
            Object row[] = new Object[4];
            row[0] = brokerOffer;
            row[1] = brokerOffer.getProperty();
            row[2] = brokerOffer.getOfferedRate();
            row[3] = brokerOffer.getStatus();
            model.addRow(row);
        }
    }
}
