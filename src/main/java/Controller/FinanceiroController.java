package Controller;

import Entity.Despesa;
import Service.FinanceiroSerivce;
import Validation.DIALOG;
import Validation.FORMAT;
import View.AvisoForm;

import javax.swing.*;
import java.util.List;

public class FinanceiroController {

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
            FinanceiroSerivce.cadastrarDespesaService(descricaoField, valorField, dataField);
        }
    }

    public static void listarDadosPagamentoController() {

    }

    public static List<Despesa> ListarDespesasController() {
        return FinanceiroSerivce.ListarDespesasService();
    }

    public static void valorTotalDespesa() {

    }

    public static void valorTotalReceita() {

    }
}
