package View;

import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InicioView extends javax.swing.JFrame {

    public InicioView() {
        initComponents();
        ListarCadastroClientes();
    }
    
    
    public void ListarCadastroClientes() {
        
        DefaultTableModel modelo  = (DefaultTableModel) tabelaClientes.getModel();
        modelo.setRowCount(0);
        
       String[] linha = {
           "1","Luiz", "222", "222", "Ativo"
       };
       
       modelo.addRow(linha);
       
       tabelaClientes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarMenu = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        btViewPrincipal = new JCustom.JCustomButton();
        btViewCAluno = new JCustom.JCustomButton();
        btViewLCadastros = new JCustom.JCustomButton();
        btViewFinanceiro = new JCustom.JCustomButton();
        btViewFTreino = new JCustom.JCustomButton();
        btViewCAdministrador = new JCustom.JCustomButton();
        bottomPanel = new javax.swing.JPanel();
        sairBtn = new JCustom.JCustomButton();
        ViewsPanelCardLayout = new javax.swing.JPanel();
        ViewPrincipal = new javax.swing.JPanel();
        LabelRelogio = new JCustom.JCustomPanel();
        jCustomPanel6 = new JCustom.JCustomPanel();
        jLabelClock1 = new JCustom.JLabelClock();
        jLabelData1 = new JCustom.JLabelData();
        LabelEstatisticas = new JCustom.JCustomPanel();
        jCustomPanel5 = new JCustom.JCustomPanel();
        jLabel19 = new javax.swing.JLabel();
        jCustomPanel4 = new JCustom.JCustomPanel();
        jCustomPanel9 = new JCustom.JCustomPanel();
        jLabel20 = new javax.swing.JLabel();
        alunosCadastradosLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jCustomPanel8 = new JCustom.JCustomPanel();
        jCustomPanel11 = new JCustom.JCustomPanel();
        jLabel21 = new javax.swing.JLabel();
        alunosStatusLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labelAniversario = new JCustom.JCustomPanel();
        jCustomPanel7 = new JCustom.JCustomPanel();
        jLabel26 = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        cardCadastrarAluno = new javax.swing.JPanel();
        tfNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfEnderecoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCPFCLiente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDataNascimentoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTelefoneCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTelefoneEmergenciaCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfEmailCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPesoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAlturaCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfHistoricoSaudeCliente = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbMatricula = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        cadastrarAlunoBtn = new JCustom.JCustomButton();
        cancelarCadastroBtn = new JCustom.JCustomButton();
        limparCamposBtn = new JCustom.JCustomButton();
        ViewListaCadastro = new javax.swing.JPanel();
        cadastroAlunoScrollPane = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        visualizarCadastrosBtn = new JCustom.JCustomButton();
        labelTitle3 = new javax.swing.JLabel();
        ViewFinanceiro = new javax.swing.JPanel();
        labelTitle1 = new javax.swing.JLabel();
        totalMesPanel = new JCustom.JCustomPanel();
        jCustomPanel12 = new JCustom.JCustomPanel();
        jLabel22 = new javax.swing.JLabel();
        totalMesLabel = new javax.swing.JLabel();
        totalReceitasPanel = new JCustom.JCustomPanel();
        jCustomPanel14 = new JCustom.JCustomPanel();
        jLabel27 = new javax.swing.JLabel();
        totalReceitaLabel = new javax.swing.JLabel();
        despesasPanel = new JCustom.JCustomPanel();
        jCustomPanel16 = new JCustom.JCustomPanel();
        jLabel29 = new javax.swing.JLabel();
        despesasLabel = new javax.swing.JLabel();
        FinancerioScrollPane = new javax.swing.JScrollPane();
        FinanceiroTable = new javax.swing.JTable();
        cadastroDespesaBtn = new JCustom.JCustomButton();
        cadastroPagamentoBtn = new JCustom.JCustomButton();
        ViewFichaTreino = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        ViewCadastrarADM = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tfNewUserName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfNewPassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        tfNewPasswordConfirm = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        cbAccessType = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        sidebarMenu.setBackground(new java.awt.Color(243, 243, 243));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(102, 102, 102));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNameLabel.setText("Usuário:");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonsPanel.setBackground(new java.awt.Color(243, 243, 243));

        btViewPrincipal.setForeground(new java.awt.Color(126, 126, 126));
        btViewPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Incio-icon.png"))); // NOI18N
        btViewPrincipal.setText(" Inicio");
        btViewPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btViewPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewPrincipal.setIconTextGap(10);
        btViewPrincipal.setRound(10);
        btViewPrincipal.setStyle(JCustom.JCustomButton.ButtonStyle.DEFAULT);
        btViewPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewPrincipalActionPerformed(evt);
            }
        });

        btViewCAluno.setForeground(new java.awt.Color(126, 126, 126));
        btViewCAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastrarAluno-icon.png"))); // NOI18N
        btViewCAluno.setText("Cadastrar Aluno");
        btViewCAluno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btViewCAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewCAluno.setIconTextGap(10);
        btViewCAluno.setRound(10);
        btViewCAluno.setStyle(JCustom.JCustomButton.ButtonStyle.DEFAULT);
        btViewCAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewCAlunoActionPerformed(evt);
            }
        });

        btViewLCadastros.setForeground(new java.awt.Color(126, 126, 126));
        btViewLCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Vizualizar-icon.png"))); // NOI18N
        btViewLCadastros.setText("Lista Cadastros");
        btViewLCadastros.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btViewLCadastros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewLCadastros.setIconTextGap(10);
        btViewLCadastros.setRound(10);
        btViewLCadastros.setStyle(JCustom.JCustomButton.ButtonStyle.DEFAULT);
        btViewLCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewLCadastrosActionPerformed(evt);
            }
        });

        btViewFinanceiro.setForeground(new java.awt.Color(126, 126, 126));
        btViewFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Financeiro-icon.png"))); // NOI18N
        btViewFinanceiro.setText("Financeiro");
        btViewFinanceiro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btViewFinanceiro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewFinanceiro.setIconTextGap(10);
        btViewFinanceiro.setRound(10);
        btViewFinanceiro.setStyle(JCustom.JCustomButton.ButtonStyle.DEFAULT);
        btViewFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewFinanceiroActionPerformed(evt);
            }
        });

        btViewFTreino.setForeground(new java.awt.Color(126, 126, 126));
        btViewFTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fichaTreino-icon.png"))); // NOI18N
        btViewFTreino.setText("Ficha de Treino");
        btViewFTreino.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btViewFTreino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewFTreino.setIconTextGap(10);
        btViewFTreino.setRound(10);
        btViewFTreino.setStyle(JCustom.JCustomButton.ButtonStyle.DEFAULT);
        btViewFTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewFTreinoActionPerformed(evt);
            }
        });

        btViewCAdministrador.setForeground(new java.awt.Color(126, 126, 126));
        btViewCAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Administrator-icon.png"))); // NOI18N
        btViewCAdministrador.setText("Cadastrar Administrador");
        btViewCAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btViewCAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewCAdministrador.setIconTextGap(10);
        btViewCAdministrador.setRound(10);
        btViewCAdministrador.setStyle(JCustom.JCustomButton.ButtonStyle.DEFAULT);
        btViewCAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewCAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btViewPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewCAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewLCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewFTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewCAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btViewPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btViewCAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btViewLCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btViewFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btViewFTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btViewCAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(243, 243, 243));
        bottomPanel.setToolTipText("");
        bottomPanel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        sairBtn.setForeground(new java.awt.Color(255, 255, 255));
        sairBtn.setText("Sair");
        sairBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sairBtn.setRound(10);
        sairBtn.setStyle(JCustom.JCustomButton.ButtonStyle.EXIT);
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidebarMenuLayout = new javax.swing.GroupLayout(sidebarMenu);
        sidebarMenu.setLayout(sidebarMenuLayout);
        sidebarMenuLayout.setHorizontalGroup(
            sidebarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarMenuLayout.createSequentialGroup()
                        .addGroup(sidebarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        sidebarMenuLayout.setVerticalGroup(
            sidebarMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ViewsPanelCardLayout.setLayout(new java.awt.CardLayout());

        ViewPrincipal.setBackground(new java.awt.Color(243, 243, 243));

        LabelRelogio.setBackground(new java.awt.Color(183, 115, 6));
        LabelRelogio.setRound(40);

        jCustomPanel6.setBackground(new java.awt.Color(219, 255, 247));
        jCustomPanel6.setRound(30);

        jLabelClock1.setForeground(new java.awt.Color(183, 115, 6));
        jLabelClock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClock1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 52)); // NOI18N

        jLabelData1.setForeground(new java.awt.Color(183, 115, 6));
        jLabelData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N

        javax.swing.GroupLayout jCustomPanel6Layout = new javax.swing.GroupLayout(jCustomPanel6);
        jCustomPanel6.setLayout(jCustomPanel6Layout);
        jCustomPanel6Layout.setHorizontalGroup(
            jCustomPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClock1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jLabelData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jCustomPanel6Layout.setVerticalGroup(
            jCustomPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelClock1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelData1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout LabelRelogioLayout = new javax.swing.GroupLayout(LabelRelogio);
        LabelRelogio.setLayout(LabelRelogioLayout);
        LabelRelogioLayout.setHorizontalGroup(
            LabelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelRelogioLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        LabelRelogioLayout.setVerticalGroup(
            LabelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelRelogioLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        LabelEstatisticas.setBackground(new java.awt.Color(183, 115, 6));
        LabelEstatisticas.setRound(50);

        jCustomPanel5.setBackground(new java.awt.Color(243, 243, 243));
        jCustomPanel5.setRound(40);

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(107, 62, 35));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Estatísticas do Sistema");

        jCustomPanel4.setBackground(new java.awt.Color(183, 115, 6));
        jCustomPanel4.setAlignmentX(0.4F);
        jCustomPanel4.setAlignmentY(0.4F);
        jCustomPanel4.setRound(40);

        jCustomPanel9.setBackground(new java.awt.Color(243, 243, 243));
        jCustomPanel9.setRound(30);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/people-icon.png"))); // NOI18N
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        alunosCadastradosLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        alunosCadastradosLabel.setForeground(new java.awt.Color(183, 115, 6));
        alunosCadastradosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alunosCadastradosLabel.setText("12");

        jLabel24.setBackground(new java.awt.Color(126, 126, 126));
        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(126, 126, 126));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Alunos cadastrados");

        javax.swing.GroupLayout jCustomPanel9Layout = new javax.swing.GroupLayout(jCustomPanel9);
        jCustomPanel9.setLayout(jCustomPanel9Layout);
        jCustomPanel9Layout.setHorizontalGroup(
            jCustomPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alunosCadastradosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        jCustomPanel9Layout.setVerticalGroup(
            jCustomPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alunosCadastradosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jCustomPanel4Layout = new javax.swing.GroupLayout(jCustomPanel4);
        jCustomPanel4.setLayout(jCustomPanel4Layout);
        jCustomPanel4Layout.setHorizontalGroup(
            jCustomPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCustomPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jCustomPanel4Layout.setVerticalGroup(
            jCustomPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        jCustomPanel8.setBackground(new java.awt.Color(183, 115, 6));
        jCustomPanel8.setRound(40);

        jCustomPanel11.setBackground(new java.awt.Color(243, 243, 243));
        jCustomPanel11.setRound(30);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/people-icon.png"))); // NOI18N
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        alunosStatusLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        alunosStatusLabel.setForeground(new java.awt.Color(183, 115, 6));
        alunosStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alunosStatusLabel.setText("22");

        jLabel25.setBackground(new java.awt.Color(126, 126, 126));
        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(126, 126, 126));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Alunos ativos");

        javax.swing.GroupLayout jCustomPanel11Layout = new javax.swing.GroupLayout(jCustomPanel11);
        jCustomPanel11.setLayout(jCustomPanel11Layout);
        jCustomPanel11Layout.setHorizontalGroup(
            jCustomPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alunosStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap())
        );
        jCustomPanel11Layout.setVerticalGroup(
            jCustomPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alunosStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jCustomPanel8Layout = new javax.swing.GroupLayout(jCustomPanel8);
        jCustomPanel8.setLayout(jCustomPanel8Layout);
        jCustomPanel8Layout.setHorizontalGroup(
            jCustomPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jCustomPanel8Layout.setVerticalGroup(
            jCustomPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jCustomPanel5Layout = new javax.swing.GroupLayout(jCustomPanel5);
        jCustomPanel5.setLayout(jCustomPanel5Layout);
        jCustomPanel5Layout.setHorizontalGroup(
            jCustomPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel5Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jCustomPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jCustomPanel5Layout.createSequentialGroup()
                        .addComponent(jCustomPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCustomPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jCustomPanel5Layout.setVerticalGroup(
            jCustomPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCustomPanel5Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jCustomPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCustomPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCustomPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LabelEstatisticasLayout = new javax.swing.GroupLayout(LabelEstatisticas);
        LabelEstatisticas.setLayout(LabelEstatisticasLayout);
        LabelEstatisticasLayout.setHorizontalGroup(
            LabelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelEstatisticasLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        LabelEstatisticasLayout.setVerticalGroup(
            LabelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelEstatisticasLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        labelAniversario.setBackground(new java.awt.Color(183, 115, 6));
        labelAniversario.setRound(40);

        jCustomPanel7.setBackground(new java.awt.Color(243, 243, 243));
        jCustomPanel7.setRound(30);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(107, 62, 35));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Aniversariante do Dia");

        javax.swing.GroupLayout jCustomPanel7Layout = new javax.swing.GroupLayout(jCustomPanel7);
        jCustomPanel7.setLayout(jCustomPanel7Layout);
        jCustomPanel7Layout.setHorizontalGroup(
            jCustomPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jCustomPanel7Layout.setVerticalGroup(
            jCustomPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout labelAniversarioLayout = new javax.swing.GroupLayout(labelAniversario);
        labelAniversario.setLayout(labelAniversarioLayout);
        labelAniversarioLayout.setHorizontalGroup(
            labelAniversarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelAniversarioLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        labelAniversarioLayout.setVerticalGroup(
            labelAniversarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelAniversarioLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(43, 43, 43));
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/smalllogo-image.png"))); // NOI18N
        labelTitle.setText("Início");

        javax.swing.GroupLayout ViewPrincipalLayout = new javax.swing.GroupLayout(ViewPrincipal);
        ViewPrincipal.setLayout(ViewPrincipalLayout);
        ViewPrincipalLayout.setHorizontalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelRelogio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelEstatisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAniversario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ViewPrincipalLayout.setVerticalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(LabelEstatisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        ViewsPanelCardLayout.add(ViewPrincipal, "cardPrincipal");

        cardCadastrarAluno.setBackground(new java.awt.Color(243, 243, 243));
        cardCadastrarAluno.setPreferredSize(new java.awt.Dimension(1200, 800));

        tfNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfNomeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfNomeCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfNomeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfNomeCliente.setMaximumSize(new java.awt.Dimension(370, 40));
        tfNomeCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel1.setForeground(new java.awt.Color(85, 85, 85));
        jLabel1.setText("Nome Completo");

        tfEnderecoCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfEnderecoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEnderecoCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEnderecoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel2.setForeground(new java.awt.Color(85, 85, 85));
        jLabel2.setText("Endereço");

        tfCPFCLiente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfCPFCLiente.setForeground(new java.awt.Color(54, 54, 54));
        tfCPFCLiente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfCPFCLiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfCPFCLiente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfCPFCLiente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel3.setForeground(new java.awt.Color(85, 85, 85));
        jLabel3.setText("CPF");

        tfDataNascimentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfDataNascimentoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfDataNascimentoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataNascimentoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfDataNascimentoCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfDataNascimentoCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel4.setForeground(new java.awt.Color(85, 85, 85));
        jLabel4.setText("Data de Nascimento");

        tfTelefoneCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfTelefoneCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfTelefoneCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelefoneCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfTelefoneCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel5.setForeground(new java.awt.Color(85, 85, 85));
        jLabel5.setText("Número de Telefone");

        tfTelefoneEmergenciaCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfTelefoneEmergenciaCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfTelefoneEmergenciaCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelefoneEmergenciaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneEmergenciaCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfTelefoneEmergenciaCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel6.setForeground(new java.awt.Color(85, 85, 85));
        jLabel6.setText("Número de Emergência");

        tfEmailCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfEmailCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEmailCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEmailCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfEmailCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfEmailCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel7.setForeground(new java.awt.Color(85, 85, 85));
        jLabel7.setText("Email");

        tfPesoCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfPesoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfPesoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPesoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfPesoCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel8.setForeground(new java.awt.Color(85, 85, 85));
        jLabel8.setText("Peso");

        tfAlturaCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfAlturaCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfAlturaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAlturaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfAlturaCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel9.setForeground(new java.awt.Color(85, 85, 85));
        jLabel9.setText("Altura");

        jScrollPane3.setBorder(null);

        tfHistoricoSaudeCliente.setColumns(20);
        tfHistoricoSaudeCliente.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfHistoricoSaudeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfHistoricoSaudeCliente.setRows(5);
        tfHistoricoSaudeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfHistoricoSaudeCliente.setMinimumSize(new java.awt.Dimension(200, 22));
        jScrollPane3.setViewportView(tfHistoricoSaudeCliente);

        jLabel10.setForeground(new java.awt.Color(85, 85, 85));
        jLabel10.setText("Histórico de Saúde");

        jLabel11.setForeground(new java.awt.Color(85, 85, 85));
        jLabel11.setText("Matrícula");

        cbMatricula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMatricula.setForeground(new java.awt.Color(51, 51, 51));
        cbMatricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Mensal", "Quinzena" }));
        cbMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        cbMatricula.setDoubleBuffered(true);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/smalllogo-image.png"))); // NOI18N
        jLabel17.setText("Cadastro de Aluno");

        panelButtons.setBackground(new java.awt.Color(243, 243, 243));

        cadastrarAlunoBtn.setForeground(new java.awt.Color(255, 249, 237));
        cadastrarAlunoBtn.setText("Confirmar");
        cadastrarAlunoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarAlunoBtn.setRound(10);
        cadastrarAlunoBtn.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);

        cancelarCadastroBtn.setForeground(new java.awt.Color(107, 62, 35));
        cancelarCadastroBtn.setText("Cancelar");
        cancelarCadastroBtn.setActionCommand("");
        cancelarCadastroBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelarCadastroBtn.setRound(10);
        cancelarCadastroBtn.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);

        limparCamposBtn.setForeground(new java.awt.Color(107, 62, 35));
        limparCamposBtn.setText("Limpar campos");
        limparCamposBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        limparCamposBtn.setRound(10);
        limparCamposBtn.setStyle(JCustom.JCustomButton.ButtonStyle.SECONDARY);

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(limparCamposBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarCadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrarAlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelButtonsLayout.createSequentialGroup()
                        .addComponent(limparCamposBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(panelButtonsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelarCadastroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastrarAlunoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout cardCadastrarAlunoLayout = new javax.swing.GroupLayout(cardCadastrarAluno);
        cardCadastrarAluno.setLayout(cardCadastrarAlunoLayout);
        cardCadastrarAlunoLayout.setHorizontalGroup(
            cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                        .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEmailCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDataNascimentoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCPFCLiente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastrarAlunoLayout.createSequentialGroup()
                                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAlturaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addGap(108, 108, 108)
                                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(tfPesoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tfEnderecoCliente)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        cardCadastrarAlunoLayout.setVerticalGroup(
            cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addGap(23, 23, 23)
                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAlturaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(tfPesoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        ViewsPanelCardLayout.add(cardCadastrarAluno, "cardCadastrarAluno");

        ViewListaCadastro.setBackground(new java.awt.Color(243, 243, 243));

        cadastroAlunoScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        cadastroAlunoScrollPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(107, 62, 35), 2, true));
        cadastroAlunoScrollPane.setMaximumSize(new java.awt.Dimension(1800, 600));
        cadastroAlunoScrollPane.setMinimumSize(new java.awt.Dimension(300, 300));
        cadastroAlunoScrollPane.setPreferredSize(new java.awt.Dimension(850, 500));

        tabelaClientes.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(51, 51, 51));
        tabelaClientes.getTableHeader().setBackground(new Color(240, 240,240));
        tabelaClientes.getTableHeader().setForeground(new Color(107, 62,35));
        tabelaClientes.getTableHeader().setReorderingAllowed(false);
        tabelaClientes.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        tabelaClientes.getTableHeader().setPreferredSize(new Dimension(tabelaClientes.getTableHeader().getWidth(), 30));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome do Aluno", "Telefone", "Telefone Emergência", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaClientes.setDoubleBuffered(true);
        tabelaClientes.setFillsViewportHeight(true);
        tabelaClientes.setGridColor(new java.awt.Color(107, 62, 35));
        tabelaClientes.setMaximumSize(new java.awt.Dimension(1231321, 61313100));
        tabelaClientes.setMinimumSize(new java.awt.Dimension(300, 300));
        tabelaClientes.setRowHeight(35);
        tabelaClientes.setSelectionBackground(new java.awt.Color(255, 249, 237));
        tabelaClientes.setSelectionForeground(new java.awt.Color(107, 62, 35));
        tabelaClientes.setShowGrid(true);
        cadastroAlunoScrollPane.setViewportView(tabelaClientes);
        tabelaClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelaClientes.getColumnModel().getColumnCount() > 0) {
            tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabelaClientes.getColumnModel().getColumn(1).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaClientes.getColumnModel().getColumn(2).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaClientes.getColumnModel().getColumn(3).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(200);
            tabelaClientes.getColumnModel().getColumn(4).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(180);
        }

        visualizarCadastrosBtn.setForeground(new java.awt.Color(255, 249, 237));
        visualizarCadastrosBtn.setText("Visualizar");
        visualizarCadastrosBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        visualizarCadastrosBtn.setRound(10);
        visualizarCadastrosBtn.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);
        visualizarCadastrosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarCadastrosBtnActionPerformed(evt);
            }
        });

        labelTitle3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle3.setForeground(new java.awt.Color(43, 43, 43));
        labelTitle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/smalllogo-image.png"))); // NOI18N
        labelTitle3.setText("Visualiz Cadastros");

        javax.swing.GroupLayout ViewListaCadastroLayout = new javax.swing.GroupLayout(ViewListaCadastro);
        ViewListaCadastro.setLayout(ViewListaCadastroLayout);
        ViewListaCadastroLayout.setHorizontalGroup(
            ViewListaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewListaCadastroLayout.createSequentialGroup()
                .addGroup(ViewListaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewListaCadastroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(visualizarCadastrosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewListaCadastroLayout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(ViewListaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroAlunoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                            .addGroup(ViewListaCadastroLayout.createSequentialGroup()
                                .addComponent(labelTitle3)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        ViewListaCadastroLayout.setVerticalGroup(
            ViewListaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewListaCadastroLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelTitle3)
                .addGap(18, 18, 18)
                .addComponent(cadastroAlunoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(visualizarCadastrosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        ViewsPanelCardLayout.add(ViewListaCadastro, "cardListaCadastros");

        ViewFinanceiro.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle1.setForeground(new java.awt.Color(43, 43, 43));
        labelTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/smalllogo-image.png"))); // NOI18N
        labelTitle1.setText("Financeiro");

        totalMesPanel.setBackground(new java.awt.Color(183, 115, 6));
        totalMesPanel.setRound(40);

        jCustomPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jCustomPanel12.setRound(30);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(183, 115, 6));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Total do Mês");

        totalMesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        totalMesLabel.setForeground(new java.awt.Color(183, 115, 6));
        totalMesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalMesLabel.setText("jLabel23");

        javax.swing.GroupLayout jCustomPanel12Layout = new javax.swing.GroupLayout(jCustomPanel12);
        jCustomPanel12.setLayout(jCustomPanel12Layout);
        jCustomPanel12Layout.setHorizontalGroup(
            jCustomPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(totalMesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jCustomPanel12Layout.setVerticalGroup(
            jCustomPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalMesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout totalMesPanelLayout = new javax.swing.GroupLayout(totalMesPanel);
        totalMesPanel.setLayout(totalMesPanelLayout);
        totalMesPanelLayout.setHorizontalGroup(
            totalMesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalMesPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        totalMesPanelLayout.setVerticalGroup(
            totalMesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalMesPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        totalReceitasPanel.setBackground(new java.awt.Color(17, 99, 67));
        totalReceitasPanel.setRound(40);

        jCustomPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jCustomPanel14.setRound(30);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(17, 99, 67));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Total de Receitas");

        totalReceitaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        totalReceitaLabel.setForeground(new java.awt.Color(17, 99, 67));
        totalReceitaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalReceitaLabel.setText("jLabel28");

        javax.swing.GroupLayout jCustomPanel14Layout = new javax.swing.GroupLayout(jCustomPanel14);
        jCustomPanel14.setLayout(jCustomPanel14Layout);
        jCustomPanel14Layout.setHorizontalGroup(
            jCustomPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(totalReceitaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jCustomPanel14Layout.setVerticalGroup(
            jCustomPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalReceitaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout totalReceitasPanelLayout = new javax.swing.GroupLayout(totalReceitasPanel);
        totalReceitasPanel.setLayout(totalReceitasPanelLayout);
        totalReceitasPanelLayout.setHorizontalGroup(
            totalReceitasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalReceitasPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        totalReceitasPanelLayout.setVerticalGroup(
            totalReceitasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalReceitasPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        despesasPanel.setBackground(new java.awt.Color(196, 80, 92));
        despesasPanel.setRound(40);

        jCustomPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jCustomPanel16.setRound(30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(196, 80, 92));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Despesas");

        despesasLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        despesasLabel.setForeground(new java.awt.Color(196, 80, 92));
        despesasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        despesasLabel.setText("jLabel30");

        javax.swing.GroupLayout jCustomPanel16Layout = new javax.swing.GroupLayout(jCustomPanel16);
        jCustomPanel16.setLayout(jCustomPanel16Layout);
        jCustomPanel16Layout.setHorizontalGroup(
            jCustomPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCustomPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(despesasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jCustomPanel16Layout.setVerticalGroup(
            jCustomPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCustomPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(despesasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout despesasPanelLayout = new javax.swing.GroupLayout(despesasPanel);
        despesasPanel.setLayout(despesasPanelLayout);
        despesasPanelLayout.setHorizontalGroup(
            despesasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(despesasPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        despesasPanelLayout.setVerticalGroup(
            despesasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(despesasPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jCustomPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        FinancerioScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        FinancerioScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(107, 62, 35), 2));

        FinanceiroTable.getTableHeader().setBackground(new Color(240, 240,240));
        FinanceiroTable.getTableHeader().setForeground(new Color(107, 62,35));
        FinanceiroTable.getTableHeader().setReorderingAllowed(false);
        FinanceiroTable.getTableHeader().setFont( new Font("Segoe UI",Font.BOLD, 14));
        FinanceiroTable.getTableHeader().setPreferredSize(new Dimension(tabelaClientes.getTableHeader().getWidth(), 30));
        FinanceiroTable.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        FinanceiroTable.setForeground(new java.awt.Color(51, 51, 51));
        FinanceiroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Nome do Aluno", "Valor", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FinanceiroTable.setCellSelectionEnabled(true);
        FinanceiroTable.setGridColor(new java.awt.Color(107, 62, 35));
        FinanceiroTable.setRowHeight(35);
        FinanceiroTable.setSelectionBackground(new java.awt.Color(255, 249, 237));
        FinanceiroTable.setSelectionForeground(new java.awt.Color(107, 62, 35));
        FinanceiroTable.setShowGrid(true);
        FinancerioScrollPane.setViewportView(FinanceiroTable);
        if (FinanceiroTable.getColumnModel().getColumnCount() > 0) {
            FinanceiroTable.getColumnModel().getColumn(0).setResizable(false);
            FinanceiroTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            FinanceiroTable.getColumnModel().getColumn(1).setResizable(false);
            FinanceiroTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            FinanceiroTable.getColumnModel().getColumn(2).setResizable(false);
            FinanceiroTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            FinanceiroTable.getColumnModel().getColumn(3).setResizable(false);
            FinanceiroTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        cadastroDespesaBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastroDespesaBtn.setText("Cadastrar Despesa");
        cadastroDespesaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastroDespesaBtn.setRound(10);
        cadastroDespesaBtn.setStyle(JCustom.JCustomButton.ButtonStyle.EXIT);

        cadastroPagamentoBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastroPagamentoBtn.setText("Cadastrar Pagamento");
        cadastroPagamentoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastroPagamentoBtn.setRound(10);
        cadastroPagamentoBtn.setStyle(JCustom.JCustomButton.ButtonStyle.UPDATE);

        javax.swing.GroupLayout ViewFinanceiroLayout = new javax.swing.GroupLayout(ViewFinanceiro);
        ViewFinanceiro.setLayout(ViewFinanceiroLayout);
        ViewFinanceiroLayout.setHorizontalGroup(
            ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewFinanceiroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle1)
                    .addComponent(FinancerioScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewFinanceiroLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewFinanceiroLayout.createSequentialGroup()
                        .addComponent(totalMesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(totalReceitasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cadastroPagamentoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(despesasPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroDespesaBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        ViewFinanceiroLayout.setVerticalGroup(
            ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewFinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle1)
                .addGap(18, 18, 18)
                .addComponent(FinancerioScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(despesasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalReceitasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalMesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastroPagamentoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroDespesaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        ViewsPanelCardLayout.add(ViewFinanceiro, "cardFinanceiro");

        ViewFichaTreino.setBackground(new java.awt.Color(243, 243, 243));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Em breve");

        javax.swing.GroupLayout ViewFichaTreinoLayout = new javax.swing.GroupLayout(ViewFichaTreino);
        ViewFichaTreino.setLayout(ViewFichaTreinoLayout);
        ViewFichaTreinoLayout.setHorizontalGroup(
            ViewFichaTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewFichaTreinoLayout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap(423, Short.MAX_VALUE))
        );
        ViewFichaTreinoLayout.setVerticalGroup(
            ViewFichaTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewFichaTreinoLayout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        ViewsPanelCardLayout.add(ViewFichaTreino, "cardFichaTreino");

        ViewCadastrarADM.setBackground(new java.awt.Color(243, 243, 243));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(85, 85, 85));
        jLabel13.setText("Usuário de Acesso");

        tfNewUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfNewUserName.setForeground(new java.awt.Color(69, 64, 64));
        tfNewUserName.setToolTipText("");
        tfNewUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(85, 85, 85));
        jLabel14.setText("Senha");

        tfNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfNewPassword.setForeground(new java.awt.Color(69, 64, 64));
        tfNewPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(85, 85, 85));
        jLabel15.setText("Confirmar Senha");

        tfNewPasswordConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfNewPasswordConfirm.setForeground(new java.awt.Color(69, 64, 64));
        tfNewPasswordConfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(85, 85, 85));
        jLabel16.setText("Tipo acesso");

        cbAccessType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbAccessType.setForeground(new java.awt.Color(69, 64, 64));
        cbAccessType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Parcial", "Completo" }));
        cbAccessType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FITZONE CADASTRO ADMINISTRADOR");

        javax.swing.GroupLayout ViewCadastrarADMLayout = new javax.swing.GroupLayout(ViewCadastrarADM);
        ViewCadastrarADM.setLayout(ViewCadastrarADMLayout);
        ViewCadastrarADMLayout.setHorizontalGroup(
            ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCadastrarADMLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfNewUserName)
                        .addComponent(tfNewPasswordConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewCadastrarADMLayout.createSequentialGroup()
                            .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGap(41, 41, 41)
                            .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbAccessType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        ViewCadastrarADMLayout.setVerticalGroup(
            ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCadastrarADMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAccessType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNewPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        ViewsPanelCardLayout.add(ViewCadastrarADM, "cardCadastrarADM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ViewsPanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewsPanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairBtnActionPerformed

    private void btViewPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewPrincipalActionPerformed
         viewChange("cardPrincipal");
        setTitle("Inicio");
    }//GEN-LAST:event_btViewPrincipalActionPerformed

    private void btViewCAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewCAlunoActionPerformed
         viewChange("cardCadastrarAluno");
        setTitle("Cadastrar Aluno");
    }//GEN-LAST:event_btViewCAlunoActionPerformed

    private void btViewLCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewLCadastrosActionPerformed
        viewChange("cardListaCadastros");
        setTitle("Lista de Cadastros");
    }//GEN-LAST:event_btViewLCadastrosActionPerformed

    private void btViewFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewFinanceiroActionPerformed
        viewChange("cardFinanceiro");
        setTitle("Financeiro");
    }//GEN-LAST:event_btViewFinanceiroActionPerformed

    private void btViewFTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewFTreinoActionPerformed
        viewChange("cardFichaTreino");
        setTitle("Ficha de Treino");
    }//GEN-LAST:event_btViewFTreinoActionPerformed

    private void btViewCAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewCAdministradorActionPerformed
        viewChange("cardCadastrarADM");
        setTitle("Cadastro de Usuário Administrador");
    }//GEN-LAST:event_btViewCAdministradorActionPerformed

    private void visualizarCadastrosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarCadastrosBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarCadastrosBtnActionPerformed

        public void viewChange(String cardName) {
        CardLayout layout = (CardLayout) ViewsPanelCardLayout.getLayout();
        layout.show(ViewsPanelCardLayout, cardName);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FinanceiroTable;
    private javax.swing.JScrollPane FinancerioScrollPane;
    private JCustom.JCustomPanel LabelEstatisticas;
    private JCustom.JCustomPanel LabelRelogio;
    private javax.swing.JPanel ViewCadastrarADM;
    private javax.swing.JPanel ViewFichaTreino;
    private javax.swing.JPanel ViewFinanceiro;
    private javax.swing.JPanel ViewListaCadastro;
    private javax.swing.JPanel ViewPrincipal;
    private javax.swing.JPanel ViewsPanelCardLayout;
    private javax.swing.JLabel alunosCadastradosLabel;
    private javax.swing.JLabel alunosStatusLabel;
    private javax.swing.JPanel bottomPanel;
    private JCustom.JCustomButton btViewCAdministrador;
    private JCustom.JCustomButton btViewCAluno;
    private JCustom.JCustomButton btViewFTreino;
    private JCustom.JCustomButton btViewFinanceiro;
    private JCustom.JCustomButton btViewLCadastros;
    private JCustom.JCustomButton btViewPrincipal;
    private javax.swing.JPanel buttonsPanel;
    private JCustom.JCustomButton cadastrarAlunoBtn;
    private javax.swing.JScrollPane cadastroAlunoScrollPane;
    private JCustom.JCustomButton cadastroDespesaBtn;
    private JCustom.JCustomButton cadastroPagamentoBtn;
    private JCustom.JCustomButton cancelarCadastroBtn;
    private javax.swing.JPanel cardCadastrarAluno;
    private javax.swing.JComboBox<String> cbAccessType;
    private javax.swing.JComboBox<String> cbMatricula;
    private javax.swing.JLabel despesasLabel;
    private JCustom.JCustomPanel despesasPanel;
    private javax.swing.JPanel headerPanel;
    private JCustom.JCustomPanel jCustomPanel11;
    private JCustom.JCustomPanel jCustomPanel12;
    private JCustom.JCustomPanel jCustomPanel14;
    private JCustom.JCustomPanel jCustomPanel16;
    private JCustom.JCustomPanel jCustomPanel4;
    private JCustom.JCustomPanel jCustomPanel5;
    private JCustom.JCustomPanel jCustomPanel6;
    private JCustom.JCustomPanel jCustomPanel7;
    private JCustom.JCustomPanel jCustomPanel8;
    private JCustom.JCustomPanel jCustomPanel9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private JCustom.JLabelClock jLabelClock1;
    private JCustom.JLabelData jLabelData1;
    private javax.swing.JScrollPane jScrollPane3;
    private JCustom.JCustomPanel labelAniversario;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JLabel labelTitle3;
    private JCustom.JCustomButton limparCamposBtn;
    private javax.swing.JPanel panelButtons;
    private JCustom.JCustomButton sairBtn;
    private javax.swing.JPanel sidebarMenu;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField tfAlturaCliente;
    private javax.swing.JTextField tfCPFCLiente;
    private javax.swing.JTextField tfDataNascimentoCliente;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfEnderecoCliente;
    private javax.swing.JTextArea tfHistoricoSaudeCliente;
    private javax.swing.JPasswordField tfNewPassword;
    private javax.swing.JPasswordField tfNewPasswordConfirm;
    private javax.swing.JTextField tfNewUserName;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfPesoCliente;
    private javax.swing.JTextField tfTelefoneCliente;
    private javax.swing.JTextField tfTelefoneEmergenciaCliente;
    private javax.swing.JLabel totalMesLabel;
    private JCustom.JCustomPanel totalMesPanel;
    private javax.swing.JLabel totalReceitaLabel;
    private JCustom.JCustomPanel totalReceitasPanel;
    private javax.swing.JLabel userNameLabel;
    private JCustom.JCustomButton visualizarCadastrosBtn;
    // End of variables declaration//GEN-END:variables
}
