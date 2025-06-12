package Controller;

import DTO.PagamentoDTO;
import Entity.Despesa;
import Entity.Payment;
import Validation.DIALOG;
import Validation.FORMAT;

import javax.swing.*;
import java.util.List;
import static Service.FinanceiroService.*;

public class FinanceiroController {

    public static void postPaymentController(Payment pagamento) {

        cadastrarPagamentoService(pagamento);

    }

    public static void cadastrarDespesaController(JTextField descricaoField, JTextField valorField, JFormattedTextField dataField) {

        if (descricaoField.getText().isBlank() && valorField.getText().isBlank() && dataField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Preencha os campos para adicionar uma despesa");
        } else if (descricaoField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a descrição da despesa");
        } else if (valorField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o valor da despesa");
        } else if (FORMAT.formatarData(dataField.getText()).isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a data em que ocorreu a despesa");
        } else {
            cadastrarDespesaService(descricaoField, valorField, dataField);
        }

    }

    public static List<PagamentoDTO> listarDadosPagamentoController() {

        return listarDadosPagamentoService();

    }

    public static List<Despesa> ListarDespesasController() {

        return ListarDespesaService();

    }
}
