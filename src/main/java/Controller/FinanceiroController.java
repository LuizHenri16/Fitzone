package Controller;

import DTO.PagamentoDTO;
import Entity.Despesa;
import Entity.Payment;
import Service.FinanceiroService;
import Validation.DIALOG;
import Validation.FORMAT;

import javax.swing.*;
import java.util.List;

public class FinanceiroController {
    
    public static void cadastrarPagamentoController(Payment pagamento) {
        FinanceiroService.cadastrarPagamentoService(pagamento);
    }

    public static void cadastrarDespesaController(JTextField descricaoField,JTextField valorField, JFormattedTextField dataField ) {

        if (descricaoField.getText().isBlank() && valorField.getText().isBlank() && dataField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Preencha os campos para adicionar uma despesa");
        } else if (descricaoField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a descrição da despesa");
        } else if (valorField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o valor da despesa");
        } else if (FORMAT.formatarData(dataField.getText()).isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a data em que ocorreu a despesa");
        } else {
            FinanceiroService.cadastrarDespesaService(descricaoField, valorField, dataField);
        }
    }

    public static List<PagamentoDTO>listarDadosPagamentoController() {
        return  FinanceiroService.listarDadosPagamentoService();
    }

    public static List<Despesa> ListarDespesasController() {
        return FinanceiroService.ListarDespesaService();
    }


}
