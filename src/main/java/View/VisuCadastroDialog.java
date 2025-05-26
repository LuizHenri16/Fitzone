package View;

import Controller.ClienteController;
import Entity.Cliente;
import Entity.UserAccess;
import Validation.CRIPTOGRAFAR;
import Validation.FORMAT;

public class VisuCadastroDialog extends java.awt.Dialog {

    private UserAccess user;
    private Cliente cliente;

    public VisuCadastroDialog(java.awt.Frame parent, boolean modal, UserAccess user, String IdCliente) { 
        super(parent, modal);   
        initComponents();

        this.user = user;
        this.cliente = ClienteController.listarCliente(IdCliente);

        userPermissao();
        preencherCampos();
        desativarCampos();
    }

    public void userPermissao() {
        if (user.getAccessType().equals("Parcial")) {
            editarAlunoBtn.setEnabled(false);
            editarAlunoBtn.setVisible(false);
            
            removerAlunoBtn.setEnabled(false);
            removerAlunoBtn.setVisible(false);
            
            confirmarEdicaoBtn.setEnabled(false);
            confirmarEdicaoBtn.setVisible(false);
            
        }
    }
    
    public void excluirCliente() {
        ClienteController.excluirController(cliente);
    }

    public void preencherCampos() {
        tfNomeCliente.setText(cliente.getNome());
        tfEnderecoCliente.setText(cliente.getEndereco().getAddress());
        tfCPFCLiente.setText(CRIPTOGRAFAR.decryptAES(cliente.getCpf()));
        tfTelefoneCliente.setText(cliente.getContato().getNumero());
        tfTelefoneEmergenciaCliente.setText(cliente.getContato().getNumero_emeregencia());
        tfEmailCliente.setText(cliente.getEmail());
        tfAlturaCliente.setText(String.valueOf(cliente.getInfoComplement().getHeight()));
        tfPesoCliente.setText(String.valueOf(cliente.getInfoComplement().getWeight()));
        tfdataNascimento.setText(FORMAT.converterData(cliente.getDataNascimento()));
        tfHistoricoSaudeCliente.setText(cliente.getInfoComplement().getHealthHistory());
        
        if (cliente.getStatus().equals("Ativo")) {
            cbStatus.setSelectedIndex(1);
        } else if (cliente.getStatus().equals("Inativo")) {
            cbStatus.setSelectedIndex(0);
        }
        
         if (cliente.getMatricula().getId() == 1) {
            cbMatricula.setSelectedIndex(1);
        } else if (cliente.getMatricula().getId() == 2) {
             cbMatricula.setSelectedIndex(2);
        }

    }

    public void desativarCampos() {
        tfNomeCliente.setEditable(false);
        tfCPFCLiente.setEditable(false);
        tfEnderecoCliente.setEditable(false);
        tfTelefoneCliente.setEditable(false);
        tfTelefoneEmergenciaCliente.setEditable(false);
        tfEmailCliente.setEditable(false);
        tfAlturaCliente.setEditable(false);
        tfPesoCliente.setEditable(false);
        tfdataNascimento.setEditable(false);
        cbStatus.setEnabled(false);
        cbMatricula.setEnabled(false);
        tfHistoricoSaudeCliente.setEditable(false);
    }

    public void ativarCampos() {
        tfNomeCliente.setEditable(true);
        tfCPFCLiente.setEditable(true);
        tfEnderecoCliente.setEditable(true);
        tfTelefoneCliente.setEditable(true);
        tfTelefoneEmergenciaCliente.setEditable(true);
        tfEmailCliente.setEditable(true);
        tfAlturaCliente.setEditable(true);
        tfPesoCliente.setEditable(true);
        tfdataNascimento.setEditable(true);
        cbStatus.setEnabled(true);
        cbMatricula.setEnabled(true);
        tfHistoricoSaudeCliente.setEditable(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        editarAlunoBtn = new JCustom.JCustomButton();
        confirmarEdicaoBtn = new JCustom.JCustomButton();
        removerAlunoBtn = new JCustom.JCustomButton();
        sairBtn = new JCustom.JCustomButton();
        jLabel12 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        tfTelefoneEmergenciaCliente = new javax.swing.JFormattedTextField();
        tfTelefoneCliente = new javax.swing.JFormattedTextField();
        tfdataNascimento = new javax.swing.JFormattedTextField();
        tfCPFCLiente = new javax.swing.JFormattedTextField();

        setResizable(false);
        setTitle("Visualizar Cadastro de Aluno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        editPanel.setBackground(new java.awt.Color(243, 243, 243));

        jLabel1.setForeground(new java.awt.Color(85, 85, 85));
        jLabel1.setText("Nome Completo");

        tfNomeCliente.setEditable(false);
        tfNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfNomeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfNomeCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfNomeCliente.setToolTipText("editar nome de usuário");
        tfNomeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfNomeCliente.setMaximumSize(new java.awt.Dimension(370, 40));
        tfNomeCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel3.setForeground(new java.awt.Color(85, 85, 85));
        jLabel3.setText("CPF");

        jLabel4.setForeground(new java.awt.Color(85, 85, 85));
        jLabel4.setText("Data de Nascimento");

        jLabel5.setForeground(new java.awt.Color(85, 85, 85));
        jLabel5.setText("Número de Telefone");

        jLabel6.setForeground(new java.awt.Color(85, 85, 85));
        jLabel6.setText("Número de Emergência");

        jLabel7.setForeground(new java.awt.Color(85, 85, 85));
        jLabel7.setText("Email");

        tfEmailCliente.setEditable(false);
        tfEmailCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfEmailCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEmailCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEmailCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEmailCliente.setToolTipText("editar email");
        tfEmailCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfEmailCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfEmailCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel2.setForeground(new java.awt.Color(85, 85, 85));
        jLabel2.setText("Endereço");

        tfEnderecoCliente.setEditable(false);
        tfEnderecoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfEnderecoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEnderecoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEnderecoCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEnderecoCliente.setToolTipText("editar endereço");
        tfEnderecoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel8.setForeground(new java.awt.Color(85, 85, 85));
        jLabel8.setText("Peso");

        tfAlturaCliente.setEditable(false);
        tfAlturaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfAlturaCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfAlturaCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfAlturaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAlturaCliente.setToolTipText("editar peso");
        tfAlturaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfAlturaCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel10.setForeground(new java.awt.Color(85, 85, 85));
        jLabel10.setText("Histórico de Saúde");

        jScrollPane3.setBorder(null);

        tfHistoricoSaudeCliente.setEditable(false);
        tfHistoricoSaudeCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfHistoricoSaudeCliente.setColumns(20);
        tfHistoricoSaudeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfHistoricoSaudeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfHistoricoSaudeCliente.setRows(5);
        tfHistoricoSaudeCliente.setToolTipText("editar condição médica");
        tfHistoricoSaudeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfHistoricoSaudeCliente.setMinimumSize(new java.awt.Dimension(200, 22));
        jScrollPane3.setViewportView(tfHistoricoSaudeCliente);

        jLabel11.setForeground(new java.awt.Color(85, 85, 85));
        jLabel11.setText("Matrícula");

        cbMatricula.setBackground(new java.awt.Color(255, 255, 255));
        cbMatricula.setForeground(new java.awt.Color(54, 54, 54));
        cbMatricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Mensal", "Quinzenal" }));
        cbMatricula.setToolTipText("trocar matricula");
        cbMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel9.setForeground(new java.awt.Color(85, 85, 85));
        jLabel9.setText("Altura");

        tfPesoCliente.setEditable(false);
        tfPesoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfPesoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfPesoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfPesoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPesoCliente.setToolTipText("editar altura");
        tfPesoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfPesoCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        editarAlunoBtn.setForeground(new java.awt.Color(255, 249, 237));
        editarAlunoBtn.setText("Editar");
        editarAlunoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarAlunoBtn.setRound(10);
        editarAlunoBtn.setStyle(JCustom.JCustomButton.ButtonStyle.UPDATE);
        editarAlunoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAlunoBtnActionPerformed(evt);
            }
        });

        confirmarEdicaoBtn.setForeground(new java.awt.Color(107, 62, 35));
        confirmarEdicaoBtn.setText("Confirmar");
        confirmarEdicaoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmarEdicaoBtn.setRound(10);
        confirmarEdicaoBtn.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);
        confirmarEdicaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarEdicaoBtnActionPerformed(evt);
            }
        });

        removerAlunoBtn.setForeground(new java.awt.Color(255, 249, 237));
        removerAlunoBtn.setText("Remover");
        removerAlunoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        removerAlunoBtn.setRound(10);
        removerAlunoBtn.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);
        removerAlunoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAlunoBtnActionPerformed(evt);
            }
        });

        sairBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sairBtn.setForeground(new java.awt.Color(107, 62, 35));
        sairBtn.setText("Sair");
        sairBtn.setToolTipText("Sair da Visualização de Cliente");
        sairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sairBtn.setRound(10);
        sairBtn.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(85, 85, 85));
        jLabel12.setText("Status");

        cbStatus.setBackground(new java.awt.Color(255, 255, 255));
        cbStatus.setForeground(new java.awt.Color(54, 54, 54));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inativo", "Ativo", " ", " " }));
        cbStatus.setToolTipText("definir status");
        cbStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

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

        tfTelefoneEmergenciaCliente.setEditable(false);
        tfTelefoneEmergenciaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefoneEmergenciaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneEmergenciaCliente.setForeground(new java.awt.Color(51, 51, 51));
        try {
            tfTelefoneEmergenciaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefoneEmergenciaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefoneEmergenciaCliente.setToolTipText("editar telefone de emergência");
        tfTelefoneEmergenciaCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfTelefoneCliente.setEditable(false);
        tfTelefoneCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefoneCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneCliente.setForeground(new java.awt.Color(51, 51, 51));
        try {
            tfTelefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefoneCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefoneCliente.setToolTipText("editar telefone");
        tfTelefoneCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfdataNascimento.setEditable(false);
        tfdataNascimento.setBackground(new java.awt.Color(255, 255, 255));
        tfdataNascimento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfdataNascimento.setForeground(new java.awt.Color(54, 54, 54));
        try {
            tfdataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfdataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdataNascimento.setToolTipText("editar data de nascimento");
        tfdataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfCPFCLiente.setEditable(false);
        tfCPFCLiente.setBackground(new java.awt.Color(255, 255, 255));
        tfCPFCLiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfCPFCLiente.setForeground(new java.awt.Color(51, 51, 51));
        try {
            tfCPFCLiente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPFCLiente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCPFCLiente.setToolTipText("inserir cpf");
        tfCPFCLiente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(editarAlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(confirmarEdicaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerAlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCPFCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPFCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarAlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarEdicaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerAlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(editPanel, java.awt.BorderLayout.CENTER);

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

    private void editarAlunoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAlunoBtnActionPerformed
        ativarCampos();
        editarAlunoBtn.setEnabled(false);
    }//GEN-LAST:event_editarAlunoBtnActionPerformed

    private void confirmarEdicaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarEdicaoBtnActionPerformed
        ClienteController.editarController( cliente ,tfNomeCliente, tfCPFCLiente, tfdataNascimento, tfTelefoneCliente, tfTelefoneEmergenciaCliente, tfEmailCliente, tfEnderecoCliente, tfPesoCliente, tfAlturaCliente, tfHistoricoSaudeCliente, cbMatricula, cbStatus);
    }//GEN-LAST:event_confirmarEdicaoBtnActionPerformed

    private void removerAlunoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAlunoBtnActionPerformed
        excluirCliente();
        dispose();
    }//GEN-LAST:event_removerAlunoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMatricula;
    private javax.swing.JComboBox<String> cbStatus;
    private JCustom.JCustomButton confirmarEdicaoBtn;
    private javax.swing.JPanel editPanel;
    private JCustom.JCustomButton editarAlunoBtn;
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
    private JCustom.JCustomButton removerAlunoBtn;
    private JCustom.JCustomButton sairBtn;
    private javax.swing.JTextField tfAlturaCliente;
    private javax.swing.JFormattedTextField tfCPFCLiente;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfEnderecoCliente;
    private javax.swing.JTextArea tfHistoricoSaudeCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfPesoCliente;
    private javax.swing.JFormattedTextField tfTelefoneCliente;
    private javax.swing.JFormattedTextField tfTelefoneEmergenciaCliente;
    private javax.swing.JFormattedTextField tfdataNascimento;
    // End of variables declaration//GEN-END:variables
}
