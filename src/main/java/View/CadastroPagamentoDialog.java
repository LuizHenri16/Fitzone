package View;

import Controller.ClienteController;
import Controller.FinanceiroController;
import Entity.Cliente;
import Entity.LicenseType;
import Entity.Payment;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadastroPagamentoDialog extends java.awt.Dialog {

    private Cliente clienteSelecionado;

    public CadastroPagamentoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarClientesCombobox();
    }

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
        clientesCombobox = new javax.swing.JComboBox<>();

        setResizable(false);
        setTitle("Cadastro de Pagamento");
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        panel.setBackground(new java.awt.Color(243, 243, 243));

        concluirPagamentoBtn.setForeground(new java.awt.Color(255, 249, 237));
        concluirPagamentoBtn.setText("Concluir");
        concluirPagamentoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        concluirPagamentoBtn.setRound(10);
        concluirPagamentoBtn.setStyle(JCustom.JCustomButton.ButtonStyle.RETURN);
        concluirPagamentoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirPagamentoBtnActionPerformed(evt);
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

        tfUltimoPagamento.setBackground(new java.awt.Color(255, 255, 255));
        tfUltimoPagamento.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfUltimoPagamento.setForeground(new java.awt.Color(54, 54, 54));
        tfUltimoPagamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfUltimoPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfUltimoPagamento.setEnabled(false);
        tfUltimoPagamento.setMaximumSize(new java.awt.Dimension(370, 40));
        tfUltimoPagamento.setMinimumSize(new java.awt.Dimension(220, 22));

        tfValorPagamento.setBackground(new java.awt.Color(255, 255, 255));
        tfValorPagamento.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfValorPagamento.setForeground(new java.awt.Color(54, 54, 54));
        tfValorPagamento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfValorPagamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfValorPagamento.setEnabled(false);
        tfValorPagamento.setMaximumSize(new java.awt.Dimension(370, 40));
        tfValorPagamento.setMinimumSize(new java.awt.Dimension(220, 22));

        tfTipoMatricula.setBackground(new java.awt.Color(255, 255, 255));
        tfTipoMatricula.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        tfTipoMatricula.setForeground(new java.awt.Color(54, 54, 54));
        tfTipoMatricula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTipoMatricula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 1, true));
        tfTipoMatricula.setEnabled(false);
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
        tfNovoPagamento.setEnabled(false);
        tfNovoPagamento.setMaximumSize(new java.awt.Dimension(370, 40));
        tfNovoPagamento.setMinimumSize(new java.awt.Dimension(220, 22));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(107, 62, 35));
        jLabel4.setText("Data novo Pagamento");

        clientesCombobox.setBackground(new java.awt.Color(255, 255, 255));
        clientesCombobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clientesCombobox.setForeground(new java.awt.Color(51, 51, 51));
        clientesCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clientesCombobox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(193, 193, 193), 2, true));
        clientesCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfUltimoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTipoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNovoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(concluirPagamentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientesCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientesCombobox, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(concluirPagamentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(panel, java.awt.BorderLayout.CENTER);

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

    private void clientesComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesComboboxActionPerformed
        comboboxEvent();
    }//GEN-LAST:event_clientesComboboxActionPerformed

    public void comboboxEvent() {
        String nomeSelecionado = (String) clientesCombobox.getSelectedItem();
        List<Cliente> listaClientes = ClienteController.listarClientes();

        clienteSelecionado = listaClientes.stream()
                .filter(cliente -> cliente.getNome().equals(nomeSelecionado))
                .findFirst()
                .orElse(null);

        if (clienteSelecionado != null) {
            Payment ultimoPagamento = clienteSelecionado.getPagamento().stream()
                    .max(Comparator.comparing(Payment::getLastPayment))
                    .orElse(null);

            tfUltimoPagamento.setText(ultimoPagamento != null ? ultimoPagamento.getLastPayment() : "Não encontrado");
            tfNovoPagamento.setText(LocalDate.now().toString());

            LicenseType tipoMatricula = clienteSelecionado.getMatricula();
            tfTipoMatricula.setText(tipoMatricula != null ? tipoMatricula.getLicenseType() : "Não definido");

            tfValorPagamento.setText(tipoMatricula != null ? String.valueOf(tipoMatricula.getPrice()) : "Não definido");
        } else {
            
            tfUltimoPagamento.setText("");
            tfNovoPagamento.setText("");
            tfTipoMatricula.setText("");
            tfValorPagamento.setText("");
        }
    }
    
    public void cadastrarPagamento() {
        Payment pagamento = new Payment();
        pagamento.setCliente(clienteSelecionado);
        pagamento.setLicenseType(clienteSelecionado.getMatricula());
        pagamento.setLastPayment(LocalDate.now().toString());

        FinanceiroController.cadastrarPagamentoController(pagamento);
        dispose();
    }

    private void concluirPagamentoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirPagamentoBtnActionPerformed
        cadastrarPagamento();
    }//GEN-LAST:event_concluirPagamentoBtnActionPerformed

    public void listarClientesCombobox() {
        List<Cliente> listaClientes = ClienteController.listarClientes();

        DefaultComboBoxModel<String> modeloCombobox = new DefaultComboBoxModel<>();
        modeloCombobox.addElement("Selecione:");

        for (Cliente cliente : listaClientes) {
            modeloCombobox.addElement(cliente.getNome());
        }

        clientesCombobox.setModel(modeloCombobox);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> clientesCombobox;
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
