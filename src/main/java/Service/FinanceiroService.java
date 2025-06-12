package Service;

import DTO.PagamentoDTO;
import Entity.Despesa;
import Entity.Payment;
import Validation.FORMAT;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;
import static Repository.FinanceiroRepository.*;

public class FinanceiroService {

    public static void cadastrarPagamentoService(Payment pagamento) {
        cadastrarPagamentoRepository(pagamento);
    }

    public static void cadastrarDespesaService(JTextField descricaoField, JTextField valorField, JTextField dataField) {
        Despesa newDespesa = new Despesa();
        newDespesa.setDescricao(descricaoField.getText());
        newDespesa.setValor(Double.parseDouble(valorField.getText()));
        newDespesa.setData(FORMAT.converterData(dataField.getText()));

        cadastrarDespesaRepository(newDespesa);
    }

    public static List<PagamentoDTO> listarDadosPagamentoService() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataMenos30 = dataAtual.minusDays(30);

        return listarDadosPagamentoRepository(dataAtual, dataMenos30);
    }

    public static List<Despesa> ListarDespesaService() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataMenos30 = dataAtual.minusDays(30);

        return ListarDespesasRepository(dataAtual, dataMenos30);
    }
}
