package Service;

import Entity.Despesa;
import Repository.FinanceiroRepository;
import Validation.FORMAT;

import javax.swing.*;
import java.util.List;

public class FinanceiroSerivce {

    public static void cadastrarDespesaService(JTextField descricaoField, JTextField valorField, JTextField dataField) {
        Despesa newDespesa = new Despesa();
        newDespesa.setDescricao(descricaoField.getText());
        newDespesa.setValor(Double.parseDouble(valorField.getText()));
        newDespesa.setData(FORMAT.converterData(dataField.getText()));

        FinanceiroRepository.cadastrarDespesaRepository(newDespesa);
    }

    public static void listarDadosPagamentoService() {

    }

    public static void cadastrarDespesService(Despesa despesa) {
        FinanceiroRepository.cadastrarDespesaRepository(despesa);
    }

    public static List<Despesa> ListarDespesasService() {
        return FinanceiroRepository.ListarDespesasRepository();
    }

    public static void valorTotalDespesa() {

    }

    public static void valorTotalReceita() {

    }
}
