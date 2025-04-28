package View;

import Controller.FinanceiroController;
import Entity.Despesa;
import Validation.FORMAT;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CadastroDespesaDialog extends java.awt.Dialog {

    public CadastroDespesaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ListarDespesas();
    }

    public void ListarDespesas() {
        DefaultTableModel modelo = (DefaultTableModel) despesaTabela.getModel();
        modelo.setRowCount(0);

        List<Despesa> listaDespesas = FinanceiroController.ListarDespesasController();

        for (Despesa despesa : listaDespesas) {
            String[] linha = {
                despesa.getDescricao(), String.valueOf(despesa.getValor()), FORMAT.converterData(despesa.getData())
            };

            modelo.addRow(linha);
        }

        despesaTabela.setModel(modelo);
    }

    public void limparCampos() {
        tfValorDespesa.setText("");
        tfDescricaoDespesa.setText("");
        tfDataPagamentoDespesa.setText("");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cadastrarDespesaBtn = new JCustom.JCustomButton();
        sairBtn = new JCustom.JCustomButton();
        tfDescricaoDespesa = new javax.swing.JTextField();
        tfValorDespesa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        despesaTabela = new javax.swing.JTable();
        tfDataPagamentoDespesa = new javax.swing.JFormattedTextField();

        setResizable(false);
        setTitle("Cadastro de Despesa");
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        panel.setBackground(new java.awt.Color(243, 243, 243));
        panel.setToolTipText("");

        cadastrarDespesaBtn.setForeground(new java.awt.Color(255, 249, 237));
        cadastrarDespesaBtn.setText("Concluir");
        cadastrarDespesaBtn.setActionCommand("Cadastrar");
        cadastrarDespesaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarDespesaBtn.setRound(10);
        cadastrarDespesaBtn.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);
        cadastrarDespesaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarDespesaBtnActionPerformed(evt);
            }
        });

        sairBtn.setForeground(new java.awt.Color(107, 62, 35));
        sairBtn.setText("Voltar");
        sairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sairBtn.setRound(10);
        sairBtn.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        tfDescricaoDespesa.setBackground(new java.awt.Color(255, 255, 255));
        tfDescricaoDespesa.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfDescricaoDespesa.setForeground(new java.awt.Color(54, 54, 54));
        tfDescricaoDespesa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfDescricaoDespesa.setToolTipText("Descrição da Despesa");
        tfDescricaoDespesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfDescricaoDespesa.setMaximumSize(new java.awt.Dimension(370, 40));
        tfDescricaoDespesa.setMinimumSize(new java.awt.Dimension(220, 22));

        tfValorDespesa.setBackground(new java.awt.Color(255, 255, 255));
        tfValorDespesa.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfValorDespesa.setForeground(new java.awt.Color(54, 54, 54));
        tfValorDespesa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfValorDespesa.setToolTipText("Valor da Despesa");
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

        jScrollPane1.setBackground(new java.awt.Color(243, 243, 243));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 62, 35), 1, true));

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
        despesaTabela.setFocusable(false);
        despesaTabela.setGridColor(new java.awt.Color(107, 62, 35));
        despesaTabela.setRowHeight(30);
        despesaTabela.setSelectionBackground(new java.awt.Color(255, 249, 237));
        despesaTabela.setSelectionForeground(new java.awt.Color(107, 62, 35));
        jScrollPane1.setViewportView(despesaTabela);

        tfDataPagamentoDespesa.setBackground(new java.awt.Color(255, 255, 255));
        tfDataPagamentoDespesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfDataPagamentoDespesa.setForeground(new java.awt.Color(54, 54, 54));
        try {
            tfDataPagamentoDespesa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDataPagamentoDespesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataPagamentoDespesa.setToolTipText("Data da Despesa");
        tfDataPagamentoDespesa.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfDescricaoDespesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cadastrarDespesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDataPagamentoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricaoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfDataPagamentoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarDespesaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        cadastrarDespesaBtn.getAccessibleContext().setAccessibleName("Cadastrar");
        cadastrarDespesaBtn.getAccessibleContext().setAccessibleDescription("Cadastrar Pagamento");
        tfDescricaoDespesa.getAccessibleContext().setAccessibleName("Descrição da Despesa");
        tfValorDespesa.getAccessibleContext().setAccessibleName("Valor da Despesa");
        tfDataPagamentoDespesa.getAccessibleContext().setAccessibleName("");

        add(panel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void cadastrarDespesaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarDespesaBtnActionPerformed
        FinanceiroController.cadastrarDespesaController(tfDescricaoDespesa, tfValorDespesa, tfDataPagamentoDespesa);
        ListarDespesas();
        limparCampos();

    }//GEN-LAST:event_cadastrarDespesaBtnActionPerformed

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        dispose();
    }//GEN-LAST:event_sairBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCustom.JCustomButton cadastrarDespesaBtn;
    private javax.swing.JTable despesaTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private JCustom.JCustomButton sairBtn;
    private javax.swing.JFormattedTextField tfDataPagamentoDespesa;
    private javax.swing.JTextField tfDescricaoDespesa;
    private javax.swing.JTextField tfValorDespesa;
    // End of variables declaration//GEN-END:variables
}
