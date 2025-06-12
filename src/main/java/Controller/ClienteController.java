package Controller;

import DTO.AniversarianteDTO;
import Entity.*;
import Service.ClienteService;
import Validation.DIALOG;
import Validation.FORMAT;
import View.InicioView;
import javax.swing.*;
import java.util.List;
import static Service.ClienteService.*;

public class ClienteController {

    public static void postCustomerController(InicioView parent, JTextField tfNomeCliente, JFormattedTextField tfCPFCLiente, JFormattedTextField tfdataNascimento,
            JFormattedTextField tfTelefoneCliente, JFormattedTextField tfTelefoneEmergenciaCliente, JTextField tfEmailCliente,
            JTextField tfEnderecoCliente, JTextField tfPesoCliente, JTextField tfAlturaCliente, JTextArea tfHistoricoSaudeCliente,
            JComboBox<String> cbMatricula) {

        JTextField[] campos = {tfNomeCliente, tfEmailCliente, tfEnderecoCliente, tfPesoCliente, tfAlturaCliente};
        JFormattedTextField[] camposTelefone = {tfTelefoneCliente, tfTelefoneEmergenciaCliente};
        boolean camposVazio = true;
        boolean camposTelefoneVazio = true;

        for (JTextField campo : campos) {
            if (!campo.getText().isBlank()) {
                camposVazio = false;
                break;
            }
        }

        for (JFormattedTextField telefone : camposTelefone) {
            if (!FORMAT.formatarNumero(telefone.getText()).isEmpty()) {
                camposTelefoneVazio = false;
                break;
            }
        }

        if (camposVazio && camposTelefoneVazio && tfHistoricoSaudeCliente.getText().isBlank() && cbMatricula.getSelectedIndex() == 0) {
            DIALOG.exbirMensagem(null, "Preencha as informações necessárias");
        } else if (tfNomeCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o nome do aluno");
        } else if (FORMAT.formatarCPF(tfCPFCLiente.getText()).isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o CPF do aluno");
        } else if (FORMAT.formatarData(tfdataNascimento.getText()).isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite a data de nascimento");
        } else if (FORMAT.formatarNumero(tfTelefoneCliente.getText()).isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o telefone do aluno");
        } else if (FORMAT.formatarNumero(tfTelefoneEmergenciaCliente.getText()).isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite um telefone de emergência ");
        } else if (tfEmailCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o email do aluno");
        } else if (tfEnderecoCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o endereço do aluno");
        } else if (tfPesoCliente.getText().trim().isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o peso do aluno");
        } else if (tfAlturaCliente.getText().trim().isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite a altura do aluno");
        } else if (tfHistoricoSaudeCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o histórico de saúde do aluno");
        } else if (cbMatricula.getSelectedIndex() == 0) {
            DIALOG.exbirMensagem(parent, "Escolha o tipo de matrícula");
        } else {

            Cliente cliente = Cliente.builder()
                    
                    .nome(tfNomeCliente.getText())
                    .cpf(tfCPFCLiente.getText())
                    .dataNascimento(tfdataNascimento.getText())
                    .email(tfEmailCliente.getText())
                    .status("Ativo")
                    .matricula(getRegistryController((String) cbMatricula.getSelectedItem()))
                    
                    .contato(ClienteContact.builder()
                            .numero(tfTelefoneCliente.getText())
                            .numero_emeregencia(tfTelefoneEmergenciaCliente.getText())
                            .build())
                    
                    .endereco(ClienteAddress.builder()
                            .address(tfEnderecoCliente.getText())
                            .build())
                    
                    .infoComplement(ClienteInfoComplement.builder()
                            .height(Double.parseDouble(tfAlturaCliente.getText()))
                            .weight(Double.parseDouble(tfPesoCliente.getText()))
                            .healthHistory(tfHistoricoSaudeCliente.getText())
                            .build())
                    
                    .build();

            postCustomerService(cliente);
        }
    }

    public static void updateCustomerController(Cliente cliente, JTextField tfNomeCliente, JFormattedTextField tfCPFCLiente, JFormattedTextField tfdataNascimento,
            JFormattedTextField tfTelefoneCliente, JFormattedTextField tfTelefoneEmergenciaCliente, JTextField tfEmailCliente,
            JTextField tfEnderecoCliente, JTextField tfPesoCliente, JTextField tfAlturaCliente, JTextArea tfHistoricoSaudeCliente,
            JComboBox<String> cbMatricula, JComboBox<String> cbStatus) {
        JTextField[] campos = {tfNomeCliente, tfEmailCliente, tfEnderecoCliente, tfPesoCliente, tfAlturaCliente};
        JFormattedTextField[] camposTelefone = {tfTelefoneCliente, tfTelefoneEmergenciaCliente};
        boolean camposVazio = true;
        boolean camposTelefoneVazio = true;

        for (JTextField campo : campos) {
            if (!campo.getText().isBlank()) {
                camposVazio = false;
                break;
            }
        }

        for (JFormattedTextField telefone : camposTelefone) {
            if (!FORMAT.formatarNumero(telefone.getText()).isEmpty()) {
                camposTelefoneVazio = false;
                break;
            }
        }

        if (camposVazio && camposTelefoneVazio && tfHistoricoSaudeCliente.getText().isBlank() && cbMatricula.getSelectedIndex() == 0) {
            DIALOG.exbirMensagem(null, "Os campos devem estar preenchidos");
        } else if (tfNomeCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o nome do aluno");
        } else if (FORMAT.formatarCPF(tfCPFCLiente.getText()).isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o CPF do aluno");
        } else if (FORMAT.formatarData(tfdataNascimento.getText()).isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a data de nascimento");
        } else if (FORMAT.formatarNumero(tfTelefoneCliente.getText()).isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o telefone do aluno");
        } else if (FORMAT.formatarNumero(tfTelefoneEmergenciaCliente.getText()).isBlank()) {
            DIALOG.exbirMensagem(null, "Digite um telefone de emergência ");
        } else if (tfEmailCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o email do aluno");
        } else if (tfEnderecoCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o endereço do aluno");
        } else if (tfPesoCliente.getText().trim().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o peso do aluno");
        } else if (tfAlturaCliente.getText().trim().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a altura do aluno");
        } else if (tfHistoricoSaudeCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o histórico de saúde do aluno");
        } else if (cbMatricula.getSelectedIndex() == 0) {
            DIALOG.exbirMensagem(null, "Escolha o tipo de matrícula");
        } else {
            
            cliente.setNome(tfNomeCliente.getText());
            cliente.setCpf(tfCPFCLiente.getText());
            cliente.setDataNascimento(tfdataNascimento.getText());
            cliente.setEmail(tfEmailCliente.getText());
            cliente.setStatus((String) cbStatus.getSelectedItem());
            cliente.setMatricula(getRegistryController((String) cbMatricula.getSelectedItem()));

            cliente.getEndereco().setAddress(tfEnderecoCliente.getText());

            cliente.getContato().setNumero(tfTelefoneCliente.getText());
            cliente.getContato().setNumero_emeregencia(tfTelefoneEmergenciaCliente.getText());

            cliente.getInfoComplement().setWeight(Double.parseDouble(tfPesoCliente.getText()));
            cliente.getInfoComplement().setHeight(Double.parseDouble(tfAlturaCliente.getText()));
            cliente.getInfoComplement().setHealthHistory(tfHistoricoSaudeCliente.getText());

            updateCustomerService(cliente);
        }
    }

    public static void deleteCustomerController(Cliente cliente) {
        deleteCustomerService(cliente);
    }

    public static List<Cliente> getCustomersController() {
        return getCustomersService();
    }

    public static Cliente getCustomerController(String idCliente) {
        return getCustomerService(idCliente);
    }

    public static LicenseType getRegistryController(String matricula) {
        return getRegistryService(matricula);
    }

    public static Integer getCountActiveCustomersController() {
        return getCountActiveCustomersService();
    }

    public static Integer getCountRegisteredCustomersController() {
        return getCountRegisteredCustomersService();
    }

    public static List<AniversarianteDTO> getBirthdayCustomerController() {
        return getBirthdayCustomerService();
    }
}
