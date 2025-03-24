package View;

public class CadastroPagamentoView extends javax.swing.JFrame {

    public CadastroPagamentoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        concluirPagamentoBtn = new JCustom.JCustomButton();
        sairBtn = new JCustom.JCustomButton();
        tfUltimoPagamento = new javax.swing.JTextField();
        tfValorPagamento = new javax.swing.JTextField();
        tfTipoMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNovoPagamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Pagamento");
        setResizable(false);

        panel.setBackground(new java.awt.Color(243, 243, 243));

        concluirPagamentoBtn.setForeground(new java.awt.Color(255, 249, 237));
        concluirPagamentoBtn.setText("Concluir");
        concluirPagamentoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        concluirPagamentoBtn.setRound(10);
        concluirPagamentoBtn.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);

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

        tfUltimoPagamento.setBackground(new java.awt.Color(255, 255, 255));
        tfUltimoPagamento.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfUltimoPagamento.setForeground(new java.awt.Color(54, 54, 54));
        tfUltimoPagamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfUltimoPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfUltimoPagamento.setMaximumSize(new java.awt.Dimension(370, 40));
        tfUltimoPagamento.setMinimumSize(new java.awt.Dimension(220, 22));

        tfValorPagamento.setBackground(new java.awt.Color(255, 255, 255));
        tfValorPagamento.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfValorPagamento.setForeground(new java.awt.Color(54, 54, 54));
        tfValorPagamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfValorPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfValorPagamento.setMaximumSize(new java.awt.Dimension(370, 40));
        tfValorPagamento.setMinimumSize(new java.awt.Dimension(220, 22));

        tfTipoMatricula.setBackground(new java.awt.Color(255, 255, 255));
        tfTipoMatricula.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfTipoMatricula.setForeground(new java.awt.Color(54, 54, 54));
        tfTipoMatricula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTipoMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTipoMatricula.setMaximumSize(new java.awt.Dimension(370, 40));
        tfTipoMatricula.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(107, 62, 35));
        jLabel1.setText("Último Pagamento");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(107, 62, 35));
        jLabel2.setText("Matrícula");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(107, 62, 35));
        jLabel3.setText("Valor");

        tfNovoPagamento.setBackground(new java.awt.Color(255, 255, 255));
        tfNovoPagamento.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfNovoPagamento.setForeground(new java.awt.Color(54, 54, 54));
        tfNovoPagamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfNovoPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfNovoPagamento.setMaximumSize(new java.awt.Dimension(370, 40));
        tfNovoPagamento.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(107, 62, 35));
        jLabel4.setText("Data novo Pagamento");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfUltimoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTipoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNovoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(concluirPagamentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUltimoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNovoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTipoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(concluirPagamentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        dispose();
    }//GEN-LAST:event_sairBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCustom.JCustomButton concluirPagamentoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panel;
    private JCustom.JCustomButton sairBtn;
    private javax.swing.JTextField tfNovoPagamento;
    private javax.swing.JTextField tfTipoMatricula;
    private javax.swing.JTextField tfUltimoPagamento;
    private javax.swing.JTextField tfValorPagamento;
    // End of variables declaration//GEN-END:variables
}
