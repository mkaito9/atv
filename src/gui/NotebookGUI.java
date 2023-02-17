/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.NotebookDAO;
import javax.swing.JOptionPane;
import model.Notebook;

/**
 *
 * @author matig
 */
public class NotebookGUI extends javax.swing.JFrame {

    /**
     * Creates new form NotebookGUI
     */
    public NotebookGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoMemoria = new javax.swing.ButtonGroup();
        grupoArmazenamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnFechar = new javax.swing.JToggleButton();
        btnVoltar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProcessador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtArmazenamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPlacaDeVideo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPolegadas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtResolucao = new javax.swing.JTextField();
        rdbDDR4 = new javax.swing.JRadioButton();
        rdbDDR3 = new javax.swing.JRadioButton();
        rdbSSD = new javax.swing.JRadioButton();
        rdbHD = new javax.swing.JRadioButton();
        btnCadastrar = new javax.swing.JToggleButton();
        btnLimpar1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 44, 105));
        jPanel1.setName(""); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CADASTRO DE NOTEBOOK");
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        btnFechar.setBackground(new java.awt.Color(65, 47, 105));
        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("X");
        btnFechar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnFechar.setContentAreaFilled(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(65, 47, 105));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("<");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODELO:");

        txtModelo.setBackground(new java.awt.Color(65, 47, 105));
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        txtModelo.setToolTipText("");
        txtModelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MARCA:");

        txtMarca.setBackground(new java.awt.Color(65, 47, 105));
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setToolTipText("");
        txtMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PROCESSADOR:");

        txtProcessador.setBackground(new java.awt.Color(65, 47, 105));
        txtProcessador.setForeground(new java.awt.Color(255, 255, 255));
        txtProcessador.setToolTipText("");
        txtProcessador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RAM:");

        txtRam.setBackground(new java.awt.Color(65, 47, 105));
        txtRam.setForeground(new java.awt.Color(255, 255, 255));
        txtRam.setToolTipText("");
        txtRam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ARMAZENAMENTO:");

        txtArmazenamento.setBackground(new java.awt.Color(65, 47, 105));
        txtArmazenamento.setForeground(new java.awt.Color(255, 255, 255));
        txtArmazenamento.setToolTipText("");
        txtArmazenamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PLACA DE VIDEO:");

        txtPlacaDeVideo.setBackground(new java.awt.Color(65, 47, 105));
        txtPlacaDeVideo.setForeground(new java.awt.Color(255, 255, 255));
        txtPlacaDeVideo.setToolTipText("");
        txtPlacaDeVideo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("POLEGADAS:");

        txtPolegadas.setBackground(new java.awt.Color(65, 47, 105));
        txtPolegadas.setForeground(new java.awt.Color(255, 255, 255));
        txtPolegadas.setToolTipText("");
        txtPolegadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RESOLUÇÃO:");

        txtResolucao.setBackground(new java.awt.Color(65, 47, 105));
        txtResolucao.setForeground(new java.awt.Color(255, 255, 255));
        txtResolucao.setToolTipText("");
        txtResolucao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        rdbDDR4.setBackground(new java.awt.Color(65, 47, 105));
        grupoMemoria.add(rdbDDR4);
        rdbDDR4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbDDR4.setForeground(new java.awt.Color(255, 255, 255));
        rdbDDR4.setText("DDR4");
        rdbDDR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbDDR4ActionPerformed(evt);
            }
        });

        rdbDDR3.setBackground(new java.awt.Color(65, 47, 105));
        grupoMemoria.add(rdbDDR3);
        rdbDDR3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbDDR3.setForeground(new java.awt.Color(255, 255, 255));
        rdbDDR3.setText("DDR3");
        rdbDDR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbDDR3ActionPerformed(evt);
            }
        });

        rdbSSD.setBackground(new java.awt.Color(65, 47, 105));
        grupoArmazenamento.add(rdbSSD);
        rdbSSD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbSSD.setForeground(new java.awt.Color(255, 255, 255));
        rdbSSD.setText("SSD");
        rdbSSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSSDActionPerformed(evt);
            }
        });

        rdbHD.setBackground(new java.awt.Color(65, 47, 105));
        grupoArmazenamento.add(rdbHD);
        rdbHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdbHD.setForeground(new java.awt.Color(255, 255, 255));
        rdbHD.setText("HD");

        btnCadastrar.setBackground(new java.awt.Color(65, 47, 105));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar1.setBackground(new java.awt.Color(65, 47, 105));
        btnLimpar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar1.setText("LIMPAR");
        btnLimpar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnLimpar1.setContentAreaFilled(false);
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtRam))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtArmazenamento))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPolegadas))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtProcessador))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbDDR3)
                                    .addComponent(rdbHD))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbSSD)
                                    .addComponent(rdbDDR4)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMarca))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtResolucao))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(13, 13, 13)
                                        .addComponent(txtPlacaDeVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPlacaDeVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtPolegadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbHD)
                        .addComponent(rdbSSD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbDDR3)
                    .addComponent(rdbDDR4))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void rdbDDR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbDDR4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbDDR4ActionPerformed

    private void rdbSSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSSDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbSSDActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Notebook notebooks = new Notebook();
        notebooks.setModelo(txtModelo.getText());
        notebooks.setMarca(txtMarca.getText());
        notebooks.setProcessador(txtProcessador.getText());
        notebooks.setRam(txtRam.getText());
        if(rdbDDR3.isSelected()){
            notebooks.setTipoRam("DDR3");
        }
        if(rdbDDR4.isSelected()){
            notebooks.setTipoRam("DDR4");
        }
        notebooks.setArmazenamento(txtArmazenamento.getText());
        if(rdbHD.isSelected()){
            notebooks.setTipoArmazenamento("HD");
        }
        if(rdbSSD.isSelected()){
            notebooks.setTipoArmazenamento("SSD");
        }
        notebooks.setPlacaVideo(txtPlacaDeVideo.getText());
        notebooks.setPolegadas(txtPolegadas.getText());
        notebooks.setResolucao(txtResolucao.getText());
        
        if((txtModelo.getText().isEmpty()) || (txtMarca.getText().isEmpty()) || 
                (txtProcessador.getText().isEmpty()) || (txtRam.getText().isEmpty()) 
                || (txtArmazenamento.getText().isEmpty()) ||  (txtPlacaDeVideo.getText().isEmpty())
                || (txtPolegadas.getText().isEmpty())||(txtResolucao.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "CAMPOS ESTÃO VAZIOS!");
        }
        else{
            NotebookDAO dao = new NotebookDAO();
            dao.adicionaNotebook(notebooks);
            JOptionPane.showMessageDialog(null, "Notebook CADASTRADO COM SUCESSO!");
        }
        
        txtModelo.setText("");
        txtMarca.setText("");
        txtProcessador.setText("");
        txtRam.setText("");
        txtArmazenamento.setText("");
        txtPlacaDeVideo.setText("");
        txtPolegadas.setText("");
        txtResolucao.setText("");
        grupoMemoria.clearSelection();
        grupoArmazenamento.clearSelection();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtProcessador.setText("");
        txtRam.setText("");
        txtArmazenamento.setText("");
        txtPlacaDeVideo.setText("");
        txtPolegadas.setText("");
        txtResolucao.setText("");
        grupoMemoria.clearSelection();
        grupoArmazenamento.clearSelection();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void rdbDDR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbDDR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbDDR3ActionPerformed

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
            java.util.logging.Logger.getLogger(NotebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotebookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotebookGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnFechar;
    private javax.swing.JToggleButton btnLimpar1;
    private javax.swing.JToggleButton btnVoltar;
    private javax.swing.ButtonGroup grupoArmazenamento;
    private javax.swing.ButtonGroup grupoMemoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdbDDR3;
    private javax.swing.JRadioButton rdbDDR4;
    private javax.swing.JRadioButton rdbHD;
    private javax.swing.JRadioButton rdbSSD;
    private javax.swing.JTextField txtArmazenamento;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlacaDeVideo;
    private javax.swing.JTextField txtPolegadas;
    private javax.swing.JTextField txtProcessador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtResolucao;
    // End of variables declaration//GEN-END:variables
}