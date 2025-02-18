package fitzoneapp.View;

import fitzoneapp.Model.LoginResponse;
import fitzoneapp.Util.AccessType;
import java.awt.CardLayout;

public class mainView extends javax.swing.JFrame {
    
    private LoginResponse userAdmInfo;
    
    public mainView(LoginResponse response) {
        initComponents();
        this.userAdmInfo = response;
        userNameViewLabel.setText(userAdmInfo.getUserResponse().getName());
        userAccess();
        
    }

    public void userAccess() {
      if(userAdmInfo.getUserResponse().getAccessType() == AccessType.PARCIAL) {
          btViewCAdministrador.setEnabled(false);
          btViewFinanceiro.setEnabled(false);
      }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarMenuPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btViewPrincipal = new javax.swing.JButton();
        btViewCAluno = new javax.swing.JButton();
        btViewLCadastros = new javax.swing.JButton();
        btViewFinanceiro = new javax.swing.JButton();
        btViewFTreino = new javax.swing.JButton();
        btViewCAdministrador = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userNameViewLabel = new javax.swing.JLabel();
        ViewsPanelCardLayout = new javax.swing.JPanel();
        ViewPrincipal = new javax.swing.JPanel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tfHistoricoSaudeCliente = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbMatricula = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        btCadastrarCliente = new javax.swing.JButton();
        btCancelarCadastro = new javax.swing.JButton();
        btLimparCampos = new javax.swing.JButton();
        ViewListaCadastro = new javax.swing.JPanel();
        ViewFinanceiro = new javax.swing.JPanel();
        ViewFichaTreino = new javax.swing.JPanel();
        ViewCadastrarADM = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cancelarBtADM = new javax.swing.JButton();
        btCadastrarADM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 700));
        setSize(new java.awt.Dimension(1200, 700));

        sidebarMenuPanel.setBackground(new java.awt.Color(243, 243, 243));

        jPanel3.setBackground(new java.awt.Color(243, 243, 243));

        btViewPrincipal.setBackground(new java.awt.Color(243, 243, 243));
        btViewPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btViewPrincipal.setForeground(new java.awt.Color(126, 126, 126));
        btViewPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitzoneapp/assets/icons/Group 7.png"))); // NOI18N
        btViewPrincipal.setText("Principal");
        btViewPrincipal.setBorderPainted(false);
        btViewPrincipal.setContentAreaFilled(false);
        btViewPrincipal.setFocusPainted(false);
        btViewPrincipal.setRolloverEnabled(false);
        btViewPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewPrincipal.setIconTextGap(10);

        btViewCAluno.setBackground(new java.awt.Color(243, 243, 243));
        btViewCAluno.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btViewCAluno.setForeground(new java.awt.Color(126, 126, 126));
        btViewCAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitzoneapp/assets/icons/Group 6.png"))); // NOI18N
        btViewCAluno.setText("Cadastrar Aluno");
        btViewCAluno.setBorderPainted(false);
        btViewCAluno.setContentAreaFilled(false);
        btViewCAluno.setFocusPainted(false);
        btViewCAluno.setRolloverEnabled(false);
        btViewCAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewCAluno.setIconTextGap(10);
        btViewCAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewCAlunoActionPerformed(evt);
            }
        });

        btViewLCadastros.setBackground(new java.awt.Color(243, 243, 243));
        btViewLCadastros.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btViewLCadastros.setForeground(new java.awt.Color(126, 126, 126));
        btViewLCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitzoneapp/assets/icons/Vector.png"))); // NOI18N
        btViewLCadastros.setText("Lista Cadastros");
        btViewLCadastros.setBorderPainted(false);
        btViewLCadastros.setContentAreaFilled(false);
        btViewLCadastros.setFocusPainted(false);
        btViewLCadastros.setRolloverEnabled(false);
        btViewLCadastros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewLCadastros.setIconTextGap(22);
        btViewLCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewLCadastrosActionPerformed(evt);
            }
        });

        btViewFinanceiro.setBackground(new java.awt.Color(243, 243, 243));
        btViewFinanceiro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btViewFinanceiro.setForeground(new java.awt.Color(126, 126, 126));
        btViewFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitzoneapp/assets/icons/Money.png"))); // NOI18N
        btViewFinanceiro.setText("Financeiro");
        btViewFinanceiro.setBorderPainted(false);
        btViewFinanceiro.setContentAreaFilled(false);
        btViewFinanceiro.setFocusPainted(false);
        btViewFinanceiro.setRolloverEnabled(false);
        btViewFinanceiro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewFinanceiro.setIconTextGap(10);
        btViewFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewFinanceiroActionPerformed(evt);
            }
        });

        btViewFTreino.setBackground(new java.awt.Color(243, 243, 243));
        btViewFTreino.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btViewFTreino.setForeground(new java.awt.Color(126, 126, 126));
        btViewFTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitzoneapp/assets/icons/Notepad.png"))); // NOI18N
        btViewFTreino.setText("Ficha de Treino");
        btViewFTreino.setBorderPainted(false);
        btViewFTreino.setContentAreaFilled(false);
        btViewFTreino.setFocusPainted(false);
        btViewFTreino.setRolloverEnabled(false);
        btViewFTreino.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewFTreino.setIconTextGap(10);
        btViewFTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewFTreinoActionPerformed(evt);
            }
        });

        btViewCAdministrador.setBackground(new java.awt.Color(243, 243, 243));
        btViewCAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btViewCAdministrador.setForeground(new java.awt.Color(126, 126, 126));
        btViewCAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitzoneapp/assets/icons/Administrator.png"))); // NOI18N
        btViewCAdministrador.setText("Cadastrar Administrador");
        btViewCAdministrador.setBorderPainted(false);
        btViewCAdministrador.setContentAreaFilled(false);
        btViewCAdministrador.setFocusPainted(false);
        btViewCAdministrador.setRolloverEnabled(false);
        btViewCAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btViewCAdministrador.setIconTextGap(10);
        btViewCAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewCAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btViewCAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addComponent(btViewLCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewCAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btViewFTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
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

        jPanel4.setBackground(new java.awt.Color(243, 243, 243));

        btSair.setBackground(new java.awt.Color(196, 80, 92));
        btSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 249, 237));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitzoneapp/assets/icons/Logout.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setFocusPainted(false);
        btSair.setBorder(null);
        btSair.setBorderPainted(false);
        btSair.setFocusable(false);
        btSair.setRolloverEnabled(false);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(102, 102, 102));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNameLabel.setText("Usuário:");

        userNameViewLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameViewLabel.setForeground(new java.awt.Color(102, 0, 0));
        userNameViewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameViewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameViewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarMenuPanelLayout = new javax.swing.GroupLayout(sidebarMenuPanel);
        sidebarMenuPanel.setLayout(sidebarMenuPanelLayout);
        sidebarMenuPanelLayout.setHorizontalGroup(
            sidebarMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidebarMenuPanelLayout.setVerticalGroup(
            sidebarMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ViewsPanelCardLayout.setBackground(new java.awt.Color(102, 0, 51));
        ViewsPanelCardLayout.setLayout(new java.awt.CardLayout());

        ViewPrincipal.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout ViewPrincipalLayout = new javax.swing.GroupLayout(ViewPrincipal);
        ViewPrincipal.setLayout(ViewPrincipalLayout);
        ViewPrincipalLayout.setHorizontalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        ViewPrincipalLayout.setVerticalGroup(
            ViewPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        ViewsPanelCardLayout.add(ViewPrincipal, "cardPrincipal");

        cardCadastrarAluno.setBackground(new java.awt.Color(243, 243, 243));

        tfNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfNomeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfNomeCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfNomeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfNomeCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfNomeCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel1.setForeground(new java.awt.Color(85, 85, 85));
        jLabel1.setText("Nome Completo");

        tfEnderecoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfEnderecoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEnderecoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEnderecoCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEnderecoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel2.setForeground(new java.awt.Color(85, 85, 85));
        jLabel2.setText("Endereço");

        tfCPFCLiente.setBackground(new java.awt.Color(255, 255, 255));
        tfCPFCLiente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfCPFCLiente.setForeground(new java.awt.Color(54, 54, 54));
        tfCPFCLiente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfCPFCLiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfCPFCLiente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfCPFCLiente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel3.setForeground(new java.awt.Color(85, 85, 85));
        jLabel3.setText("CPF");

        tfDataNascimentoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfDataNascimentoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfDataNascimentoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfDataNascimentoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataNascimentoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfDataNascimentoCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfDataNascimentoCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel4.setForeground(new java.awt.Color(85, 85, 85));
        jLabel4.setText("Data de Nascimento");

        tfTelefoneCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefoneCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfTelefoneCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfTelefoneCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelefoneCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfTelefoneCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel5.setForeground(new java.awt.Color(85, 85, 85));
        jLabel5.setText("Número de Telefone");

        tfTelefoneEmergenciaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefoneEmergenciaCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfTelefoneEmergenciaCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfTelefoneEmergenciaCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelefoneEmergenciaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTelefoneEmergenciaCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfTelefoneEmergenciaCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel6.setForeground(new java.awt.Color(85, 85, 85));
        jLabel6.setText("Número de Emergência");

        tfEmailCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfEmailCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfEmailCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfEmailCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfEmailCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfEmailCliente.setMaximumSize(new java.awt.Dimension(328, 22));
        tfEmailCliente.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel7.setForeground(new java.awt.Color(85, 85, 85));
        jLabel7.setText("Email");

        tfPesoCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfPesoCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfPesoCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfPesoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPesoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfPesoCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel8.setForeground(new java.awt.Color(85, 85, 85));
        jLabel8.setText("Peso");

        tfAlturaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfAlturaCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfAlturaCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfAlturaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAlturaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfAlturaCliente.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel9.setForeground(new java.awt.Color(85, 85, 85));
        jLabel9.setText("Altura");

        tfHistoricoSaudeCliente.setBackground(new java.awt.Color(255, 255, 255));
        tfHistoricoSaudeCliente.setColumns(20);
        tfHistoricoSaudeCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfHistoricoSaudeCliente.setForeground(new java.awt.Color(54, 54, 54));
        tfHistoricoSaudeCliente.setRows(5);
        tfHistoricoSaudeCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfHistoricoSaudeCliente.setMinimumSize(new java.awt.Dimension(200, 22));
        jScrollPane1.setViewportView(tfHistoricoSaudeCliente);

        jLabel10.setForeground(new java.awt.Color(85, 85, 85));
        jLabel10.setText("Histórico de Saúde");

        jLabel11.setForeground(new java.awt.Color(85, 85, 85));
        jLabel11.setText("Matrícula");

        cbMatricula.setBackground(new java.awt.Color(255, 255, 255));
        cbMatricula.setForeground(new java.awt.Color(54, 54, 54));
        cbMatricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Mensal", "Quinzena" }));
        cbMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jPanel6.setBackground(new java.awt.Color(243, 243, 243));

        btCadastrarCliente.setBackground(new java.awt.Color(188, 140, 74));
        btCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCadastrarCliente.setForeground(new java.awt.Color(255, 249, 237));
        btCadastrarCliente.setText("Confirmar");
        btCadastrarCliente.setBorderPainted(false);
        btCadastrarCliente.setFocusable(false);
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });

        btCancelarCadastro.setBackground(new java.awt.Color(241, 221, 183));
        btCancelarCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCancelarCadastro.setForeground(new java.awt.Color(107, 62, 35));
        btCancelarCadastro.setText("Cancelar");
        btCancelarCadastro.setBorderPainted(false);
        btCancelarCadastro.setFocusable(false);

        btLimparCampos.setBackground(new java.awt.Color(241, 221, 183));
        btLimparCampos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLimparCampos.setForeground(new java.awt.Color(107, 62, 35));
        btLimparCampos.setText("Limpar campos");
        btLimparCampos.setBorderPainted(false);
        btLimparCampos.setFocusable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btCancelarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLimparCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout cardCadastrarAlunoLayout = new javax.swing.GroupLayout(cardCadastrarAluno);
        cardCadastrarAluno.setLayout(cardCadastrarAlunoLayout);
        cardCadastrarAlunoLayout.setHorizontalGroup(
            cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                        .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfEmailCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCPFCLiente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDataNascimentoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastrarAlunoLayout.createSequentialGroup()
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
                            .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                        .addGap(80, 80, 80)))
                .addGap(70, 70, 70))
        );
        cardCadastrarAlunoLayout.setVerticalGroup(
            cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPFCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadastrarAlunoLayout.createSequentialGroup()
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
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadastrarAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(tfDataNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefoneEmergenciaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(cardCadastrarAlunoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ViewsPanelCardLayout.add(cardCadastrarAluno, "cardCadastrarAluno");

        ViewListaCadastro.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout ViewListaCadastroLayout = new javax.swing.GroupLayout(ViewListaCadastro);
        ViewListaCadastro.setLayout(ViewListaCadastroLayout);
        ViewListaCadastroLayout.setHorizontalGroup(
            ViewListaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        ViewListaCadastroLayout.setVerticalGroup(
            ViewListaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        ViewsPanelCardLayout.add(ViewListaCadastro, "cardListaCadastros");

        ViewFinanceiro.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout ViewFinanceiroLayout = new javax.swing.GroupLayout(ViewFinanceiro);
        ViewFinanceiro.setLayout(ViewFinanceiroLayout);
        ViewFinanceiroLayout.setHorizontalGroup(
            ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        ViewFinanceiroLayout.setVerticalGroup(
            ViewFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        ViewsPanelCardLayout.add(ViewFinanceiro, "cardFinanceiro");

        ViewFichaTreino.setBackground(new java.awt.Color(204, 51, 255));

        javax.swing.GroupLayout ViewFichaTreinoLayout = new javax.swing.GroupLayout(ViewFichaTreino);
        ViewFichaTreino.setLayout(ViewFichaTreinoLayout);
        ViewFichaTreinoLayout.setHorizontalGroup(
            ViewFichaTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        ViewFichaTreinoLayout.setVerticalGroup(
            ViewFichaTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        ViewsPanelCardLayout.add(ViewFichaTreino, "cardFichaTreino");

        ViewCadastrarADM.setBackground(new java.awt.Color(243, 243, 243));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(85, 85, 85));
        jLabel13.setText("Usuário de Acesso");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(69, 64, 64));
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(85, 85, 85));
        jLabel14.setText("Senha");

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(69, 64, 64));
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(85, 85, 85));
        jLabel15.setText("Confirmar Senha");

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(69, 64, 64));
        jPasswordField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(85, 85, 85));
        jLabel16.setText("Tipo acesso");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(69, 64, 64));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Parcial", "Completo" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FITZONE CADASTRO ADMINISTRADOR");

        cancelarBtADM.setBackground(new java.awt.Color(241, 221, 183));
        cancelarBtADM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelarBtADM.setForeground(new java.awt.Color(107, 62, 35));
        cancelarBtADM.setText("Cancelar");
        cancelarBtADM.setBorder(null);
        cancelarBtADM.setBorderPainted(false);
        cancelarBtADM.setFocusable(false);

        btCadastrarADM.setBackground(new java.awt.Color(188, 140, 74));
        btCadastrarADM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCadastrarADM.setForeground(new java.awt.Color(255, 249, 237));
        btCadastrarADM.setText("Criar");
        btCadastrarADM.setBorder(null);
        btCadastrarADM.setBorderPainted(false);
        btCadastrarADM.setFocusable(false);
        btCadastrarADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarADMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewCadastrarADMLayout = new javax.swing.GroupLayout(ViewCadastrarADM);
        ViewCadastrarADM.setLayout(ViewCadastrarADMLayout);
        ViewCadastrarADMLayout.setHorizontalGroup(
            ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCadastrarADMLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ViewCadastrarADMLayout.createSequentialGroup()
                            .addComponent(cancelarBtADM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btCadastrarADM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewCadastrarADMLayout.createSequentialGroup()
                            .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGap(41, 41, 41)
                            .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        ViewCadastrarADMLayout.setVerticalGroup(
            ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewCadastrarADMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(140, 140, 140)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(ViewCadastrarADMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarADM, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cancelarBtADM, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(105, 105, 105))
        );

        ViewsPanelCardLayout.add(ViewCadastrarADM, "cardCadastrarADM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ViewsPanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewsPanelCardLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1214, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed

    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void btCadastrarADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarADMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarADMActionPerformed

    public void viewChange(String cardName) {
        CardLayout layout = (CardLayout) ViewsPanelCardLayout.getLayout();
        layout.show(ViewsPanelCardLayout, cardName);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ViewCadastrarADM;
    private javax.swing.JPanel ViewFichaTreino;
    private javax.swing.JPanel ViewFinanceiro;
    private javax.swing.JPanel ViewListaCadastro;
    private javax.swing.JPanel ViewPrincipal;
    private javax.swing.JPanel ViewsPanelCardLayout;
    private javax.swing.JButton btCadastrarADM;
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton btCancelarCadastro;
    private javax.swing.JButton btLimparCampos;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btViewCAdministrador;
    private javax.swing.JButton btViewCAluno;
    private javax.swing.JButton btViewFTreino;
    private javax.swing.JButton btViewFinanceiro;
    private javax.swing.JButton btViewLCadastros;
    private javax.swing.JButton btViewPrincipal;
    private javax.swing.JButton cancelarBtADM;
    private javax.swing.JPanel cardCadastrarAluno;
    private javax.swing.JComboBox<String> cbMatricula;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel sidebarMenuPanel;
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
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameViewLabel;
    // End of variables declaration//GEN-END:variables
}
