package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class VisualizarADMDialog extends java.awt.Dialog {


    public VisualizarADMDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VisualizarADMTable = new javax.swing.JTable();
        sairBtn = new JCustom.JCustomButton();
        removerUsuarioBtn = new JCustom.JCustomButton();

        setResizable(false);
        setTitle("Visualizar Administradores");
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 243, 243));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/smalllogo-image.png"))); // NOI18N
        jLabel17.setText("Visualizar Administradores");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        VisualizarADMTable.getTableHeader().setBackground(new Color(240, 240,240));
        VisualizarADMTable.getTableHeader().setForeground(new Color(107, 62,35));
        VisualizarADMTable.getTableHeader().setReorderingAllowed(false);
        VisualizarADMTable.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        VisualizarADMTable.getTableHeader().setPreferredSize(new Dimension(VisualizarADMTable.getTableHeader().getWidth(), 30));
        VisualizarADMTable.setBackground(new java.awt.Color(255, 255, 255));
        VisualizarADMTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VisualizarADMTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Usuário", "Tipo de Acesso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        VisualizarADMTable.setGridColor(new java.awt.Color(107, 62, 35));
        VisualizarADMTable.setRowHeight(35);
        VisualizarADMTable.setSelectionBackground(new java.awt.Color(255, 249, 237));
        VisualizarADMTable.setSelectionForeground(new java.awt.Color(107, 62, 35));
        jScrollPane1.setViewportView(VisualizarADMTable);

        sairBtn.setForeground(new java.awt.Color(107, 62, 35));
        sairBtn.setText("Sair");
        sairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sairBtn.setRound(10);
        sairBtn.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        removerUsuarioBtn.setForeground(new java.awt.Color(255, 249, 237));
        removerUsuarioBtn.setText("Remover");
        removerUsuarioBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removerUsuarioBtn.setRound(10);
        removerUsuarioBtn.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);
        removerUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerUsuarioBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(8, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removerUsuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerUsuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

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

    private void removerUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerUsuarioBtnActionPerformed

    }//GEN-LAST:event_removerUsuarioBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VisualizarADMTable;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private JCustom.JCustomButton removerUsuarioBtn;
    private JCustom.JCustomButton sairBtn;
    // End of variables declaration//GEN-END:variables
}
