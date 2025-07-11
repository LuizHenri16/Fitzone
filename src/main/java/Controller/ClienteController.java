package Controller;

import DTO.AniversarianteDTO;
import DTO.ClienteDTO;
import Entity.*;
import Service.ClienteService;
import Validation.DIALOG;
import Validation.FORMAT;
import View.InicioView;
import javax.swing.*;
import java.util.List;
import static Service.ClienteService.*;

public class ClienteController {

    public static boolean postCustomerController(ClienteDTO clienteDTO) {

        String[] campos = {clienteDTO.getNome(), clienteDTO.getEmail(), clienteDTO.getAddress(), FORMAT.converterData(clienteDTO.getDataNascimento()) ,clienteDTO.getHealthHistory(), FORMAT.formatarCPF(clienteDTO.getCpf())};
        String[] camposTelefone = {clienteDTO.getNumero(), clienteDTO.getNumeroEmergencia()};
        boolean camposVazio = true;
        boolean camposTelefoneVazio = true;

        for (String campo : campos) {
            if (!campo.isBlank()) {
                camposVazio = false;
                break;
            }
        }

        for (String telefone : camposTelefone) {
            if (!FORMAT.formatarNumero(telefone).isBlank()) {
                camposTelefoneVazio = false;
                break;
            }
        }

        if (camposVazio && camposTelefoneVazio &&  clienteDTO.getWeight() < 1 && clienteDTO.getHeight() < 1 && clienteDTO.getMatricula().equals("Selecione:")) {
            DIALOG.exbirMensagem("Preencha as informações necessárias");
            return false;
        } else if (clienteDTO.getNome().isBlank()) {
            DIALOG.exbirMensagem("Digite o nome do aluno");
            return false;
        } else if (FORMAT.formatarCPF(clienteDTO.getCpf()).isBlank()) {
            DIALOG.exbirMensagem("Digite o CPF do aluno");
            return false;
        } else if (FORMAT.formatarData(clienteDTO.getDataNascimento()).isBlank()) {
            DIALOG.exbirMensagem("Digite a data de nascimento");
            return false;
        } else if (FORMAT.formatarNumero(clienteDTO.getNumero()).isBlank()) {
            DIALOG.exbirMensagem("Digite o telefone do aluno");
            return false;
        } else if (FORMAT.formatarNumero(clienteDTO.getNumeroEmergencia()).isBlank()) {
            DIALOG.exbirMensagem("Digite um telefone de emergência ");
            return false;
        } else if (clienteDTO.getEmail().isBlank()) {
            DIALOG.exbirMensagem("Digite o email do aluno");
            return false;
        } else if (clienteDTO.getAddress().isBlank()) {
            DIALOG.exbirMensagem("Digite o endereço do aluno");
            return false;
        } else if (clienteDTO.getWeight() < 1) {
            DIALOG.exbirMensagem("Digite o peso do aluno");
            return false;
        } else if (clienteDTO.getHeight() < 1) {
            DIALOG.exbirMensagem("Digite a altura do aluno");
            return false;
        } else if (clienteDTO.getHealthHistory().isBlank()) {
            DIALOG.exbirMensagem("Digite o histórico de saúde do aluno");
            return false;
        } else if (clienteDTO.getMatricula().equals("Selecione:")) {
            DIALOG.exbirMensagem("Escolha o tipo de matrícula");
            return false;
        } else {

            Cliente cliente = Cliente.builder()
                    
                    .nome(clienteDTO.getNome())
                    .cpf(clienteDTO.getCpf())
                    .dataNascimento(clienteDTO.getDataNascimento())
                    .email(clienteDTO.getEmail())
                    .status("Ativo")
                    .matricula(getRegistryController(clienteDTO.getMatricula()))
                    
                    .contato(ClienteContact.builder()
                            .numero(clienteDTO.getNumero())
                            .numero_emeregencia(clienteDTO.getNumeroEmergencia())
                            .build())
                    
                    .endereco(ClienteAddress.builder()
                            .address(clienteDTO.getAddress())
                            .build())
                    
                    .infoComplement(ClienteInfoComplement.builder()
                            .height(clienteDTO.getHeight())
                            .weight(clienteDTO.getWeight())
                            .healthHistory(clienteDTO.getHealthHistory())
                            .build())
                    
                    .build();

            postCustomerService(cliente);
            return true;
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
            DIALOG.exbirMensagem("Os campos devem estar preenchidos");
        } else if (tfNomeCliente.getText().isBlank()) {
            DIALOG.exbirMensagem("Digite o nome do aluno");
        } else if (FORMAT.formatarCPF(tfCPFCLiente.getText()).isBlank()) {
            DIALOG.exbirMensagem("Digite o CPF do aluno");
        } else if (FORMAT.formatarData(tfdataNascimento.getText()).isBlank()) {
            DIALOG.exbirMensagem("Digite a data de nascimento");
        } else if (FORMAT.formatarNumero(tfTelefoneCliente.getText()).isBlank()) {
            DIALOG.exbirMensagem("Digite o telefone do aluno");
        } else if (FORMAT.formatarNumero(tfTelefoneEmergenciaCliente.getText()).isBlank()) {
            DIALOG.exbirMensagem("Digite um telefone de emergência ");
        } else if (tfEmailCliente.getText().isBlank()) {
            DIALOG.exbirMensagem("Digite o email do aluno");
        } else if (tfEnderecoCliente.getText().isBlank()) {
            DIALOG.exbirMensagem("Digite o endereço do aluno");
        } else if (tfPesoCliente.getText().trim().isBlank()) {
            DIALOG.exbirMensagem("Digite o peso do aluno");
        } else if (tfAlturaCliente.getText().trim().isBlank()) {
            DIALOG.exbirMensagem("Digite a altura do aluno");
        } else if (tfHistoricoSaudeCliente.getText().isBlank()) {
            DIALOG.exbirMensagem("Digite o histórico de saúde do aluno");
        } else if (cbMatricula.getSelectedIndex() == 0) {
            DIALOG.exbirMensagem("Escolha o tipo de matrícula");
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
