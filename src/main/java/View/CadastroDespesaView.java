
package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class CadastroDespesaView extends javax.swing.JFrame {


    public CadastroDespesaView() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jCustomButton1 = new JCustom.JCustomButton();
        jCustomButton2 = new JCustom.JCustomButton();
        tfDescricaoDespesa = new javax.swing.JTextField();
        tfDataPagamentoDespesa = new javax.swing.JTextField();
        tfValorDespesa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        despesaTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Despesa");
        setResizable(false);

        panel.setBackground(new java.awt.Color(243, 243, 243));
        panel.setToolTipText("");

        jCustomButton1.setForeground(new java.awt.Color(255, 249, 237));
        jCustomButton1.setText("Concluir");
        jCustomButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCustomButton1.setRound(10);
        jCustomButton1.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);

        jCustomButton2.setForeground(new java.awt.Color(107, 62, 35));
        jCustomButton2.setText("Voltar");
        jCustomButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCustomButton2.setRound(10);
        jCustomButton2.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);
        jCustomButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustomButton2ActionPerformed(evt);
            }
        });

        tfDescricaoDespesa.setBackground(new java.awt.Color(255, 255, 255));
        tfDescricaoDespesa.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfDescricaoDespesa.setForeground(new java.awt.Color(54, 54, 54));
        tfDescricaoDespesa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfDescricaoDespesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfDescricaoDespesa.setMaximumSize(new java.awt.Dimension(370, 40));
        tfDescricaoDespesa.setMinimumSize(new java.awt.Dimension(220, 22));
        tfDescricaoDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoDespesaActionPerformed(evt);
            }
        });

        tfDataPagamentoDespesa.setBackground(new java.awt.Color(255, 255, 255));
        tfDataPagamentoDespesa.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfDataPagamentoDespesa.setForeground(new java.awt.Color(54, 54, 54));
        tfDataPagamentoDespesa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfDataPagamentoDespesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfDataPagamentoDespesa.setMaximumSize(new java.awt.Dimension(370, 40));
        tfDataPagamentoDespesa.setMinimumSize(new java.awt.Dimension(220, 22));

        tfValorDespesa.setBackground(new java.awt.Color(255, 255, 255));
        tfValorDespesa.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfValorDespesa.setForeground(new java.awt.Color(54, 54, 54));
        tfValorDespesa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfValorDespesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfValorDespesa.setMaximumSize(new java.awt.Dimension(370, 40));
        tfValorDespesa.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(107, 62, 35));
        jLabel1.setText("Descrição da Despesa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(107, 62, 35));
        jLabel2.setText("Valor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(107, 62, 35));
        jLabel3.setText("Data");

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 249, 237), 1, true));

        despesaTabela.getTableHeader().setBackground(new Color(240, 240,240));
        despesaTabela.getTableHeader().setForeground(new Color(107, 62,35));
        despesaTabela.getTableHeader().setReorderingAllowed(false);
        despesaTabela.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        despesaTabela.getTableHeader().setPreferredSize(new Dimension(despesaTabela.getTableHeader().getWidth(), 30));
        despesaTabela.setBackground(new java.awt.Color(255, 255, 255));
        despesaTabela.setBackground(new java.awt.Color(255, 255, 255));
        despesaTabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        despesaTabela.setForeground(new java.awt.Color(51, 51, 51));
        despesaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descrição", "Valor", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        despesaTabela.setGridColor(new java.awt.Color(107, 62, 35));
        despesaTabela.setSelectionBackground(new java.awt.Color(255, 249, 237));
        despesaTabela.setSelectionForeground(new java.awt.Color(107, 62, 35));
        jScrollPane1.setViewportView(despesaTabela);
        if (despesaTabela.getColumnModel().getColumnCount() > 0) {
            despesaTabela.getColumnModel().getColumn(0).setResizable(false);
            despesaTabela.getColumnModel().getColumn(0).setPreferredWidth(150);
            despesaTabela.getColumnModel().getColumn(1).setResizable(false);
            despesaTabela.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDataPagamentoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jCustomButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCustomButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfDescricaoDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricaoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataPagamentoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCustomButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCustomButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCustomButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustomButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jCustomButton2ActionPerformed

    private void tfDescricaoDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoDespesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable despesaTabela;
    private JCustom.JCustomButton jCustomButton1;
    private JCustom.JCustomButton jCustomButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField tfDataPagamentoDespesa;
    private javax.swing.JTextField tfDescricaoDespesa;
    private javax.swing.JTextField tfValorDespesa;
    // End of variables declaration//GEN-END:variables
}
