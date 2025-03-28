package Controller;

import Entity.Cliente;
import Service.ClienteService;
import Validation.FORMAT;
import View.AvisoForm;
import View.InicioView;

import javax.swing.*;
import java.util.List;

public class ClienteController {

    public static void cadastrarController(InicioView parent, JTextField tfNomeCliente, JFormattedTextField tfCPFCLiente, JFormattedTextField tfdataNascimento,
                                           JFormattedTextField tfTelefoneCliente, JFormattedTextField tfTelefoneEmergenciaCliente, JTextField tfEmailCliente,
                                           JTextField tfEnderecoCliente, JTextField tfPesoCliente, JTextField tfAlturaCliente, JTextArea tfHistoricoSaudeCliente,
                                           JComboBox<String> cbMatricula) {

        JTextField[] campos = {tfNomeCliente, tfEmailCliente, tfEnderecoCliente, tfPesoCliente, tfAlturaCliente };
        JFormattedTextField[] camposTelefone = {tfTelefoneCliente, tfTelefoneEmergenciaCliente};
        boolean camposVazio = true;
        boolean camposTelefoneVazio = true;

        for (JTextField campo : campos) {
            if(!campo.getText().isBlank()) {
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

        if (camposVazio && camposTelefoneVazio && tfHistoricoSaudeCliente.getText().isBlank() && cbMatricula.getSelectedIndex() == 0 ) {
            new AvisoForm(null, true, "Preencha as informações necessárias").setVisible(true);
        } else if (tfNomeCliente.getText().isBlank()) {
            new AvisoForm(parent, true, "Digite o nome do aluno").setVisible(true);
        } else if (FORMAT.formatarCPF(tfCPFCLiente.getText()).isBlank()) {
            new AvisoForm(parent, true, "Digite o CPF do aluno").setVisible(true);
        } else if (FORMAT.formatarData(tfdataNascimento.getText()).isBlank()) {
            new AvisoForm(parent, true, "Digite a data de nascimento").setVisible(true);
        }   else if (FORMAT.formatarNumero(tfTelefoneCliente.getText()).isBlank()) {
            new AvisoForm(parent, true, "Digite o telefone do aluno").setVisible(true);
        } else if (FORMAT.formatarNumero(tfTelefoneEmergenciaCliente.getText()).isBlank()) {
            new AvisoForm(parent, true, "Digite um telefone de emergência ").setVisible(true);
        } else if (tfEmailCliente.getText().isBlank()) {
            new AvisoForm(parent, true, "Digite o email do aluno").setVisible(true);
        } else if (tfEnderecoCliente.getText().isBlank()) {
            new AvisoForm(parent, true, "Digite o endereço do aluno").setVisible(true);
        } else if (tfPesoCliente.getText().trim().isBlank()) {
            new AvisoForm(parent, true, "Digite o peso do aluno").setVisible(true);
        } else if (tfAlturaCliente.getText().trim().isBlank()) {
            new AvisoForm(parent, true, "Digite a altura do aluno").setVisible(true);
        } else if (tfHistoricoSaudeCliente.getText().isBlank()) {
            new AvisoForm(parent, true, "Digite o histórico de saúde do aluno").setVisible(true);
        } else if (cbMatricula.getSelectedIndex() == 0) {
            new AvisoForm(parent, true, "Escolha o tipo de matrícula").setVisible(true);
        } else {
            new AvisoForm(parent, true, "Cadastro realizado com sucesso").setVisible(true);
        }
    }

    public static void editarController(Integer idCliente) {
    }

    public static void excluirController() {

    }

    public static List<Cliente> listarClientes() {
        List<Cliente> listaCliente = null;

        return listaCliente;
    }

    public static Cliente listarCliente(Integer idCliente) {
        Cliente cliente = ClienteService.listarCliente(idCliente);

        return cliente;
    }


}

