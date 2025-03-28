package View;

import java.awt.Color;

public class SystemExitConfirm extends java.awt.Dialog {


    public SystemExitConfirm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCustomPanel1 = new JCustom.JCustomPanel();
        avisoTxt = new javax.swing.JLabel();
        sairBtn = new JCustom.JCustomButton();
        continuarBtn = new JCustom.JCustomButton();

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jCustomPanel1.setBackground(new java.awt.Color(6, 61, 56));
        jCustomPanel1.setRound(20);

        avisoTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        avisoTxt.setForeground(new java.awt.Color(255, 249, 237));
        avisoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avisoTxt.setText("Deseja fechar o programa??");

        sairBtn.setForeground(new java.awt.Color(255, 255, 255));
        sairBtn.setText("Fechar");
        sairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sairBtn.setRound(10);
        sairBtn.setStyle(JCustom.JCustomButton.ButtonStyle.EXIT);
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        continuarBtn.setForeground(new java.awt.Color(107, 62, 35));
        continuarBtn.setText("Continuar");
        continuarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        continuarBtn.setRound(10);
        continuarBtn.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);
        continuarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCustomPanel1Layout = new javax.swing.GroupLayout(jCustomPanel1);
        jCustomPanel1.setLayout(jCustomPanel1Layout);
        jCustomPanel1Layout.setHorizontalGroup(
            jCustomPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avisoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCustomPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(continuarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jCustomPanel1Layout.setVerticalGroup(
            jCustomPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(avisoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jCustomPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continuarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15))
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
        System.exit(0);
    }//GEN-LAST:event_sairBtnActionPerformed

    private void continuarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtnActionPerformed
        dispose();
    }//GEN-LAST:event_continuarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoTxt;
    private JCustom.JCustomButton continuarBtn;
    private JCustom.JCustomPanel jCustomPanel1;
    private JCustom.JCustomButton sairBtn;
    // End of variables declaration//GEN-END:variables
}
