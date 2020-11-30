/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Telas;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

/**
 *
 * @author manoel
 */
public class Info extends javax.swing.JPanel {

    SystemInfo si = new SystemInfo();
    CentralProcessor.ProcessorIdentifier cpu = si.getHardware().getProcessor().getProcessorIdentifier();
    
    /**
     * Creates new form Info
     */
    public Info() {
        initComponents();
        
        lblOperatingSystem.setText(si.getOperatingSystem().toString());
        lblCPUName.setText(cpu.getName());
        lblCPUIdentifier.setText(cpu.getIdentifier());
        lblCPUMicroArchtecture.setText(cpu.getMicroarchitecture());
        lblCPUVendor.setText(cpu.getVendor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblOperatingSystem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCPUVendor = new javax.swing.JLabel();
        lblCPUMicroArchtecture = new javax.swing.JLabel();
        lblCPUIdentifier = new javax.swing.JLabel();
        lblCPUName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Informa��es do Sistema");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("INFORMA��ES DO SISTEMA ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lblOperatingSystem.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblOperatingSystem.setForeground(new java.awt.Color(0, 153, 153));
        lblOperatingSystem.setText(":");
        jPanel1.add(lblOperatingSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 260, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Processador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, 30));

        lblCPUVendor.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblCPUVendor.setForeground(new java.awt.Color(0, 153, 153));
        lblCPUVendor.setText(":");
        jPanel1.add(lblCPUVendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 370, -1));

        lblCPUMicroArchtecture.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblCPUMicroArchtecture.setForeground(new java.awt.Color(0, 153, 153));
        lblCPUMicroArchtecture.setText(":");
        jPanel1.add(lblCPUMicroArchtecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 380, -1));

        lblCPUIdentifier.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblCPUIdentifier.setForeground(new java.awt.Color(0, 153, 153));
        lblCPUIdentifier.setText(":");
        jPanel1.add(lblCPUIdentifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 370, 30));

        lblCPUName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        lblCPUName.setForeground(new java.awt.Color(0, 153, 153));
        lblCPUName.setText(":");
        jPanel1.add(lblCPUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 380, 30));

        jLabel10.setBackground(new java.awt.Color(255, 0, 51));
        jLabel10.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("MachineTech");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 90, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Sistema Operacional");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
      
    }//GEN-LAST:event_jLabel21MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPUIdentifier;
    private javax.swing.JLabel lblCPUMicroArchtecture;
    private javax.swing.JLabel lblCPUName;
    private javax.swing.JLabel lblCPUVendor;
    private javax.swing.JLabel lblOperatingSystem;
    // End of variables declaration//GEN-END:variables
}