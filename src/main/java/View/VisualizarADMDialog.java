package View;

import Controller.UserAccessController;
import Entity.UserAccess;
import Validation.DIALOG;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class VisualizarADMDialog extends java.awt.Dialog {


    public VisualizarADMDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ListarCadastroADMs();
    }
    
    
    public void ListarCadastroADMs() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaADMs.getModel();
        modelo.setRowCount(0);
        
        List<UserAccess> listaAdms = UserAccessController.listarController();
        
        for (UserAccess user : listaAdms) {
            String[] linha = {
              String.valueOf(user.getId()), user.getName(), user.getAccessType()
            };
            
           modelo.addRow(linha);
        }
        
        tabelaADMs.setModel(modelo);
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tabelaAdmScrollPane = new javax.swing.JScrollPane();
        tabelaADMs = new javax.swing.JTable();
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

        tabelaAdmScrollPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 62, 35), 2, true));

        tabelaADMs.getTableHeader().setBackground(new Color(240, 240,240));
        tabelaADMs.getTableHeader().setForeground(new Color(107, 62,35));
        tabelaADMs.getTableHeader().setReorderingAllowed(false);
        tabelaADMs.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaADMs.getTableHeader().setPreferredSize(new Dimension(tabelaADMs.getTableHeader().getWidth(), 30));
        tabelaADMs.setBackground(new java.awt.Color(255, 255, 255));
        tabelaADMs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaADMs.setIntercellSpacing(new Dimension(0, 0));
        tabelaADMs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Usuário", "Tipo de Acesso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaADMs.setFocusable(false);
        tabelaADMs.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaADMs.setRowHeight(35);
        tabelaADMs.setSelectionBackground(new java.awt.Color(255, 249, 237));
        tabelaADMs.setSelectionForeground(new java.awt.Color(107, 62, 35));
        tabelaADMs.setShowGrid(false);
        tabelaAdmScrollPane.setViewportView(tabelaADMs);
        if (tabelaADMs.getColumnModel().getColumnCount() > 0) {
            tabelaADMs.getColumnModel().getColumn(0).setResizable(false);
            tabelaADMs.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaADMs.getColumnModel().getColumn(1).setResizable(false);
            tabelaADMs.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaADMs.getColumnModel().getColumn(2).setResizable(false);
            tabelaADMs.getColumnModel().getColumn(2).setPreferredWidth(150);
        }
        DefaultTableCellRenderer centralizarTabela = new DefaultTableCellRenderer();
        centralizarTabela.setHorizontalAlignment(SwingConstants.CENTER);

        tabelaADMs.getAccessibleContext().setAccessibleName("");
        for (int i = 0; i < tabelaADMs.getColumnCount(); i++) {
            tabelaADMs.getColumnModel().getColumn(i).setCellRenderer(centralizarTabela);
        }

        TableCellRenderer baseRenderer1 = tabelaADMs.getTableHeader().getDefaultRenderer();

        tabelaADMs.getTableHeader().setDefaultRenderer((tbl, value, isSelected, hasFocus, row, column) -> {
            JComponent comp = (JComponent) baseRenderer1.getTableCellRendererComponent(tbl, value, isSelected, hasFocus, row, column);
            comp.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            return comp;
        });

        sairBtn.setForeground(new java.awt.Color(107, 62, 35));
        sairBtn.setText("Sair");
        sairBtn.setToolTipText("Sair ");
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
        removerUsuarioBtn.setToolTipText("remover administrador");
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
                        .addComponent(tabelaAdmScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(tabelaAdmScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int linhaSelecionada = tabelaADMs.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            DIALOG.exbirMensagem(null, "Escolha um usuário administrador");
        } else {
            UserAccessController.apagarController((String) tabelaADMs.getValueAt(linhaSelecionada, 0));
            ListarCadastroADMs();
        }
    }//GEN-LAST:event_removerUsuarioBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private JCustom.JCustomButton removerUsuarioBtn;
    private JCustom.JCustomButton sairBtn;
    private javax.swing.JTable tabelaADMs;
    private javax.swing.JScrollPane tabelaAdmScrollPane;
    // End of variables declaration//GEN-END:variables
}
