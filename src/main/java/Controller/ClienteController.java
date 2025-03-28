package Controller;

import Entity.Cliente;
import Service.ClienteService;
import Validation.DIALOG;
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
            DIALOG.exbirMensagem(null, "Preencha as informações necessárias");
        } else if (tfNomeCliente.getText().isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o nome do aluno");
        } else if (FORMAT.formatarCPF(tfCPFCLiente.getText()).isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite o CPF do aluno");
        } else if (FORMAT.formatarData(tfdataNascimento.getText()).isBlank()) {
            DIALOG.exbirMensagem(parent, "Digite a data de nascimento");
        }   else if (FORMAT.formatarNumero(tfTelefoneCliente.getText()).isBlank()) {
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
            DIALOG.exbirMensagem(parent, "Cadastro realizado com sucesso");
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

