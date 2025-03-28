package Controller;

import Entity.Despesa;
import Service.FinanceiroSerivce;
import View.AvisoForm;

import javax.swing.*;

public class FinanceiroController {

    public static void cadastrarDespesaController(JTextField descricaoField,JTextField valorField, JTextField dataField ) {

        if (descricaoField.getText().isBlank() && valorField.getText().isBlank() && dataField.getText().isBlank()) {
            new AvisoForm(null, true, "Preencha os campos para adicionar uma despesa").setVisible(true);
        } else if (descricaoField.getText().isBlank()) {
            new AvisoForm(null, true, "Digite a descrição da despesa").setVisible(true);
        } else if (valorField.getText().isBlank()) {
            new AvisoForm(null, true, "Digite o valor da despesa").setVisible(true);
        } else if (dataField.getText().isBlank()) {
            new AvisoForm(null, true, "Digite a data em que ocorreu a despesa").setVisible(true);
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
