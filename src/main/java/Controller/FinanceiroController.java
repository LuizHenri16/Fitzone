package Controller;

import Entity.Despesa;
import Service.FinanceiroSerivce;
import Validation.DIALOG;
import View.AvisoForm;

import javax.swing.*;

public class FinanceiroController {

    public static void cadastrarDespesaController(JTextField descricaoField,JTextField valorField, JTextField dataField ) {

        if (descricaoField.getText().isBlank() && valorField.getText().isBlank() && dataField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Preencha os campos para adicionar uma despesa");
        } else if (descricaoField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a descrição da despesa");
        } else if (valorField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite o valor da despesa");
        } else if (dataField.getText().isBlank()) {
            DIALOG.exbirMensagem(null, "Digite a data em que ocorreu a despesa");
        } else {
            FinanceiroSerivce.cadastrarDespesaService();
        }
    }

    public static void listarDadosPagamentoRepository() {

    }

    public static void cadastrarDespesaRepository(Despesa despesa) {

    }

    public static void ListarDespesasRepository() {

    }

    public static void valorTotalDespesa() {

    }

    public static void valorTotalReceita() {

    }
}
