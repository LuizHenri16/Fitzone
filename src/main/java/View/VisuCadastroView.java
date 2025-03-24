package View;

public class VisuCadastroView extends javax.swing.JFrame {

    public VisuCadastroView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCPFCLiente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDataNascimentoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTelefoneCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTelefoneEmergenciaCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEmailCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEnderecoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAlturaCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfHistoricoSaudeCliente = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        cbMatricula = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tfPesoCliente = new javax.swing.JTextField();
        jCustomButton1 = new JCustom.JCustomButton();
        jCustomButton2 = new JCustom.JCustomButton();
        jCustomButton3 = new JCustom.JCustomButton();
        jCustomButton4 = new JCustom.JCustomButton();
        jLabel12 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar dados");
        setAlwaysOnTop(true);
        setResizable(false);

        editPanel.setBackground(new java.awt.Color(243, 243, 243));

        jLabel1.setForeground(new java.awt.Color(85, 85, 85));
        jLabel1.setText("Nome Completo");

        tfNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfNomeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfNomeCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfNomeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfNomeCliente.setMaximumSize(new java.awt.Dimension(370, 40));
        tfNomeCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel3.setForeground(new java.awt.Color(85, 85, 85));
        jLabel3.setText("CPF");

        tfCPFCLiente.setBackground(new java.awt.Color(255, 255, 255));
        tfCPFCLiente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfCPFCLiente.setForeground(new java.awt.Color(54, 54, 54));
        tfCPFCLiente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfCPFCLiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfCPFCLiente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfCPFCLiente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel4.setForeground(new java.awt.Color(85, 85, 85));
        jLabel4.setText("Data de Nascimento");

        tfDataNascimentoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfDataNascimentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfDataNascimentoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfDataNascimentoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataNascimentoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfDataNascimentoCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfDataNascimentoCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel5.setForeground(new java.awt.Color(85, 85, 85));
        jLabel5.setText("Número de Telefone");

        tfTelefoneCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefoneCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfTelefoneCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfTelefoneCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelefoneCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfTelefoneCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel6.setForeground(new java.awt.Color(85, 85, 85));
        jLabel6.setText("Número de Emergência");

        tfTelefoneEmergenciaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefoneEmergenciaCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfTelefoneEmergenciaCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfTelefoneEmergenciaCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelefoneEmergenciaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneEmergenciaCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfTelefoneEmergenciaCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel7.setForeground(new java.awt.Color(85, 85, 85));
        jLabel7.setText("Email");

        tfEmailCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfEmailCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEmailCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEmailCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEmailCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfEmailCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfEmailCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel2.setForeground(new java.awt.Color(85, 85, 85));
        jLabel2.setText("Endereço");

        tfEnderecoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfEnderecoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEnderecoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEnderecoCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEnderecoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel8.setForeground(new java.awt.Color(85, 85, 85));
        jLabel8.setText("Peso");

        tfAlturaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfAlturaCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfAlturaCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfAlturaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAlturaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfAlturaCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel10.setForeground(new java.awt.Color(85, 85, 85));
        jLabel10.setText("Histórico de Saúde");

        jScrollPane3.setBorder(null);

        tfHistoricoSaudeCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfHistoricoSaudeCliente.setColumns(20);
        tfHistoricoSaudeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfHistoricoSaudeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfHistoricoSaudeCliente.setRows(5);
        tfHistoricoSaudeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfHistoricoSaudeCliente.setMinimumSize(new java.awt.Dimension(200, 22));
        jScrollPane3.setViewportView(tfHistoricoSaudeCliente);

        jLabel11.setForeground(new java.awt.Color(85, 85, 85));
        jLabel11.setText("Matrícula");

        cbMatricula.setBackground(new java.awt.Color(255, 255, 255));
        cbMatricula.setForeground(new java.awt.Color(54, 54, 54));
        cbMatricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Mensal", "Quinzena" }));
        cbMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel9.setForeground(new java.awt.Color(85, 85, 85));
        jLabel9.setText("Altura");

        tfPesoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfPesoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfPesoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfPesoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPesoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfPesoCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        jCustomButton1.setForeground(new java.awt.Color(255, 249, 237));
        jCustomButton1.setText("Editar");
        jCustomButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCustomButton1.setRound(10);
        jCustomButton1.setStyle(JCustom.JCustomButton.ButtonStyle.UPDATE);

        jCustomButton2.setForeground(new java.awt.Color(107, 62, 35));
        jCustomButton2.setText("Confirmar");
        jCustomButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCustomButton2.setRound(10);
        jCustomButton2.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);

        jCustomButton3.setForeground(new java.awt.Color(255, 249, 237));
        jCustomButton3.setText("Remover");
        jCustomButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCustomButton3.setRound(10);
        jCustomButton3.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);

        jCustomButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jCustomButton4.setForeground(new java.awt.Color(107, 62, 35));
        jCustomButton4.setText("Sair");
        jCustomButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCustomButton4.setRound(10);
        jCustomButton4.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);
        jCustomButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustomButton4ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(85, 85, 85));
        jLabel12.setText("Status");

        cbStatus.setBackground(new java.awt.Color(255, 255, 255));
        cbStatus.setForeground(new java.awt.Color(54, 54, 54));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inativo", "Ativo", " ", " " }));
        cbStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 243, 243));

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(43, 43, 43));
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/smalllogo-image.png"))); // NOI18N
        labelTitle.setText("Visualizar Cadastro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(jCustomButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jCustomButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCustomButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCustomButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfEmailCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCPFCLiente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDataNascimentoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAlturaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addGap(108, 108, 108)
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(tfPesoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tfEnderecoCliente)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(35, 35, 35))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(tfEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAlturaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(tfPesoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(tfNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPFCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCustomButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCustomButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCustomButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCustomButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void jCustomButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustomButton4ActionPerformed
      dispose();
    }//GEN-LAST:event_jCustomButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMatricula;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JPanel editPanel;
    private JCustom.JCustomButton jCustomButton1;
    private JCustom.JCustomButton jCustomButton2;
    private JCustom.JCustomButton jCustomButton3;
    private JCustom.JCustomButton jCustomButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField tfAlturaCliente;
    private javax.swing.JTextField tfCPFCLiente;
    private javax.swing.JTextField tfDataNascimentoCliente;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfEnderecoCliente;
    private javax.swing.JTextArea tfHistoricoSaudeCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfPesoCliente;
    private javax.swing.JTextField tfTelefoneCliente;
    private javax.swing.JTextField tfTelefoneEmergenciaCliente;
    // End of variables declaration//GEN-END:variables
}
