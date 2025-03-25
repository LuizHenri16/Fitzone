package View;

import java.awt.Color;

public class AvisoForm extends java.awt.Dialog {

    public AvisoForm(java.awt.Frame parent, boolean modal, String aviso) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
        avisoTxt.setText(aviso);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCustomPanel1 = new JCustom.JCustomPanel();
        avisoTxt = new javax.swing.JLabel();
        sairBtn = new JCustom.JCustomButton();

        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setLocationRelativeTo(this);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jCustomPanel1.setBackground(new java.awt.Color(6, 61, 56));
        jCustomPanel1.setRound(20);

        avisoTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        avisoTxt.setForeground(new java.awt.Color(255, 255, 255));
        avisoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avisoTxt.setText("Mensagem aqui");

        sairBtn.setForeground(new java.awt.Color(255, 255, 255));
        sairBtn.setText("Ok");
        sairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sairBtn.setRound(10);
        sairBtn.setStyle(JCustom.JCustomButton.ButtonStyle.EXIT);
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCustomPanel1Layout = new javax.swing.GroupLayout(jCustomPanel1);
        jCustomPanel1.setLayout(jCustomPanel1Layout);
        jCustomPanel1Layout.setHorizontalGroup(
            jCustomPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avisoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCustomPanel1Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jCustomPanel1Layout.setVerticalGroup(
            jCustomPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avisoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jCustomPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        dispose();
    }//GEN-LAST:event_sairBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoTxt;
    private JCustom.JCustomPanel jCustomPanel1;
    private JCustom.JCustomButton sairBtn;
    // End of variables declaration//GEN-END:variables
}
